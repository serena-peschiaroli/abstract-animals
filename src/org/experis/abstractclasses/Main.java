package org.experis.abstractclasses;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog("Milo"), new Sparrow("Pip"), new Eagle("Orion"), new Dolphin("Echo")};

        for (Animal animal : animals){
            //separatore per maggiore chiarezza
            System.out.println("------------------------------");
            // s% placeholder per animal.getName e animal.getClass.getSimpleName--> ritorna il nome della classe
            System.out.printf("%s the %s : \n", animal.getName(), animal.getClass().getSimpleName());
            animal.makeNoise();
            animal.eat();
            animal.sleep();
            System.out.println("------------------------------\n");
        }
    }
}
