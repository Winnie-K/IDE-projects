package edu.hunau.cxb.sm.mapper;

import edu.hunau.cxb.sm.pojo.Order;

import java.util.List;

public interface OrderMapper {
    public void insertOrder(Order order);

    public Order queryById(String id);

    //级联查询出用户信息
    public Order queryByIdCacheUser(String id);

    //根据用户id查询订单信息
    public List<Order> queryByUserId(Integer id);



}
