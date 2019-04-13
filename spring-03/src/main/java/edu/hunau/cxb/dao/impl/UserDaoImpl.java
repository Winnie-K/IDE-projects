package edu.hunau.cxb.dao.impl;

import edu.hunau.cxb.dao.IUserDao;
import edu.hunau.cxb.pojo.User;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserDaoImpl implements IUserDao {

    //对于持久层，注入jdbcTemplate的对象
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //日志记录器
    private static Logger logging = LogManager.getLogger(UserDaoImpl.class);

    @Override
    public void update(User u) {

    }

    @Override
    public void delete(User u) {

    }

    @Override
    public void save(User u) {
        String sql = "insert into t_user(username,pwd) values(?,md5(?))";
        //准备参数:参数提供的顺序必须和sql语句中的问号对应
        Object[] args = {u.getUsername(),u.getPwd()};
        try{
            jdbcTemplate.update(sql,args);
        }catch (Exception e){
            logging.error(e.getMessage());
        }
    }

    @Override
    public void saveBatch(List<User> users) {

    }

    @Override
    public List<User> queryBypage(int begin, int size) {
        return null;
    }

    @Override
    public Integer saveReturnPK(User u) {
        String sql = "insert into t_user(username,pwd) values(?,md5(?))";
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(
                new PreparedStatementCreator() {
                    @Override
                    public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                        //明确主键信息
                        PreparedStatement ps = connection.prepareStatement(sql,new String[] {"id"});
                        ps.setString(1,u.getUsername());
                        ps.setString(2,u.getPwd());
                        return ps;
                    }
                },keyHolder);
        //从keyHolder对象中获得返回值的信息
        return keyHolder.getKey().intValue();
    }

    @Override
    public List<User> queryAllUsers() {
        return null;
    }

    @Override
    public User queryById(Integer id) {
        String sql = "select id,username,pwd,gender,dotime from t_user where id=?";
        return jdbcTemplate.queryForObject(sql,(rs,i) -> {
                //直接操作结果集封装对象
                User u = new User();
                u.setId(rs.getInt("id"));
                u.setPwd(rs.getString("pwd"));
                u.setDotime(rs.getTimestamp("dotime"));
                u.setGender(rs.getString("gender"));
                u.setUsername(rs.getString("username"));
                return u;
        },id);
    }

    @Override
    public List<User> queryByLikeName(String datas) {
        return null;
    }
}
