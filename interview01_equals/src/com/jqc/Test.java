package com.jqc;

public class Test {

    public static void main(String[] args) {

        //1.Object类中比较对象的时候equals和==等效
        Object object1 = new Object();
        Object object2 = new Object();
        System.out.println(object1);//java.lang.Object@1b6d3586
        System.out.println(object2);//java.lang.Object@4554617c
        System.out.println("两个Object类对象的比较**************************");
        //Object类的equals比较的是两个对象的地址是否相同
        /**Object类的equals源码
         *    public boolean equals(Object obj) {
         *         return (this == obj);
         *     }
         */
        boolean flag1 = object1.equals(object2);
        boolean flag2 = object1 == object2;
        System.out.println(flag1);//false
        System.out.println(flag2);//false
        System.out.println("两个基本数据类型的比较**********************");

        //2.基本数据类型
        //==比较的是两个变量的值是否相同，基本数据类型没有equals方法
        int a = 2;
        int b = 2;
        System.out.println(a==b);//true

        //3.引用数据类型：
        //==比较的是两个对象的地址是否相同，即栈中的内容是否相同
        //equals比较的是两个对象的内容是否相同，即堆中的内容是否相同
        System.out.println("两个字符串的比较**********************");
        String c = "qqq";
        String d = "qqq";  //保存到字符串缓冲池里，当有相同值的对象，就引用该对象，否则重新创建字符串
        System.out.println(c);//qqq
        System.out.println(d);//qqq
        System.out.println(c==d);  //true
        System.out.println(c.equals(d));  //true
        //解释：
        //程序在运行的时候会创建一个字符串缓冲池当使用 b = "qqq" 这样的表达是创建字符串的时候
        // 程序首先会在这个String缓冲池中寻找相同值的对象，在第一个程序中，a先被放到了池中
        // 所以在b被创建的时候，程序找到了具有相同值的 a将b引用a所引用的对象"qqq"，所以地址相同。
        System.out.println("一个字符串和一个字符串对象的的比较**********************");
        String e = "money";
        String f = new String("money");
        System.out.println(e);//money
        System.out.println(f);//money
        System.out.println(e==f);  //false
        System.out.println(e.equals(f));  //true
        System.out.println("两个字符串对象的的比较**********************");
        String n = new String("money");
        String m = new String("money");
        System.out.println(n==m);  //false
        System.out.println(n.equals(m));  //true
        //解释：
        //Java.lang.String的intern()方法"abc".intern()方法的返回值还是字符串"abc"，
        // 表面上看起来好像这个方法没什么用处。但实际上，它做了个小动作：
        // 检查字符串池里是否存在"abc"这么一个字符串，如果存在，就返回池里的字符串；
        // 如果不存在，该方法会把"abc"添加到字符串池中，然后再返回它的引用。
        //源码：
        /**
         *     public boolean equals(Object anObject) {
         *         if (this == anObject) {
         *             return true;
         *         }
         *         if (anObject instanceof String) {
         *             String anotherString = (String)anObject;
         *             int n = value.length;
         *             if (n == anotherString.value.length) {
         *                 char v1[] = value;
         *                 char v2[] = anotherString.value;
         *                 int i = 0;
         *                 while (n-- != 0) {
         *                     if (v1[i] != v2[i])
         *                         return false;
         *                     i++;
         *                 }
         *                 return true;
         *             }
         *         }
         *         return false;
         *     }
         *
         */

        //4.封装类中==的使用
        System.out.println("封装类的比较**********************");
        int a1=1;
        int a2=1;
        Integer c1 = 1;
        Integer c2 = 1;
        Integer b1 =new Integer (1);
        Integer b2 =new Integer (1);
        System.out.println(a1==a2);//true
        System.out.println(b1==b2);//false
        System.out.println(b1.equals(b2));//true
        System.out.println(a1==b1);//true,这里比较特殊，Integer会自动拆箱，变成int
        System.out.println(c1.equals(b1)); //true,.equals进行拆箱操作
        System.out.println(c1==a1);  //true，Integer会自动拆箱，变成int
        System.out.println(c1==b2);//false
        //源码：重写了equals方法
        /**
         *     public boolean equals(Object obj) {
         *         if (obj instanceof Integer) {
         *             return value == ((Integer)obj).intValue();
         *         }
         *         return false;
         *     }
         */

    }


}
