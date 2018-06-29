package com.lixiaohao.test.stream;

import org.junit.Test;

/**
 * @program: mytest
 * @description:
 * @author: xiaohao.li
 * @create: 2018-06-09 09:00
 **/

public class LanbdaTest {

    @Test
    public void  totalTest(){
        int x = 1;
        int y = 2;

        Total total = new Total() {
            @Override
            public int total(int x, int y) {
                return x+y;
            }
        };

        System.out.println( total.total(x,y));

    }



    @Test
    public void  totalTest2(){
        int x = 1;
        int y = 2;

        Total total = (a,b) -> {return  a+b;};

        System.out.println( total.total(x,y));

    }



    @Test
    public void  totalTest3(){
        int x = 1;
        int y = 2;

        Total total = (a,b) -> a+b;

        System.out.println( total.total(x,y));

    }


}
