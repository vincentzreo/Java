package com.zzq;

import java.util.*;

class Animal1{
    void cry(){

    }
}
class Dog extends Animal1{
    void cry(){
        System.out.println("Dog");
    }
}
class Cat extends Animal1{
    void cry(){
        System.out.println("Cat");
    }
}
class Bird extends Animal1{
    void cry(){
        System.out.println("Bird");
    }
}
public class listTest001 {
    public static void display(Iterator<Animal1> it){
        while (it.hasNext()){
            Animal1 a = it.next();
            a.cry();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Animal1> animal1s = new ArrayList<>();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();
        animal1s.add(dog);
        animal1s.add(cat);
        animal1s.add(bird);
        LinkedList<Animal1> pets = new LinkedList<>(animal1s);
        System.out.println(pets);
        System.out.println("pets.getFirst(): " + pets.getFirst());
        System.out.println("pets.elements(): " + pets.element());
        //only differs in empty-list behavior:
        System.out.println("pets.peek(): " + pets.peek());
        //remove and return the first element
        System.out.println("pets.remove(): " + pets.remove());
        System.out.println("pets.removeFirst(): " + pets.removeFirst());
        //only differs in empty-list behavior:
        System.out.println("pets.poll(): " + pets.poll());
        System.out.println(pets);
        pets.addFirst(new Dog());
        System.out.println("After addFirst(): " + pets);
        pets.offer(new Cat());
        System.out.println("After offer(): " + pets);

    }
}
