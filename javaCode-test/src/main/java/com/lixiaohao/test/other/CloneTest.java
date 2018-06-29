package com.lixiaohao.test.other;

import org.junit.Test;

public class CloneTest {


    @Test
    public void cloneabmetest(){
        CloneMode cloneMode = new CloneMode();
        cloneMode.setAge(12);
        cloneMode.setName("张三");

        CloneMode cloneMode1 = cloneMode.clone();
         cloneMode1.setAge(22);
         

         CloneMode cloneMode3 = cloneMode.clone();
        System.out.println(cloneMode3.toString());
    }

}
