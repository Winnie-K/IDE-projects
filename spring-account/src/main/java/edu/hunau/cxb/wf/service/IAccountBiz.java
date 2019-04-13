package edu.hunau.cxb.wf.service;

import edu.hunau.cxb.wf.pojo.Account;
import org.springframework.stereotype.Service;

@Service
public interface IAccountBiz {

    public void createAccount(Account acc);

    public void transferAccount(Integer fromId, Integer targetId, double money);
}