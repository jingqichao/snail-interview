package com.jqc;

import java.sql.Array;
import java.util.ArrayList;

public class ArrayTest {
//    private int[] array;
//    private int size;

//    public ArrayTest(int capacity){
//        this.array = new int[capacity];
//        size=0;
//    }
    public static void main(String[] args) {
        //java中各数据类型的取值范围：
        //1、int。
        //最小值：Integer.MIN_VALUE= -2147483648 （-2的31次方）
        //最大值：Integer.MAX_VALUE= 2147483647  （2的31次方-1）
        int i = 2147483647;
        int j = -2147483648;
        System.out.println(i);
        System.out.println(i+1);
        System.out.println((i+1)<i);
        //2、short。
        //最小值：Short.MIN_VALUE=-32768 （-2的15此方）
        //最大值：Short.MAX_VALUE=32767 （2的15次方-1）
        //3、long。
        //最小值：Long.MIN_VALUE=-9223372036854775808 （-2的63次方）
        //最大值：Long.MAX_VALUE=9223372036854775807 （2的63次方-1）
        //4、float 。
        //最小值：Float.MIN_VALUE=1.4E-45 （2的-149次方）
        //最大值：Float.MAX_VALUE=3.4028235E38 （2的128次方-1）
        //5、double。
        //最小值：Double.MIN_VALUE=4.9E-324 （2的-1074次方）
        //最大值：Double.MAX_VALUE=1.7976931348623157E308 （2的1024次方-1）

        //数组的使用
        System.out.println("===================================");
        String array[] ={"a","b"};
        System.out.println(array.hashCode());
        System.out.println(array.toString().hashCode());
        System.out.println(array.length);

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("aaa");
        arrayList.add("bbb");
        arrayList.add("bbb");
        System.out.println(arrayList);

        System.out.println(5%8);
        System.out.println(8%5);
    }
}
