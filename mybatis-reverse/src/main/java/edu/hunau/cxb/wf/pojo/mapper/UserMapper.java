package edu.hunau.cxb.wf.pojo.mapper;

import edu.hunau.cxb.wf.pojo.pojo.User;
import edu.hunau.cxb.wf.pojo.pojo.UserExample;
import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    /*向数据库中插入多个User对象*/
    public  void insertUserBatch(ArrayList<User> users);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}