package com.lixiaohao.test.decimalfromat;

import org.junit.Test;

import java.text.DecimalFormat;
import java.text.NumberFormat;

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


}
