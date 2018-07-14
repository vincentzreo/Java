package com.zzq;

public class Parcel8 {
    public Warpping warpping(int x){
        return new Warpping(x){
            @Override
            public int valeue() {
                return super.valeue() * 47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 p = new Parcel8();
        Warpping w = p.warpping(10);
    }
}
