package com.lixiaohao.test.other;

import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author: xiaohao.li@chinaredstar.com
 * @Description:
 * @Date: Created in 14:50 2017/11/8
 */
public class HashSetTest {

    @Test
    public void hashSetTest() {
        Set<Long> ids = new HashSet<>();
        ids.add(1L);  ids.add(2L);  ids.add(3L);  ids.add(4L);  ids.add(5L);

        Set<Long> id2 = new HashSet<>();
        ids.add(1L);   ids.add(4L);  ids.add(5L);

        System.out.println( "===============测试 开始===============" );
        System.out.println( ids.containsAll(id2) );
        System.out.println( "===============测试 结束===============" );
    }

}
