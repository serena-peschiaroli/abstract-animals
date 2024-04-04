package org.experis.abstractclasses;

public class Eagle extends Animal{
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
}
