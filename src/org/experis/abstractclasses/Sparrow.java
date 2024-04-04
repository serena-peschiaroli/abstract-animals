package org.experis.abstractclasses;

public class Sparrow extends Animal{
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
}
