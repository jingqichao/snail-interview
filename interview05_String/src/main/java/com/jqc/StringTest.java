package com.jqc;

public class StringTest {

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "he" + new String("llo");
        String s3 = "he" + "llo";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s1 == s2);//false
        System.out.println(s1 == s3);//true
        //当调用 intern() 方法时，编译器会将字符串添加到常量池中（stringTable维护），并返回指向该常量的引用。
        System.out.println(s1 == s2.intern());//true

    }
}
