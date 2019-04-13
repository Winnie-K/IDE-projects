package edu.hunau.cxb17.service;

import edu.hunau.cxb17.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import java.util.Arrays;

@RunWith(SpringJUnit4ClassRunner.class) //整合JUnit的类
@ContextConfiguration(locations = {"classpath:annotation.xml"})
public class SpringTest {

    @Autowired
    private ApplicationContext context;

    @Test
    public void testContext(){
        String[] names = context.getBeanDefinitionNames();
        System.out.println(Arrays.toString(names));
    }

}
