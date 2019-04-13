package edu.hunau.cxb.wf.dao;

import edu.hunau.cxb.wf.pojo.Account;
import org.apache.ibatis.annotations.Param;

public interface IAccountDao {

    public void insertAccount(Account acc);

    public void updateAccount(@Param("id") Integer id, @Param("balancy") double balancy);

    public Account queryById(Integer id);
}
