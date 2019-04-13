package edu.hunau.cxb17.service;

import edu.hunau.cxb17.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class UserServiceTest {

    @Test
    public void testBefore(){
        //获得UserService的实例
        UserService userBiz = new UserServiceImpl();
        userBiz.regist();
    }

    @Test
    public void testNow(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //获得容器对象中所有实例的名称
        String[] beanNames = applicationContext.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanNames));
        UserService userBiz = applicationContext.getBean("userBiz",UserService.class);
        userBiz.regist();
    }

    @Test
    public void testInit(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("---ApplicationContext实例化完成---");
        //String[] beanNames = applicationContext.getBeanDefinitionNames();
        //System.out.println(Arrays.toString(beanNames));
        //UserService userBiz = applicationContext.getBean("userBiz",UserService.class);
        //userBiz.regist();
    }
}
