package com.lixiaohao.test.sort;

import org.junit.Test;

import java.util.*;

/**
 * @program: mytest
 * @description:
 * @author: xiaohao.li
 * @create: 2019-03-10 21:46
 **/

public class SortTest {
    //待排序的数据
    Integer[] sData = {15,3,1,10,4,2,8,6,2,9,10,11,12,13};


    /**
     * 冒泡排序法
     */
    @Test
    public void BubbleSortTest(){

        for ( int i=0;i<sData.length-1;i++ ) {

            for ( int j = 0;j < sData.length - 1 -i; j++ ) {

                if ( sData[j] > sData[j+1] ) {
                    int temp = sData[j];
                    sData[j] = sData[j+1];
                    sData[j+1] = temp;
                }

            }

        }

        for ( int t : sData ) {
            System.out.print(t);
            System.out.print("  ");
        }


    }


    /***
     * 增强型冒泡排序法
     *
     * 如果已经有顺序，则不再排序
     */
    @Test
    public void EnhancedBubbleSortTest(){
        for ( int i=0;i<sData.length-1;i++ ) {
            //是否交换过
            Boolean swaped = Boolean.FALSE;
            System.out.println("比较次数:"+i);

            for ( int j = 0;j < sData.length - 1 -i; j++ ) {

                if ( sData[j] > sData[j+1] ) {
                    int temp = sData[j];
                    sData[j] = sData[j+1];
                    sData[j+1] = temp;
                    swaped = Boolean.TRUE;
                }
            }

            //如果没有交换过，则不再排序，直接退出
            if ( !swaped ) {
                break;
            }

        }

        for ( int t : sData ) {
            System.out.print(t);
            System.out.print("  ");
        }
    }


    /***
     * 选择排序法
     *
     * 首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素，
     * 然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
     */
    @Test
    public void selectionSort(){

        for ( int i = 0;i< sData.length -1; i++ ) {
            for ( int j=i+1;j<sData.length;j++ ) {
                if ( sData[i] > sData[j] ) {
                    int temp = sData[i];
                    sData[i] = sData[j];
                    sData[j] = temp;
                }
            }
        }

        for ( int t : sData ) {
            System.out.print(t);
            System.out.print("  ");
        }

//        Collections.s


    }


    public <T> void selectionSort(T[] t , Comparator<? super  T> comparator ) {
//        comparator.
    }


}
