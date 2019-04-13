package edu.hunau.cxb.reverse.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestConfigFile {

    @Test
    public void readConfigFile(){
        try(InputStream stream = Resources.getResourceAsStream("reverse-config.xml")){
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(stream);
            System.out.println(sessionFactory);
            SqlSession session = sessionFactory.openSession();
            System.out.println(session);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
