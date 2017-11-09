package com.lixiaohao.test.other;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by xiaohao.li on 2017/8/17.
 */
public class Regex {

    @Test
    public void regexTest ( ) {
        String arg = "20003378:常熟_洋 蕾商场,2000180913:上海金山商场";
        String regex = "^(\\d+[:][\\u4e00-\\u9fa5\\w\\s]+[,])*(\\d+[:][\\u4e00-\\u9fa5\\w\\s]+)$";

        Pattern pattern = Pattern.compile( regex );
        Matcher matcher = pattern.matcher( arg );

        boolean flag = matcher.matches();

        System.out.println(flag);

    }

    @Test
    public void splidTest () {
        String ss = "414,2414,";
        String[] arr = ss.split(",");

        List<String > list = Arrays.asList(arr);
        for (String s:list ) {
            System.out.println("1:"+s);
        }
    }

}
