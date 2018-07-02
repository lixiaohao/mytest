package com.lixiaohao.test.dateTime;

import org.junit.Test;

import java.time.LocalTime;

/**
 * @program: mytest
 * @description:
 * @author: xiaohao.li
 * @create: 2018-07-02 10:14
 **/

public class TestLocalTime {

    @Test
    public void test001(){
        LocalTime now = LocalTime.now();
        System.out.println(now.toString());
    }

}
