package edu.hunau.cxb17.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextTest {

    @Test
    public void applicationTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println(context);

    }
}