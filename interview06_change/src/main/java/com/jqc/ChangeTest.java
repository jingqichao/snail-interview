package com.jqc;

public class ChangeTest {

    public static void main(String[] args) {
        String str = "hello world";
        char ch[] = {'a','b','c'};
        char ch1[] = {'汉'};
        System.out.println(str);//hello world
        System.out.println(ch);//abc
        System.out.println(ch1);//汉
        ChangeTest changeTest = new ChangeTest();
        changeTest.change(str,ch);
        System.out.println(str);//hello world
        System.out.println(ch);//abm
    }

    private void change(String str, char ch[]) {
        str = "good";
        ch[2] ='m';
    }
}
