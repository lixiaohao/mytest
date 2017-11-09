package com.lixiaohao.test.other;

import java.util.Arrays;

/**
 * Created by xiaohao.li on 2017/9/21.
 */
public class IsChinese {
    public static void main(String[] args) {
        String str = "哈哈哈哈哈！!，，hhh@chinaredstar.com  ffaf试试";
        char[] chars = str.toCharArray();
        Arrays.asList(chars).stream().forEach(n -> System.out.println(n));

        for ( char c :chars ) {

            boolean flag = isChinese(c);
            System.out.println( c  +" --- " + flag );
        }


    }

    private static boolean isChinese(char c) {
        Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);
        if (ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
                || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B
                || ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION || ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS
                || ub == Character.UnicodeBlock.GENERAL_PUNCTUATION) {
            return true;
        }
        return false;
    }

}
