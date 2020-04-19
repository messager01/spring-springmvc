package com.spx.springboot_tx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class SpringbootTxApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTxApplication.class, args);
    }

}
