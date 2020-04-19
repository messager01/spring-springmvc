package com.spx.springboot_tx.dao;

/**
 * create by Shipeixin on 2020/4/16 14:57
 */
public interface AccountDao {

    //  加钱
    void addMoney(String name, Double money);

    // 减钱
    void minusMoney(String name, Double money);
}
