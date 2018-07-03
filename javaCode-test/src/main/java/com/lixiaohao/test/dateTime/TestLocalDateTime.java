package com.lixiaohao.test.dateTime;

import org.junit.Test;
import org.springframework.format.datetime.joda.LocalDateParser;
import org.springframework.format.datetime.joda.LocalDateTimeParser;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @program: mytest
 * @description:
 * @author: xiaohao.li
 * @create: 2018-07-02 10:54
 **/

public class TestLocalDateTime {

    /***
     * 获取当前时间
     */
    @Test
    public void test001(){
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.toString());

    }

    /***
     * 时间转化为字符串
     */

    @Test
    public void test002(){
        String format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS").format(LocalDateTime.now());
        System.out.println(format);
    }


    /***
     * 获取一天后时间
     */
    @Test
    public void test003(){
        LocalDateTime now = LocalDateTime.now();
        System.out.println("现在时间:"+now.toString());

        LocalDateTime plus = now.plus(1, ChronoUnit.DAYS);
        System.out.println("一天后日期:"+plus.toString());
    }

}
