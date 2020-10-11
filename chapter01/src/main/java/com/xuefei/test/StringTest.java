package com.xuefei.test;

/**
 * @description:
 * @author: xuefei
 * @date: 2020/10/11 00:07
 */
public class StringTest {
    public static void main(String[] args) {
        String str = new String("hello") + new String("world");
        String str1 = "helloworld";
        System.out.println(str == str1);
        String str2 = new String("helloworld");
        System.out.println(str == str2);
    }
}
