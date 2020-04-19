package com.spx.springboot_tx.service.impl;

import com.spx.springboot_tx.dao.AccountDao;
import com.spx.springboot_tx.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

/**
 * create by Shipeixin on 2020/4/16 18:38
 */

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDao accountDao;

    @Transactional(isolation = Isolation.REPEATABLE_READ)
    @Override
    public void transfor(String from, String to, Double money) {

        accountDao.addMoney(to,money);
        int i = 1 / 0;
        accountDao.minusMoney(from,money);

    }
}
