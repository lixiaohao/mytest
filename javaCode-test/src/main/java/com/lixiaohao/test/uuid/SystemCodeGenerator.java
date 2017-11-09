package com.lixiaohao.test.uuid;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * 产生不同的随机数
 * Created by xiaohao.li on 2017/8/3.
 */
public class SystemCodeGenerator {
    public static String[] chars = new String[]{"0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I",
            "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
            "W", "X", "Y", "Z"};


    public static String generate() {
        StringBuffer shortBuffer = new StringBuffer();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        for (int i = 0; i < 8; i++) {
            String str = uuid.substring(i * 4, i * 4 + 4);
            int x = Integer.parseInt(str, 16);
            shortBuffer.append(chars[x % 0x24]);
        }
        return shortBuffer.toString();
    }

    public static void main(String[] args) {
//        System.out.println(SystemCodeGenerator.generate());
        Set<String> systemCode = new HashSet<String>();

        for (int i=0; i<1000000;i++ ) {
            systemCode.add( SystemCodeGenerator.generate() );
        }

        System.out.println(systemCode.size());
    }
}
