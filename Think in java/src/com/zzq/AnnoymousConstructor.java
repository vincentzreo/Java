package com.zzq;

abstract class Base{
    public Base(int i){
        System.out.println("Base constructor, i = " + i);
    }
    public abstract void f();
}

public class AnnoymousConstructor {
    public static Base getBase(int i){
        return new Base(i) {
            {
                System.out.println("Inside instance initializer");
            }
            @Override
            public void f() {
                System.out.println("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base b = getBase(47);
        b.f();
    }
}
