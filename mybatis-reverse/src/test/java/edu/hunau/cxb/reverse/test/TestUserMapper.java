package edu.hunau.cxb.reverse.test;


import edu.hunau.cxb.wf.pojo.mapper.UserMapper;
import edu.hunau.cxb.wf.pojo.utils.SqlSessionUtils;
import edu.hunau.cxb.wf.pojo.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class TestUserMapper {

    @Test
    public void insertUser(){ //增加数据
        SqlSession sqlSession=null;
        try {
            sqlSession= SqlSessionUtils.openSession();
            //获得UserMapper的动态代理对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            System.out.println(userMapper);

            User u=new User();
            u.setId("007");
            u.setUsername("智障");
            u.setPwd("6600");
            u.setEmail("131633356@qq.com");
            u.setName("www");
            u.setGender("女");

            userMapper.insert(u);
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

    @Test
    public void deleteById(){//删除数据
        SqlSession sqlSession=null;
        try {
            sqlSession=SqlSessionUtils.openSession();
            //获得UserMapper的动态代理对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            System.out.println(userMapper.getClass());

            userMapper.deleteByPrimaryKey("001");
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

    @Test
    public void insertUsers(){//插入多条数据
        SqlSession sqlSession=null;
        try {
            sqlSession=SqlSessionUtils.openSession();
            //获得UserMapper的动态代理对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            System.out.println(userMapper.getClass());

            User u1=new User();
            u1.setId("003");
            u1.setUsername("爱美丽");
            u1.setPwd("2300");
            u1.setEmail("1111638256@qq.com");
            u1.setName("yuxuan");

            User u2=new User();
            u2.setId("004");
            u2.setUsername("佩德罗");
            u2.setPwd("2400");
            u2.setEmail("1221638256@qq.com");
            u2.setName("yany");

            User u3=new User();
            u3.setId("005");
            u3.setUsername("傻子");
            u3.setPwd("2300");
            u3.setEmail("1431638256@qq.com");
            u3.setName("yan");

            ArrayList<User> users = new ArrayList<User>();
            Collections.addAll(users,u1,u2,u3);

            userMapper.insertUserBatch(users);

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

    @Test
    public void updateById(){//更改数据
        SqlSession sqlSession=null;
        try {
            sqlSession=SqlSessionUtils.openSession();
            //获得UserMapper的动态代理对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            System.out.println(userMapper.getClass());

            User u = new User();
            u.setId("006");
            u.setPwd("211");
            u.setGender("女");
            u.setName("sss");
            userMapper.updateByPrimaryKey(u);
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

    @Test
    public void selectById(){ //查询数据
        SqlSession sqlSession=null;
        try {
            sqlSession=SqlSessionUtils.openSession();
            //获得UserMapper的动态代理对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            System.out.println(userMapper.getClass());

            User user = userMapper.selectByPrimaryKey("007");
            System.out.println(user);

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
