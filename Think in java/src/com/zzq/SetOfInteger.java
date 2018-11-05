package com.zzq;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetOfInteger {
    public static void main(String[] args) {
        Random random = new Random(47);
        Set<Integer> intset = new HashSet<>();
        for(int i = 0 ; i < 10000 ; i ++){
            intset.add(random.nextInt(30));
        }
        System.out.println(intset);
    }
}
