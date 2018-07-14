package com.zzq;

interface Service{
    void method1();
    void method2();
}

interface ServiceFactory{
    Service getService();
}

class Implementationa1 implements Service{
    Implementationa1(){}

    @Override
    public void method1() {
        System.out.println("Implementationa1 method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementationa1 method2");
    }
}
class Implementation1Factory implements ServiceFactory{
    @Override
    public Service getService() {
        return new Implementationa1();
    }
}
class Implementation2 implements Service{
    Implementation2(){}

    @Override
    public void method1() {
        System.out.println("Implementation2 method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation2 method2");
    }
}
class Implementation2Factory implements ServiceFactory{
    @Override
    public Service getService() {
        return new Implementation2();
    }
}

public class Factories {
    public static void serviceConsumer(ServiceFactory fact){
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new Implementation1Factory());
        serviceConsumer(new Implementation2Factory());
    }
}
