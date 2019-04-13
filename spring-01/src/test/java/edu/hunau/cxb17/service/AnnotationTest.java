package edu.hunau.cxb17.service;


import edu.hunau.cxb17.annotation.Moo;
import edu.hunau.cxb17.annotation.service.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {

    private ApplicationContext context;

    @Before
    public void init(){
        context  = new ClassPathXmlApplicationContext("annotation.xml");
    }

    @Test
    public void test01(){
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
    }

    @Test
    public void test02(){
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        Moo moo = context.getBean("moo",Moo.class);
        System.out.println(moo);
    }

    @Test
    public void test03(){
        UserServiceImpl userBiz = context.getBean("userServiceImpl",UserServiceImpl.class);
        userBiz.showAll();
    }
}
