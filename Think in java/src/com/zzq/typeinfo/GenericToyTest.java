package com.zzq.typeinfo;

public class GenericToyTest {
    public static void main(String[] args) {
        Class<FancyToy> ftClass = FancyToy.class;
        //Produces exact type:
        try {
            FancyToy fancyToy = ftClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        Class<? super FancyToy> up = ftClass.getSuperclass();
    }
}
