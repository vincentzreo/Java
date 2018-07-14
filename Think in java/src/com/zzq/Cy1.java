package com.zzq;
class Cycle{
    public void play(){
        System.out.println("Cycle");
    }
    public void wheels(){
        System.out.println("wheels");
    }
}
class Unicyle extends Cycle{
    public void play(){
        System.out.println("Unicyle");
    }
}
class Bicycle extends Cycle{
    @Override
    public void play() {
        System.out.println("Bicycle");
    }
}
class Tricycle extends Cycle{
    @Override
    public void play() {
        super.play();
        System.out.println("Tricycle");
    }
}

public class Cy1 {
    public static void tune(Cycle c){
        c.wheels();
    }

    public static void main(String[] args) {
        Unicyle un = new Unicyle();
        Bicycle bi = new Bicycle();
        Cycle c = new Bicycle();
        Tricycle tr  = new Tricycle();
        tune(un);
        tune(bi);
        tune(tr);
        tune(c);
    }
}
