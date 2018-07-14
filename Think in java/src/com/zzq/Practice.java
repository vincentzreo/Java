package com.zzq;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int size = 3;
        String[] array = new String[size];
        Arrays.fill(array,"");
        for(int i=0; i<100;  ){
            array[i++%size] += i + " ";
        }
        for(String element : array){
            System.out.println(element);
        }
        String[] a = {""};
        a[test()] += "a";
    }
    static int test(){
        System.out.println("evaluted");
        return 0;
    }
}
