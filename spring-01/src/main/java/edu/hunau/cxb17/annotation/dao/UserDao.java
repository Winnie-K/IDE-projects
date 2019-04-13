package edu.hunau.cxb17.annotation.dao;


import org.springframework.stereotype.Repository;

@Repository  //持久层使用
public interface UserDao {
     void findAll();
}
