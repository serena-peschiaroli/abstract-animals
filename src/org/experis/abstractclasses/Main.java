package org.experis.abstractclasses;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog("Milo"), new Sparrow("Pip"), new Eagle("Orion"), new Dolphin("Echo")};

        for (Animal animal : animals){
            System.out.println(animal + animal.getName());
            animal.makeNoise();
            animal.eat();
            animal.sleep();
        }
    }
}
