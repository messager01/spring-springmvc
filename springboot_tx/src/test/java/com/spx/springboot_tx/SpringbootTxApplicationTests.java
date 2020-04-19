package com.spx.springboot_tx;

import com.spx.springboot_tx.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootTest
class SpringbootTxApplicationTests {


    @Autowired
    JdbcTemplate jdbcTemplatel;

    @Autowired
    AccountService accountService;



    @Test
    public void test(){
        System.out.println(jdbcTemplatel);
    }




    @Test
    public void test2(){
        accountService.transfor("AAA","BBB",10.0);

    }

}
