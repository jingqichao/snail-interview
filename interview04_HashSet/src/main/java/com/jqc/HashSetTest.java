package com.jqc;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

    public static void main(String[] args) {
        Set hashSet = new HashSet();
        hashSet.add("1");
        hashSet.add("1");
        System.out.println(hashSet);
    }
}
