package com.lixiaohao.test.dateTime;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @program: mytest
 * @description:
 * @author: xiaohao.li
 * @create: 2018-07-02 10:54
 **/

public class TestLocalDateTime {

    @Test
    public void test001(){
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now.toString());

    }

    @Test
    public void test002(){
        LocalDateTime now = LocalDateTime.now();
        System.out.println("现在时间:"+now.toString());

        LocalDateTime plus = now.plus(1, ChronoUnit.DAYS);
        System.out.println("一天后日期:"+plus.toString());
    }

}
