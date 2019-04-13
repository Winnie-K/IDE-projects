package edu.hunau.cxb17.annotation.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserJdbcImpl implements  UserDao{

    @Override
    public void findAll(){
        System.out.println("#UserServiceImple..");
    }
}
