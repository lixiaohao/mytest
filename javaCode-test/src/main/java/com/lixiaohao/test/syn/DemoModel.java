package com.lixiaohao.test.syn;

/**
 * @program: mytest
 * @description:
 * @author: xiaohao.li
 * @create: 2019-03-06 11:08
 **/

public class DemoModel {
    private static DemoModel demoModel;

    public static DemoModel singleton(){
        synchronized (DemoModel.class){
            System.out.println("锁内实例  开始");
            demoModel = new DemoModel();
            try {
                Thread.sleep(5L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("锁内实例  结束");
        }

        return demoModel;
    }

    private Long id = 0L;
    private String name;
    private static Long d ;


     public  Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  void increase(){
        synchronized (id) {
            System.out.println("锁内自增开始:"+id);
            id++;

            try {
                Thread.sleep(500L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("锁内自增结束:"+id);
        }


    }
}
