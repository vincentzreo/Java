package com.zzq;

class Egg{
    private Yolk y;
    protected class Yolk{
        public Yolk(){
            System.out.println("Egg.Yolk()");
        }
    }
}

public class BigEgg extends Egg {
    public class Yolk{
        public Yolk() {
            System.out.println("BigEgg.Yolk()");
        }
    }

    public static void main(String[] args) {
        BigEgg be = new BigEgg();


    }
}
