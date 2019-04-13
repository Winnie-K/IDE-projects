package edu.hunau.cxb.spring.test;

import edu.hunau.cxb.Log4jDemo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:jdbc.xml"})
public class UseLog4j {

    @Autowired
    Log4jDemo log4jDemo;

    @Test
    public void init(){
        log4jDemo.show();
    }
}
