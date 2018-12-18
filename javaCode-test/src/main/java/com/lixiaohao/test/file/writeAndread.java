package com.lixiaohao.test.file;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @program: mytest
 * @description:
 * @author: xiaohao.li
 * @create: 2018-07-25 14:42
 **/

public class writeAndread {

    String path = "/Users/lixiaohao/Downloads/cache/";

    @Test
   public void write(){
       MySession session = new MySession();
       session.setName("name");
       session.setSessionId("fasfsafa412434");
       FileWriter writer = null;
       try {
            writer = new FileWriter(path+"session.txt");
           writer.write(session.toString());
       } catch (IOException e) {
           e.printStackTrace();
       }finally {
           if ( writer != null ) {
               try {
                   writer.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
       }
   }

   @Test
   public void read(){
        FileReader reader = null;
            int c = 0;

       try {
           reader = new FileReader(path+"session.txt");

           c = reader.read();
           while (c != -1) {
               System.out.print((char) c);
               c = reader.read();


           }
       }catch (FileNotFoundException e) {
           e.printStackTrace();
       }catch (IOException e2){
           e2.printStackTrace();
       }finally {
           if ( reader != null ) {
               try {
                   reader.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }
       }

   }

}
