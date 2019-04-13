package edu.hunau.cxb.spring.test;

import edu.hunau.cxb.pojo.User;
import edu.hunau.cxb.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:jdbc-tx.xml"})
public class UserServiceTest {

    @Autowired
    private IUserService userBiz;

    @Test
    public void saveUser() throws Exception {
        User u = new User();
        u.setUsername("yanyuxuan傻逼");
        u.setPwd("999999");

        User result = userBiz.saveUser(u);
        System.out.println(result);
    }

}
