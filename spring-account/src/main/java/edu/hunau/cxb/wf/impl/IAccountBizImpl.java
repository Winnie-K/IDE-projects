package edu.hunau.cxb.wf.impl;

import edu.hunau.cxb.wf.dao.IAccountDao;
import edu.hunau.cxb.wf.pojo.Account;
import edu.hunau.cxb.wf.service.IAccountBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class IAccountBizImpl implements IAccountBiz {
    @Autowired
    private IAccountDao iAccountDao;
    @Autowired
    private  static org.apache.log4j.Logger logging= org.apache.log4j.LogManager.getLogger(IAccountBizImpl.class);
    @Override
    public void createAccount(Account acc) {
        try {
            iAccountDao.insertAccount(acc);
        }catch (Exception e){
            logging.error(e.getMessage());
        }
    }

    @Override
    public void transferAccount(Integer fromId, Integer targetId, double money) {
        try {
            Account account1= iAccountDao.queryById(fromId);
            double balancy1 = account1.getBalancy();
            BigDecimal b1 = new BigDecimal(Double.toString(balancy1));
            BigDecimal b2 = new BigDecimal(Double.toString(money));
            double v = b1.subtract(b2).doubleValue();
            iAccountDao.updateAccount(fromId,v);
            Account account2= iAccountDao.queryById(targetId);
            double balancy2 = account2.getBalancy();
            BigDecimal b3 = new BigDecimal(Double.toString(balancy2));
            BigDecimal b4 = new BigDecimal(Double.toString(money));
            double v2 = b3.add(b4).doubleValue();
            iAccountDao.updateAccount(targetId,v2);

        }catch (Exception e){
            logging.error(e.getMessage());
        }

    }
}
