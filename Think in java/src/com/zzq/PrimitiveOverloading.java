package com.zzq;

public class PrimitiveOverloading {
    void f1(char x){System.out.print("f1(char) ");}
    void f1(byte x){System.out.print("f1(byte) ");}
    void f1(short x){System.out.print("f1(short) ");}
    void f1(int x){System.out.print("f1(int) ");}
    void f1(long x){System.out.print("f1(long) ");}
    void f1(float x){System.out.print("f1(float) ");}
    void f1(double x){System.out.print("f1(double) ");}

    void f2(byte x){System.out.print("f2(byte) ");}
    void f2(short x){System.out.print("f2(short) ");}
    void f2(int x){System.out.print("f2(int) ");}
    void f2(long x){System.out.print("f2(long) ");}
    void f2(float x){System.out.print("f2(float) ");}
    void f2(double x){System.out.print("f2(double) ");}

    void f3(short x){System.out.print("f3(short) ");}
    void f3(int x){System.out.print("f3(int) ");}
    void f3(long x){System.out.print("f3(long)");}

}
