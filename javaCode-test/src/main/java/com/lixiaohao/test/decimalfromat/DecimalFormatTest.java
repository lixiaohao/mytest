package com.lixiaohao.test.decimalfromat;

import org.junit.Test;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @program: mytest
 * @description:
 * @author: xiaohao.li
 * @create: 2018-06-21 16:40
 **/

public class DecimalFormatTest {

    @Test
    public void decimalTest0(){
        double d=3215.3241;
        DecimalFormat format = new DecimalFormat("he##.00\u00A4");

        System.out.println(format.format(d));

    }

    @Test
    public void decimalTest1(){

        List<Integer> temp  = new ArrayList<>();
        List<Integer> list  = null;
        temp.addAll(list);



    }


}
