package edu.hunau.cxb.spring.test;

import edu.hunau.cxb.dao.IUserDao;
import edu.hunau.cxb.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:jdbc.xml"})
public class UserDaoTest {

    @Autowired
    private IUserDao userDao;

    @Test
    public void saveUser(){
        User u = new User();
        u.setUsername("lllllllly");
        u.setPwd("222");

        userDao.save(u);
    }

    @Test
    public void saveUserReturnPK(){
        User u = new User();
        u.setUsername("言雨璇大傻逼");
        u.setPwd("250");

        Integer id = userDao.saveReturnPK(u);
        System.out.println(id);
    }

    @Test
    public void queryById(){
        User u = userDao.queryById(11);
        System.out.println(u);
    }
}
