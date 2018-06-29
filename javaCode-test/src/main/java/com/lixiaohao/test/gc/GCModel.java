package com.lixiaohao.test.gc;

/**
 * @program: mytest
 * @description:
 * @author: xiaohao.li
 * @create: 2018-06-27 16:51
 **/

public class GCModel {

    private String name;
    private String size;


    public void out(){
        System.out.println("out=====>"+this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
