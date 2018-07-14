/*package com.zzq;


class A{
    void f1(){
        System.out.print("f1");
    }
    void f2(){
        this.f1();
        f1();
    }
}

class Person{
    public void eat(Apple apple){
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");
    }

}
class Peeler{
    static Apple peel(Apple apple){
        return apple;
    }
}
class Apple{
    Apple getPeeled(){return Peeler.peel(this);}
}

public class PassingThis {
    public static void main(String [] args){
        new Person().eat(new Apple());
        new A().f2();
    }
}*/
