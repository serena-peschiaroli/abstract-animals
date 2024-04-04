package org.experis.abstractclasses;

public class Sparrow extends Animal implements CanFly{
    public Sparrow(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("The sparrow is eating sunflower");

    }

    @Override
    public void makeNoise() {
        System.out.println("Chirp!");
    }

    @Override
    public void fly() {
        System.out.println("I'm a sparrow and I fly");
    }
}
