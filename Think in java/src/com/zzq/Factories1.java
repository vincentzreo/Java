package com.zzq;

class Implementation1 implements Service{
    private Implementation1(){}

    @Override
    public void method1() {
        System.out.println("imp1 method1");
    }

    @Override
    public void method2() {
        System.out.println("imp1 method2");
    }
    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementation1();
        }
    };
}
class Implementationa2 implements Service{
    private Implementationa2(){}

    @Override
    public void method1() {
        System.out.println("imp2 method1");
    }

    @Override
    public void method2() {
        System.out.println("imp2 method2");
    }
    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementationa2();
        }
    };
}

public class Factories1 {
    public static void serviceConsumer(ServiceFactory fact){
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(Implementation1.factory);
        serviceConsumer(Implementationa2.factory);
    }
}
