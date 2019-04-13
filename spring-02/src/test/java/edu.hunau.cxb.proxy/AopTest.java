package edu.hunau.cxb.proxy;

import edu.hunau.cxb.aop.target.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:aop-01.xml"})
public class AopTest {

    @Autowired
    private ApplicationContext context;

    @Test
    public void testAop(){
        String[] names = context.getBeanDefinitionNames();
        System.out.println(Arrays.toString(names));

        UserService userBiz = context.getBean("userBiz",UserService.class);
        UserService userProxy = context.getBean("userProxy",UserService.class);

        userProxy.addUser();
        System.out.println(userBiz.getClass());
        System.out.println(userProxy.getClass());
    }
}
