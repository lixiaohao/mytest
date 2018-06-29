package com.lixiaohao.test.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @program: mytest
 * @description:
 * @author: xiaohao.li
 * @create: 2018-06-09 09:07
 **/

public class StreamTest2 {

    @Test
    public void forEachTest(){

        List<String> list = new ArrayList<>();
        list.add("1qaz3");
        list.add("dsa3");
        list.add("fsd");
        list.add("fd");
        list.add("f");


        list.stream().forEach(s -> {
            System.out.println(s);
        });
    }


    @Test
    public void forFilterTest(){

        List<String> list = new ArrayList<>();
        list.add("1qaz3");
        list.add("dsa3百度输入法");
        list.add("fsd");
        list.add("fd");
        list.add("f");

        list.stream().filter(x -> {
           return x.length()>2;
        }).
        filter(x->{return x.contains("输入法");})
          .forEach(x -> {
            System.out.println(x);
        });
    }




    @Test
    public void MapTest(){

        List<StreamModel> models = new ArrayList<>();

        StreamModel model1 = new StreamModel(1,126,"lle");
        StreamModel model2 = new StreamModel(2,120,"ll1s");
        StreamModel model3 = new StreamModel(5,124,"lls");
        models.add(model1);
        models.add(model2);
        models.add(model3);

        List<String> collect = models.stream().filter(m -> {
            return m.getAge() >= 2;
        })
                .map(m -> {
                    return m.getName();
                }).collect(Collectors.toList());

        System.out.println(collect);
    }


    @Test
    public void collectTest(){

        List<StreamModel> models = new ArrayList<>();

        StreamModel model1 = new StreamModel(1,126,"呵呵");
        StreamModel model2 = new StreamModel(2,120,"哈哈");
        StreamModel model3 = new StreamModel(5,124,"历史");
        StreamModel model4 = new StreamModel(5,124,"张三");
        StreamModel model5 = new StreamModel(7,124,"找刘");
        StreamModel model6 = new StreamModel(7,124,"王五");
        models.add(model1);
        models.add(model2);
        models.add(model3);
        models.add(model4);
        models.add(model5);
        models.add(model6);

        Map<Long, List<String>> collect = models.stream().
                filter(m -> {
                    return m.getAge() > 2;
                })
                .collect(
                        Collectors.groupingBy(
                        s -> {
                            return s.getAge();
                        }
                        , Collectors.mapping(s -> {
                            return s.getName();
                        }, Collectors.toList())
                )
                );

        System.out.println(collect);

    }


    @Test
    public void collectTest2(){

        List<StreamModel> models = new ArrayList<>();

        StreamModel model1 = new StreamModel(1,126,"呵呵");
        StreamModel model2 = new StreamModel(2,120,"哈哈");
        StreamModel model3 = new StreamModel(5,124,"历史");
        StreamModel model4 = new StreamModel(5,124,"张三");
        StreamModel model5 = new StreamModel(7,124,"找刘");
        StreamModel model6 = new StreamModel(7,124,"王五");
        models.add(model1);
        models.add(model2);
        models.add(model3);
        models.add(model4);
        models.add(model5);
        models.add(model6);

        Map<Long, List<String>> collect = models.stream().
                filter(m -> {
                    return m.getAge() > 2;
                })
                .collect(Collectors.groupingBy(
                        StreamModel :: getAge
                        , Collectors.mapping(StreamModel :: getName, Collectors.toList())
                ));


        System.out.println(collect);

    }




}
