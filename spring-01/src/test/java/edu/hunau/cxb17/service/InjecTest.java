package edu.hunau.cxb17.service;

import edu.hunau.cxb17.demo.Foo;
import edu.hunau.cxb17.demo.InjectConstructDemo;
import edu.hunau.cxb17.demo.PCBean;
import edu.hunau.cxb17.life.BeanLife;
import edu.hunau.cxb17.service.impl.InjectBeanSetter;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class InjecTest {
    private ApplicationContext context;

    @Test
    public void init(){
        context=new ClassPathXmlApplicationContext("beans.xml");
    }

    @Test
    public void testPC(){
        init();
        PCBean b1 = context.getBean("pcBean",PCBean.class);
        PCBean b2 = context.getBean("pcBean2",PCBean.class);
        System.out.println(b1);
        System.out.println(b2);
    }

    @Test
    public void testFactory(){
        init();
        PCBean pcBean = context.getBean("staticBean",PCBean.class);
        System.out.println(pcBean);
    }


    @Test
    public void setterDemo(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        InjectBeanSetter setterDemo = context.getBean("setterDemo",InjectBeanSetter.class);
        System.out.println(setterDemo);

        System.out.println(Arrays.toString(setterDemo.getArray()));
        System.out.println(setterDemo.getLists());
        System.out.println(setterDemo.getSets());
        System.out.println(setterDemo.getMaps());
        System.out.println(setterDemo.getProes());
    }

    @Test
    public void constructDemo(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        InjectConstructDemo bean = context.getBean("injectCons",InjectConstructDemo.class);
        System.out.println(bean);
    }

    @Test
    public void fooTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("---context初始化完毕-----");
        Foo f1 = context.getBean("fooSingeton",Foo.class);
        System.out.println(f1);
        //在context关闭之后，Foo会自动销毁
        context.close();
    }

    @Test
    public  void lifeTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("life.xml");
        System.out.println("------context初始化完毕");
        BeanLife life = context.getBean("life", BeanLife.class);
        life.doSometing();
        context.close();
    }
}
