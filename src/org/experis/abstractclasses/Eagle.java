package org.experis.abstractclasses;

public class Eagle extends Animal implements CanFly{
    public Eagle(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("The eagle is eating some meat");

    }

    @Override
    public void makeNoise() {
        System.out.println("Screech!");

    }

    @Override
    public void fly() {
        System.out.println("I'm an eagle and i fly!");
    }
}
