package edu.hunau.cxb17.mybatis.test;

import edu.hunau.cxb17.mybatis.mapper.UserMapper;
import edu.hunau.cxb17.mybatis.pojo.QueryCriteria;
import edu.hunau.cxb17.mybatis.pojo.User;
import edu.hunau.cxb17.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

public class TestUserMapper {

    @Test
    public void insertUser(){
        User u=new User();
        u.setUsername("乔治");
        u.setGender("M");
        u.setPwd("250");
        SqlSession sqlSession=null;
        try {
            sqlSession=SqlSessionUtils.openSession();
            //获得UserMapper的动态代理对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            System.out.println(userMapper.getClass());
            System.out.println("insert执行之前:"+u.getId());
            userMapper.insertUser(u);
            //执行完成之后，自动将id值封装到当前的对象中
            System.out.println("insert执行之后:"+u.getId());

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
    public void insertUsers(){
        User u1=new User();
        u1.setUsername("苏西");
        u1.setGender("M");
        u1.setPwd("250");

        User u2=new User();
        u2.setUsername("佩德罗");
        u2.setGender("M");
        u2.setPwd("250");

        User u3=new User();
        u3.setUsername("猪爸爸");
        u3.setGender("M");
        u3.setPwd("250");

        ArrayList<User> users = new ArrayList<User>();
        Collections.addAll(users,u1,u2,u3);


        SqlSession sqlSession=null;
        try {
            sqlSession=SqlSessionUtils.openSession();
            //获得UserMapper的动态代理对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            System.out.println(userMapper.getClass());

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
    public void deleteById(){
        SqlSession sqlSession=null;
        try {
            sqlSession=SqlSessionUtils.openSession();
            //获得UserMapper的动态代理对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            System.out.println(userMapper.getClass());

            userMapper.deleteById(10);
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
    public void updateById(){
        User u = new User();
        u.setId(9);
        u.setGender("F");

        SqlSession sqlSession=null;
        try {
            sqlSession=SqlSessionUtils.openSession();
            //获得UserMapper的动态代理对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            System.out.println(userMapper.getClass());
            userMapper.updateById(u);
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
    public void selectById(){
        SqlSession sqlSession=null;
        try {
            sqlSession=SqlSessionUtils.openSession();
            //获得UserMapper的动态代理对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            System.out.println(userMapper.getClass());

            User user = userMapper.selectById(4);
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

    @Test
    public void queryByAll(){
        SqlSession sqlSession=null;
        try {
            sqlSession=SqlSessionUtils.openSession();
            //获得UserMapper的动态代理对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            System.out.println(userMapper.getClass());

            List<User> users= userMapper.queryByAll();
            users.forEach(System.out::println);

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
    public void queryByLikeName(){
        SqlSession sqlSession=null;
        try {
            sqlSession=SqlSessionUtils.openSession();
            //获得UserMapper的动态代理对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            System.out.println(userMapper.getClass());

            List<User> users= userMapper.queryByLikeName("猪");
            users.forEach(System.out::println);

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
    public void selectDatas(){
        SqlSession sqlSession=null;
        try {
            sqlSession=SqlSessionUtils.openSession();
            //获得UserMapper的动态代理对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            System.out.println(userMapper.getClass());

            HashMap<String,String> datas = new HashMap<>();
            //封装数据
            datas.put("name","haoren");
            datas.put("password","250");

            User u = userMapper.queryByUserNameAndPwdMap(datas);
            System.out.println(u);

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
    public void queryByUserProperty(){
        SqlSession sqlSession=null;
        try {
            sqlSession=SqlSessionUtils.openSession();
            //获得UserMapper的动态代理对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            System.out.println(userMapper.getClass());

            QueryCriteria qc =new QueryCriteria();
            User u = new User();
            u.setUsername("haoren");
            qc.setUser(u);
            List<User> users = userMapper.queryByUserProperty(qc);
            users.forEach(System.out::println);

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
    public void queryByUserIds(){
        SqlSession sqlSession=null;
        try {
            sqlSession=SqlSessionUtils.openSession();
            //获得UserMapper的动态代理对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            System.out.println(userMapper.getClass());

            QueryCriteria qc =new QueryCriteria();
            List<Integer> ids =  new ArrayList<>();
            Collections.addAll(ids,3,4,5,6);
            qc.setIds(ids);
            List<User> users=userMapper.queryByUserIds(qc);
            users.forEach(System.out::println);

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

//------------------------------------------------------
    @Test
    public void queryByIdCacheOrders(){
        SqlSession sqlSession=null;
        try {
            sqlSession=SqlSessionUtils.openSession();
            //获得UserMapper的动态代理对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            System.out.println(userMapper.getClass());

             User user = userMapper.queryByIdCacheOrders(3);
             System.out.println(user);
             user.getOrders().forEach(System.out::println);

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
    public void selectByIdLoad(){
        SqlSession sqlSession=null;
        try {
            sqlSession=SqlSessionUtils.openSession();
            //获得UserMapper的动态代理对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            System.out.println(userMapper.getClass());

            User user=userMapper.queryByIdLoadOrders(3);
            System.out.println(user);
            user.getOrders().forEach(System.out::println);

            /*
            * sqlSession=SqlSessionUtils.openSession();
            //获得UserMapper的动态代理对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            User user = UserMapper.queryByIdLoadOrders(3);
            System.out.println(user);
            System.out.println("====再次执行查询");

            System.out.println("====缓存已清空");
            SqlSession other = SqlSessionUtils.openSession();
            UserMapper mapper2 =other.getMapper(UserMapper.class);
            User u =mapper2.queryByIdLoadOrders(3);
            System.out.println(u);
            * */

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
