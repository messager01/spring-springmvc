package com.spx.service.impl;

import com.spx.dao.AccountDao;
import com.spx.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * create by Shipeixin on 2020/4/16 15:04
 */
@Service

public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDao accountDao;


    @Transactional(isolation = Isolation.REPEATABLE_READ)
    @Override
    public void transferMoney(String from, String to, Double money) {
        accountDao.addMoney(to,money);
        //int i = 1 / 0;
        accountDao.minusMoney(from,money);
    }
}
