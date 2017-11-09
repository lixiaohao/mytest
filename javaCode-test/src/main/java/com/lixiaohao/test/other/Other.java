package com.lixiaohao.test.other;

import org.junit.Test;

/**
 * Created by xiaohao.li on 2017/8/4.
 */
public class Other {
    @Test
    public void otherTtest() {
        Object o = getO();
        String value = (String) o;
        System.out.println();
    }

    private Object getO() {
        Object o = "fdfd";
        if (true) {
            o = null;
        }
        return o;
    }


    @Test
    public void modelTest() {
        Error error = new Error();
    }


}
