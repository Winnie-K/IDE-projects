package edu.hunau.cxb17.service;

import edu.hunau.cxb17.demo.ElDemo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ElTest {
    private ApplicationContext context;

    @Before
    public void  init(){
        context = new ClassPathXmlApplicationContext("el.xml");
    }

    @Test
    public void testEl(){
        ElDemo elDemo = context.getBean("elDemo",ElDemo.class);
        System.out.println(elDemo);
    }

}
