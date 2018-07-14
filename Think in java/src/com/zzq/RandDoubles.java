package com.zzq;
import java.util.*;

public class RandDoubles {
    private static Random rand = new Random(47);
    public double next(){return rand.nextDouble();}

    public static void main(String[] args) {
        RandDoubles rd = new RandDoubles();
        for(int i = 0 ; i < 7 ; i ++)
            System.out.println(rd.next() + " ");
    }
}
