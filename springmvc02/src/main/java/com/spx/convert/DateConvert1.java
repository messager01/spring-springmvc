package com.spx.convert;

import com.sun.tools.javac.util.Convert;
import org.springframework.core.convert.converter.Converter;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * create by Shipeixin on 2020/4/18 19:56
 */
public class DateConvert1 implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        if (source != null && !"".equals(source)){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            try {
                return simpleDateFormat.parse(source);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
