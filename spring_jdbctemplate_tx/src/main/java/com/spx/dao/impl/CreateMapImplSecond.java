package com.spx.dao.impl;

import com.spx.dao.CreateMap;
import org.springframework.stereotype.Repository;

/**
 * create by Shipeixin on 2020/4/16 17:52
 */

@Repository(value = "second")
public class CreateMapImplSecond implements CreateMap {
    @Override
    public void sout() {
        System.out.println(2222);
    }
}
