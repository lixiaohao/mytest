package com.lixiaohao.test.other;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by xiaohao.li on 2017/8/30.
 */
public class MapTest {

    @Test
    public void test001(){
        Map<String,String> map = new HashMap<>();
        map.put("001","001value");
        map.put("002","002value");
        map.put("003","003value");
        System.out.println(new ArrayList<>(map.values()));
    }
}
