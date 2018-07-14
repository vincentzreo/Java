package com.zzq;
interface A1{}
interface B1{}

class X implements A1,B1{}
class Y implements A1{
    B1 makeB(){
        return new B1() {
        };
    }
}


public class MultiInterfaces {
    static void takesA(A1 a){}
    static void takesB(B1 b){}

    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takesA(x);
        takesB(x);
        takesA(y);
        takesB(y.makeB());
    }
}
