package com.lixiaohao.test.dateTime;

import org.junit.Test;

import java.time.Clock;

/**
 * @program: mytest
 * @description:
 * @author: xiaohao.li
 * @create: 2018-07-02 10:19
 **/

public class TestClock {

    @Test
    public void test001(){
        Clock clock = Clock.systemDefaultZone();
        long millis = clock.millis();
        System.out.println(millis);
        System.out.println(System.currentTimeMillis());
    }

}
