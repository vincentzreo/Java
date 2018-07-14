package com.zzq;
class Rock{
    public String a = new String("abc");
    Rock(int i){
        this.a = new String("xyz");
    }
    Rock(){}
}
public class Constructor {
   public static void main(String[] args){
       Rock r = new Rock();
       System.out.print(r.a);
       Rock r1 = new Rock(1);
       System.out.print(r1.a);
   }
}
