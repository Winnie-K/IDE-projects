package edu.hunau.cxb17.mybatis.test;

import edu.hunau.cxb17.mybatis.pojo.User;
import edu.hunau.cxb17.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;

import org.junit.Test;

public class UserDaoTest {
    @Test
    public void insertUser(){
        User u=new User();
        u.setUsername("jerry");
        u.setGender("M");
        u.setPwd("250");
        SqlSession sqlSession=null;
        try {
            sqlSession = SqlSessionUtils.openSession();
            sqlSession.insert("userDao.insertUser",u);
            //System.out.println(sqlSession.getConnection());
            sqlSession.commit();//成功提交
        }catch(Exception e){
            e.printStackTrace();
            if(sqlSession!=null)
                sqlSession.rollback();
        }finally{
            if(sqlSession!=null){
                sqlSession.close();
            }
        }

    }

}
