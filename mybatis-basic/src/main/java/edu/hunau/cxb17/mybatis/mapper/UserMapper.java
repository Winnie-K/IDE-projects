package edu.hunau.cxb17.mybatis.mapper;

import com.sun.javafx.collections.MappingChange;
import edu.hunau.cxb17.mybatis.pojo.QueryCriteria;
import edu.hunau.cxb17.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*为对应的实体类提供Mapper接口，定义操作规则*/
public interface UserMapper {
    /*向数据库中插入一个User对象
    * 如果需要获得自主管理的主键值，必须返回对象类型*/
    public void insertUser(User user);

    /*向数据库中插入多个User对象*/
    public  void insertUserBatch(ArrayList<User> users);

    public void deleteById(Integer id);
    public void updateById(User user);

    public User selectById(Integer id);

    public List<User> queryByAll();

    public List<User> queryByLikeName(String name);

    /*public User queryByUserNameAndPwd(String username,String pwd);*/

    //根据用户名和密码
    public User queryByUserNameAndPwd(@Param("name") String username, @Param("password") String pwd);

    public User queryByUserNameAndPwdMap(Map<String,String> datas);

    public List<User> queryByUserProperty(QueryCriteria qc);

    public List<User> queryByUserIds(QueryCriteria qc);//根据多个id查询用户信息

  //-------------------------------------------------
    public User queryByIdCacheOrders(Integer id);//根据用户的编号将用户以及该用户关联的订单都查询出来

    public User queryByIdLoadOrders(Integer id);
}
