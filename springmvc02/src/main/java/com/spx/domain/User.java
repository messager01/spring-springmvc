package com.spx.domain;

import lombok.Data;

import java.util.List;

/**
 * create by Shipeixin on 2020/4/18 18:00
 */

@Data
public class User {

    private String user_name;
    private String user_age;

    private Dog dog;

    private List<Dog> dogs;
}
