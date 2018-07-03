package com.lixiaohao.test.methodInterface;

import com.sun.org.apache.bcel.internal.generic.MONITORENTER;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @program: mytest
 * @description:
 * @author: xiaohao.li
 * @create: 2018-06-29 10:25
 **/

public class MethodService {

    //1、age、name
    public  Mode mode(int age,String name,Function<Mode,Mode> function){
        Mode mode = new Mode();
        mode.setName("我叫"+name);
        mode.setAge(age);

        Mode apply = function.apply(mode);
        apply.setName("我不是"+apply.getName());
        apply.setAge(apply.getAge()+1);

        return apply;
    };


    public void modeList(int size, Consumer<List<Mode>> consumer){

        List<Mode> list = new ArrayList<>();
        for (int i = 0;i<size;i++) {
            Mode mode = new Mode();
            mode.setAge(i);
            mode.setName("姓名"+i);
            list.add(mode);
        }

        consumer.accept(list);
    }

    public void modeList(int size, BiConsumer<List<Mode> ,String > consumer){

        List<Mode> list = new ArrayList<>();
        for (int i = 0;i<size;i++) {
            Mode mode = new Mode();
            mode.setAge(i);
            mode.setName("姓名"+i);
            list.add(mode);
        }

        consumer.accept(list,"success");
    }

    public void modeListDeal(int size, BiConsumer<List<Mode> ,String > consumer){

        List<Mode> list = new ArrayList<>();
        for (int i = 0;i<size;i++) {
            Mode mode = new Mode();
            mode.setAge(i);
            mode.setName("姓名"+i);
            list.add(mode);
        }
        consumer.andThen((s, d) -> {
            System.out.println("d:"+d);
            System.out.println("s"+s);
        }).accept(list, "success");
    }


    public String modeListDealList(int size, BiFunction<List<Mode>,String,List<Mode>> function){

        List<Mode> list = new ArrayList<>();
        for (int i = 0;i<size;i++) {
            Mode mode = new Mode();
            mode.setAge(i);
            mode.setName("姓名"+i);
            list.add(mode);
        }

        Function<List<Mode>,String> f = x-> x+" new";

        String success = function.andThen((d) -> {
            System.out.println("d:" + d.toString());
            return "error";
        }).apply(list, "success");

        return success;
    }

}
