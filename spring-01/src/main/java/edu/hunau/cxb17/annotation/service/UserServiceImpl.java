package edu.hunau.cxb17.annotation.service;

import edu.hunau.cxb17.annotation.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service //注解业务层
public class UserServiceImpl {

    @Autowired //自动注入
    @Qualifier("userDao") //通过指定的名称进一步过滤
    private UserDao userDao;

    public void showAll(){
        System.out.println("#UserServiceImple..");
        userDao.findAll();
    }
}
