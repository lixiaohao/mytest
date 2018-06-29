package com.lixiaohao.test.gc;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: mytest
 * @description:
 * @author: xiaohao.li
 * @create: 2018-06-25 16:56
 **/

public class TestGC {

    @Test
    public void TestGC(){
        int i = 100000000;
        List<Map<String,String>> list = new ArrayList<>();

        for (int j= 0;j<i;j++) {
            Map<String,String> map = new HashMap<>();
            map.put("key1","11223456789008875432123456789098765431");
            map.put("key2","11223456789008875432123456789098765431");
            map.put("key3","11223456789008875432123456789098765431");
            map.put("key4","11223456789008875432123456789098765431");
            map.put("key5","11223456789008875432123456789098765431");
            map.put("key6","11223456789008875432123456789098765431");
            map.put("key7","11223456789008875432123456789098765431");
            list.add(map);
        }
        System.out.println("test===>>");
    }



    @Test
    public void TestThis(){

        GCModel model = new GCModel();

        model.out();
    }

}
