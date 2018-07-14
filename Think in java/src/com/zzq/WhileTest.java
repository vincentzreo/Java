package com.zzq;

public class WhileTest {
    static boolean condition(){
        boolean result = Math.random() < 0.99;
        System.out.print(result + ", ");
        return result;
    }
    public static void main(String[] args){
        while (condition())
            System.out.print("Inside 'while'");
        System.out.print("Exited 'while'");
    }
}
