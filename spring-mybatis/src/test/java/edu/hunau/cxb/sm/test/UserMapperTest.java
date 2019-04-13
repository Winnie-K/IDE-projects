package edu.hunau.cxb.sm.test;


import edu.hunau.cxb.sm.mapper.UserMapper;
import edu.hunau.cxb.sm.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:beans.xml"})
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void init(){
        System.out.println(userMapper.getClass());
        List<User> users = userMapper.queryByAll();
        users.forEach(System.out::println);
    }



}
