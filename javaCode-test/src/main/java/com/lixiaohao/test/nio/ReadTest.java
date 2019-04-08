package com.lixiaohao.test.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @program: mytest
 * @description:
 * @author: xiaohao.li
 * @create: 2019-03-04 14:28
 **/

public class ReadTest {
    private static String path = "/Users/lixiaohao/Downloads/域名";


    public static void main(String[] args) {
        readNIO();
    }

    private static void readNIO() {
        StringBuilder sb = new StringBuilder();
                 FileInputStream fin = null;
                 try {
                     fin = new FileInputStream(new File(path));
                     FileChannel channel = fin.getChannel();

                     int capacity = 100;// 字节
                     ByteBuffer bf = ByteBuffer.allocate(capacity);
                    System.out.println("限制是：" + bf.limit() + ",容量是：" + bf.capacity() + " ,位置是：" + bf.position());
                int length = -1;

                while ((length = channel.read(bf)) != -1) {

                       /*
                        * 注意，读取后，将位置置为0，将limit置为容量, 以备下次读入到字节缓冲中，从0开始存储
                    */
                       bf.clear();
                       byte[] bytes = bf.array();
                       System.out.println("start..............");

                       String str = new String(bytes, 0, length);
                       System.out.println(str);
                       sb.append(str);

                       System.out.println("end................");

                       System.out.println("限制是：" + bf.limit() + "容量是：" + bf.capacity() + "位置是：" + bf.position());

                   }

               channel.close();

           } catch (FileNotFoundException e) {
               e.printStackTrace();
           } catch (IOException e) {
               e.printStackTrace();
           } finally {
               if (fin != null) {
                           try {
                                   fin.close();
                               } catch (IOException e) {
                                   e.printStackTrace();
                      }
              }
              }


        System.out.println("读取结果=====>>"+sb.toString());
      }

}
