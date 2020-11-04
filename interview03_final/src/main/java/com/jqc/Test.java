package com.jqc;

public class Test {

    private final String string;
    //构造器初始化string
    public Test(String string) {
        this.string = string;
    }

    public static void main(String[] args) {
        Test test1 = new Test("111");
        Test test2 = new Test("111");
        System.out.println(test1);
        System.out.println(test2);
        //false
        System.out.println(test1.equals(test2));
    }
}
