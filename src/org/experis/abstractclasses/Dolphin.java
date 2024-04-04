package org.experis.abstractclasses;

public class Dolphin extends Animal implements CanSwim{
    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("The dolphin is eating some fish");

    }

    @Override
    public void makeNoise() {
        System.out.println("Whistles!");

    }

    @Override
    public void swim() {
        System.out.println("I'm a dolphin and i swim");
    }
}
