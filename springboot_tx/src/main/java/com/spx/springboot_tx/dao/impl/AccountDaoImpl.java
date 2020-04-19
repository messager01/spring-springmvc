package com.spx.springboot_tx.dao.impl;


import com.spx.springboot_tx.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * create by Shipeixin on 2020/4/16 18:17
 */
@Repository
public class AccountDaoImpl implements AccountDao {

    @Autowired
    JdbcTemplate jdbcTemplate;


    @Override
    public void addMoney(String name, Double money) {
        jdbcTemplate.update("update `account` set money = money + ? where `name` = ?",money,name);
    }

    @Override
    public void minusMoney(String name, Double money) {
        jdbcTemplate.update("update `account` set money = money - ? where `name` = ?",money,name);
    }
}
