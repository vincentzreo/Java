package com.zzq;

import net.mindview.util.TextFile;

import java.util.Set;
import java.util.TreeSet;

public class UniqueWords {
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(
        new TextFile("SetOperations.java","\\w+"));
        System.out.println(words);
    }
}
