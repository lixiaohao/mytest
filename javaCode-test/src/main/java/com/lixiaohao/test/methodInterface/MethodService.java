package com.lixiaohao.test.methodInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @program: mytest
 * @description:
 * @author: xiaohao.li
 * @create: 2018-06-29 10:25
 **/

public class MethodService {

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

}
