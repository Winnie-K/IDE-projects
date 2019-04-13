package edu.hunau.cxb.dao;

import edu.hunau.cxb.pojo.User;

import java.util.List;

public interface IUserDao {

    public void update(User u);
    public void delete(User u);
    public void save(User u);
    public void saveBatch(List<User> users);//批量删除数据

    public List<User> queryBypage(int begin,int size);//进行分页查询

    public Integer saveReturnPK(User u);
    public List<User> queryAllUsers();
    public User queryById(Integer id);

    public List<User> queryByLikeName(String datas);

}
