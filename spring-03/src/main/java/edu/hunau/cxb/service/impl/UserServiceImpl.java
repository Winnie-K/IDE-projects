package edu.hunau.cxb.service.impl;

import edu.hunau.cxb.dao.IUserDao;
import edu.hunau.cxb.pojo.User;
import edu.hunau.cxb.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    @Override
    public User saveUser(User u) throws Exception{
        Integer pk = userDao.saveReturnPK(u);
        u.setId(pk);
        /*
        if(2>1){
            throw new Exception("模拟抛出异常....");
        }
        */

        return u;
    }

    @Override
    public List<User> queryByLikeName(String name){
        return userDao.queryByLikeName(name);
    }
}
