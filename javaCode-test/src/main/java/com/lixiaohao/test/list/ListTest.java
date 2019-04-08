package com.lixiaohao.test.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @program: mytest
 * @description:
 * @author: xiaohao.li
 * @create: 2019-03-07 16:56
 **/

public class ListTest {


    /***
     * 测试
     * ArrayList 初始化时确定长度，当实际存储数据大于初始化长度时的情况
     */
    @Test
    public void test001(){

        List<Long> list = new ArrayList<>(50);

        for ( int i = 0;i<20;i++ ) {
            list.add(Long.valueOf(i));
        }

        System.out.println("list的长度:"+list.size());


    }


    @Test
    public void iteratorTest(){
        List<Long> list = new ArrayList<>();
        list.add(1L);
        list.add(2L);
        list.add(3L);
        list.add(2L);
        list.add(5L);


        for ( Long l : list ) {
            System.out.println(l);
        }

        Iterator<Long> iterator = list.iterator();
        while (iterator.hasNext()) {
            if ( iterator.next().equals(2L) ) {
                iterator.remove();;
            }
        }

        System.out.println("============================");

        for ( Long l : list ) {
            System.out.println(l);
        }
    }

}
