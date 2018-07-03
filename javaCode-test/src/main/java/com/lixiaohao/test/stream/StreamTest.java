package com.lixiaohao.test.stream;

import org.junit.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @program: mytest
 * @description:
 * @author: xiaohao.li
 * @create: 2018-06-07 20:56
 **/

public class StreamTest {

    @Test
    public void filterTest(){
        List<String> list = new ArrayList<>();
        list.add("1qaz3");
        list.add("dsa3");
        list.add("fsd");
        list.add("fd");
        list.add("f");

        list.stream()
                .map(s -> {
                return s;
                })
                .filter(s -> {

                    return s.length() > 3;
                })
                .forEach(s -> {
                    System.out.println(s);
                });

    }


    @Test
    public void map(){
        List<StreamModel> models = new ArrayList<>();

        StreamModel model1 = new StreamModel(1,126,"lle");
        StreamModel model2 = new StreamModel(2,120,"ll1s");
        StreamModel model3 = new StreamModel(1,124,"lls");
        models.add(model1);
        models.add(model2);
        models.add(model3);

        List<String> collect = models.stream().map(streamModel -> streamModel.getName()).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(models.size());
    }

    @Test
    public void findAnly(){
        List<StreamModel> models = new ArrayList<>();

        StreamModel model1 = new StreamModel(1,126,"lle");
        StreamModel model2 = new StreamModel(2,120,"ll1s");
        StreamModel model3 = new StreamModel(1,124,"lls");
        models.add(model1);
        models.add(model2);
        models.add(model3);

        StreamModel model = models.stream().filter(m -> {
            return m.getAge() == 1;
        })
                .findFirst()
                .orElse(null);
    }


    @Test
    public void  flatMapTest () {
        List<StreamModel> models = new ArrayList<>();

        StreamModel model1 = new StreamModel(1,126,"lle");
        StreamModel model2 = new StreamModel(2,120,"ll1s");
        StreamModel model3 = new StreamModel(5,124,"lls");
        models.add(model1);
        models.add(model2);
        models.add(model3);

        Map<String, List<String>> collect = models.stream().collect(
                Collectors.groupingBy(p -> {
                   return p.getAge()>3?"大人":"消耗";
                        },
                        Collectors.mapping(t->{
                            return t.getName();
                        }, Collectors.toList())
                ));


        System.out.println(collect);


    }




    @Test
    public void  partitioningMapTest () {
        List<StreamModel> models = new ArrayList<>();

        StreamModel model1 = new StreamModel(1,126,"lle");
        StreamModel model2 = new StreamModel(2,120,"ll1s");
        StreamModel model3 = new StreamModel(5,124,"lls");
        StreamModel model4 = new StreamModel(5,124,"lls");
        models.add(model1);
        models.add(model2);
        models.add(model3);
        models.add(model4);

        Map<Long, String> collect = models.stream().distinct().collect(
                Collectors.toMap(p -> p.getAge(), d -> d.getName()));


        System.out.println(collect);


    }


    @Test
    public void  mxaTest () {
        List<StreamModel> models = new ArrayList<>();

        StreamModel model1 = new StreamModel(3,126,"lle");
        StreamModel model2 = new StreamModel(2,120,"ll1s");
        StreamModel model3 = new StreamModel(5,124,"lls");
        StreamModel model4 = new StreamModel(5,124,"lls");
        models.add(model1);
        models.add(model2);
        models.add(model3);
        models.add(model4);

        StreamModel model = models.stream().max((m1, m2) -> new Long(m1.getAge() - m2.getAge()).intValue())
                .orElse(null);
        System.out.println(model.getAge());


    }


    @Test
    public void joiningTest(){
        List<StreamModel> models = new ArrayList<>();

        StreamModel model1 = new StreamModel(3,126,"i");
        StreamModel model2 = new StreamModel(2,120,"love");
        StreamModel model3 = new StreamModel(5,124,"you");
        models.add(model1);
        models.add(model2);
        models.add(model3);

        String collect = models.stream().map(m -> m.getName())
                .collect(Collectors.joining("\n"));
        System.out.println(collect);


    }

}
