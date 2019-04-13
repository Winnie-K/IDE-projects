package edu.hunau.cxb17.mybatis.test;

import edu.hunau.cxb17.mybatis.mapper.OrderMapper;
import edu.hunau.cxb17.mybatis.mapper.UserMapper;
import edu.hunau.cxb17.mybatis.pojo.Order;
import edu.hunau.cxb17.mybatis.pojo.User;
import edu.hunau.cxb17.mybatis.utils.SqlSessionUtils;
import edu.hunau.cxb17.mybatis.utils.UUIDUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class TestOrderMapper {

    @Test
    public void insertOrder(){
       Order o=new Order();
       o.setId(UUIDUtils.uuid());
       o.setNums(3);
       o.setTotal(7788.00);

       //设置用户信息
        User u=new User();
        u.setId(3);
        o.setU(u);

        SqlSession sqlSession=null;
        try {
            sqlSession=SqlSessionUtils.openSession();
            //获得UserMapper的动态代理对象
            OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
            System.out.println(orderMapper.getClass());

            orderMapper.insertOrder(o);
            //执行完成之后，自动将id值封装到当前的对象中

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
    public void queryByIdCacheUser(){
        SqlSession sqlSession=null;
        try {
            sqlSession=SqlSessionUtils.openSession();
            //获得UserMapper的动态代理对象
            OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
            System.out.println(orderMapper.getClass());

            Order order = orderMapper.queryByIdCacheUser("16f1cc1e10d34fc2ab8c3c38042c206d");
            System.out.println(order);
            System.out.println(order.getU());

            /*
            * SqlSession otherSession = SqlSessionUtils.openSession();
            * OrderMapper otherOrder = otherSession.getMapper(OrderMapper.class);
            * Order o2 = otherOrder.queryById("");
            *
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


    @Test
    public void selectByUserId(){
        SqlSession sqlSession=null;
        try {
            sqlSession=SqlSessionUtils.openSession();
            //获得UserMapper的动态代理对象
            OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
            System.out.println(orderMapper.getClass());

            List<Order> orders = orderMapper.queryByUserId(5);
            orders.forEach(System.out::println);

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
