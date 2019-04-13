package edu.hunau.cxb17.annotation.dao;

import org.springframework.stereotype.Repository;

@Repository("userDao")   //持久层使用(userDaoImpl)
public class UserDaoImpl implements UserDao{

    @Override
    public void findAll(){
        System.out.println("UserDao#findAll");
    }
}
