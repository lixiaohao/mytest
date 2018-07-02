package com.lixiaohao.test.dateTime;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

/**
 * @program: mytest
 * @description:
 * @author: xiaohao.li
 * @create: 2018-07-02 10:12
 **/

public class TestLocalDate {

    /***
     * 测试
     * 使用LocaDate获取当前时间
     */
    @Test
    public void test001(){
        LocalDate now = LocalDate.now();
        System.out.println(now.toString());
    }

    /**
     * 初始化日期
     */
    @Test
    public void test002(){
        LocalDate day1 = LocalDate.of(2018, 2, 3);
        System.out.println(day1);

        LocalDate day2 = LocalDate.parse("2018-03-03");
        System.out.println(day1.toString());

        LocalDate day3 = LocalDate.parse("20150201", DateTimeFormatter.ofPattern("yyyyMMdd"));
        System.out.println(day3);


    }

    /***
     * 使用LocalDate 获取一段时间以后日期
     */
    @Test
    public void test003(){

        LocalDate now = LocalDate.now();
        System.out.println("当前日期:"+now.toString());

        LocalDate minus2 = now.minus(1, ChronoUnit.DAYS);
        System.out.println("一天前日期:"+minus2);

        LocalDate plus2 = now.plus(1, ChronoUnit.DAYS);
        System.out.println("一天后日期:"+plus2);


        LocalDate minus = now.minus(1, ChronoUnit.WEEKS);
        System.out.println("一周前日期:"+minus);

        LocalDate plus = now.plus(1, ChronoUnit.WEEKS);
        System.out.println("一周后日期:"+plus.toString());

        LocalDate minus1 = now.minus(1, ChronoUnit.YEARS);
        System.out.println("一年前日期:"+minus1);

        LocalDate plus1 = now.plus(1, ChronoUnit.YEARS);
        System.out.println("一年后日期:"+plus1.toString());

    }


    /**
     * 判断时间是否相等
     */
    @Test
    public void test004(){
        LocalDate day1 = LocalDate.of(2018,2,2);
        LocalDate day2 = LocalDate.of(2018, 3, 3);
        System.out.println(day1.equals(day2));
    }

    /**
     * 比较locaDate大小
     * compareTo -1:小于  1:大于
     */
    @Test
    public void test005(){
        LocalDate day1 = LocalDate.of(2018,2,2);
        LocalDate day2 = LocalDate.of(2018, 3, 3);
        System.out.println(day1.compareTo(day2));
    }

    /**
     * 判断locaTime时间顺序
     */
    @Test
    public void test006(){
        LocalDate day1 = LocalDate.of(2018,2,2);
        LocalDate day2 = LocalDate.of(2018, 3, 3);
        System.out.println("day1+"+day1.toString());
        System.out.println("day2:"+day2.toString());
        System.out.println("day1是否在day2之前:"+day1.isBefore(day2));

    }


    /***
     * 调节器
     * 获取当月的最后一个工作日
     */
    @Test
    public void test007(){
        LocalDate now = LocalDate.parse("2018-06-02");
        System.out.println("当前时间:"+now.toString());
        LocalDate with = now.with(new TemporalAdjuster() {
            @Override
            public Temporal adjustInto(Temporal temporal) {
                LocalDate from = LocalDate.from(temporal);
                LocalDate with1 = from.with(TemporalAdjusters.lastDayOfMonth());

                LocalDate result;
                if ( with1.getDayOfWeek() == DayOfWeek.SUNDAY || with1.getDayOfWeek() == DayOfWeek.SATURDAY ) {
                    result = from.with(TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY));
                }else {
                    result = with1;
                }
                return temporal.with(result);
            }
        });

        System.out.println("当月最后一个工作日:"+with);
    }



    /***
     * 调节器
     * 获取当月的最后一个工作日
     */
    @Test
    public void test008(){
        LocalDate now = LocalDate.parse("2018-08-02");
        System.out.println("当前时间:"+now.toString());

        LocalDate with = now.with(x->{

            LocalDate lastDayOfMonth = LocalDate.from(x).with(TemporalAdjusters.lastDayOfMonth());
            System.out.println("本月最后一天:"+lastDayOfMonth);

            if ( lastDayOfMonth.getDayOfWeek() == DayOfWeek.SATURDAY || lastDayOfMonth.getDayOfWeek()==DayOfWeek.SUNDAY ) {
                return lastDayOfMonth.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
            }

            return lastDayOfMonth;
        });

        System.out.println("当月最后一个工作日:"+with);
    }


    /***
     * LocalDate转字符串
     */
    @Test
    public void test009(){
        LocalDate day = LocalDate.of(2018,07,11);
        System.out.println("当前日期:"+day.toString());

        String dayres = day.format(DateTimeFormatter.ofPattern("yyyy年M月d日"));
        System.out.println("转化后结果:"+dayres);


    }


}
