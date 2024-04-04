package org.experis.abstractclasses;

public class MainInterfaces {
    public static void makeFly(CanFly animal){
        animal.fly();
    }
    public static void makeSwim(CanSwim animal){
        animal.swim();
    }


    public static void main(String[] args) {
        Animal[] animals = {new Dog("Milo"), new Sparrow("Pip"), new Eagle("Orion"), new Dolphin("Echo")};

        for (Animal animal : animals){

           if(animal instanceof CanFly){
               makeFly((CanFly) animal);
           }
           if(animal instanceof CanSwim){
               makeSwim((CanSwim) animal);
           }

        }
    }
}
