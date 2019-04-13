package edu.hunau.cxb17.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/*
 * 获得SqlSession实例的工具类
 * alt+回车  导包
 * */
public class SqlSessionUtils{
private static SqlSessionFactory sessionFactory;
static{
        try(InputStream stream = Resources.getResourceAsStream("mybatis-config.xml")){
           sessionFactory = new SqlSessionFactoryBuilder().build(stream);
        }catch(IOException e){
           throw new RuntimeException(e);
        }
}

//返回一个新的SqlSession的实例
public static SqlSession openSession(){
        return sessionFactory.openSession();
        }
}