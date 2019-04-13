package edu.hunau.cxb17.service.impl;

import edu.hunau.cxb.wf.dao.UserDao;
import edu.hunau.cxb17.service.UserService;

public class UserServiceImpl implements UserService{
    private UserDao userDao;//提供getter和setter方法

    public UserServiceImpl(){
        System.out.println("---UserServiceImpl实例化---");
    }

    @Override
    public void regist(){
        System.out.println("UserService#regist....");
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
