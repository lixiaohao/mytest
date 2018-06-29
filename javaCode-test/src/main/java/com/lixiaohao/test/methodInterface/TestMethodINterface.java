package com.lixiaohao.test.methodInterface;

import org.junit.Test;

/**
 * @program: mytest
 * @description:
 * @author: xiaohao.li
 * @create: 2018-06-29 09:40
 **/

public class TestMethodINterface {

    @Test
    public void test001(){
        int code = 200;
        StatusEnum enumInstance = StatusEnum.getEnumByCode(code);
        System.out.println(enumInstance.getMessage());
    }


    @Test
    public void test002(){
        String code = "success";
        StatusEnum enumInstance = StatusEnum.getEnumByMessage(code);
        System.out.println(enumInstance.getCode());
    }


    @Test
    public void test003(){
        MethodService service = new MethodService();
        service.modeList(3,(data) -> {
            for (Mode mode:data) {
                if (mode.getAge() == 2){
                    System.out.println(mode.toString());
                }
            }
        });
    }


    @Test
    public void test004(){
        MethodService service = new MethodService();
        service.modeList(3,(data,response) -> {
            System.out.println(response);
            for (Mode mode:data) {
                if (mode.getAge() == 2){
                    System.out.println(mode.toString());
                }
            }
        });
    }

}
