package org.experis.abstractclasses;

public abstract class Animal {

    //ATTRIBUTI
    private String name;
    //CONSTRUCTOR

    public Animal(String name) {
        this.name = name;
    }
    //METHODS

    public void sleep(){
        System.out.println("Zzzzzzzz");
    };
}
