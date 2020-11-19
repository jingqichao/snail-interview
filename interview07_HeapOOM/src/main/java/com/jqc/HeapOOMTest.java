package com.jqc;

import java.util.ArrayList;
import java.util.List;

public class HeapOOMTest {

    //Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
    public static void main(String[] args) {
        List list = new ArrayList();
        while (true){
            list.add(new HeapOOMTest());
        }

    }
}
