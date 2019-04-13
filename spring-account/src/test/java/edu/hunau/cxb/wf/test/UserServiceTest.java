package edu.hunau.cxb.wf.test;

import edu.hunau.cxb.wf.dao.IAccountDao;
import edu.hunau.cxb.wf.impl.IAccountBizImpl;
import edu.hunau.cxb.wf.pojo.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:beans.xml"})
public class UserServiceTest {
    @Autowired
    private IAccountDao iAccountDao;
    @Autowired
    private IAccountBizImpl  iAccountBizImpl;
    @Test
    public void test() {
        Account account = new Account();
        account.setName("qwwww2");
        account.setBalancy(110.00);
        iAccountDao.insertAccount(account);
    }
    @Test
    public void test2() {
        Account account = iAccountDao.queryById(1001);
        System.out.println(account);
    }
    @Test
    public void test3() {
        iAccountDao.updateAccount(1001,750.00);
    }
    @Test
    public void test4(){
        Account account = new Account();
        account.setName("lwwrn");
        account.setBalancy(450.00);
        iAccountBizImpl.createAccount(account);
    }
    @Test
    public void test5() throws  Exception{
        iAccountBizImpl.transferAccount(1002,1003,50.00);
        //账户1002向1003转账
        /*if (2>1){
            throw new Exception("异常------");
        }
        */
    }
}
