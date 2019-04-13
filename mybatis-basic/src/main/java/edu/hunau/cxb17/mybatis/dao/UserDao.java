package edu.hunau.cxb17.mybatis.dao;
import edu.hunau.cxb17.mybatis.pojo.User;

/*定义操作t_user表的基本规则*/
public interface UserDao {
    /*向数据库中插入一个user对象*/
    public void insertUser(User user);
}
