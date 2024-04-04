package org.experis.abstractclasses;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating some meat");

    }

    @Override
    public void makeNoise() {
        System.out.println("Woof!");

    }
}
