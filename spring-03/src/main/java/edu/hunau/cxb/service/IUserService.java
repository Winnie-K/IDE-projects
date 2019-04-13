package edu.hunau.cxb.service;

import edu.hunau.cxb.pojo.User;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional //加入事务的管理，声明该UserService为一个切面
public interface IUserService{

    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED,
                    readOnly = false,rollbackFor = {Exception.class,RuntimeException.class})
    public User saveUser(User u) throws Exception;

    public List<User> queryByLikeName(String name);
}
