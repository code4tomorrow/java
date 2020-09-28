package com.codefortomorrow.advanced.chapter15.solutions.animals;

public class Zebra extends Animal {
    private int numStripes;

    public Zebra(String species, int age, String gender, String sound, int numStripes) {
        super(species, age, gender, sound);
        this.numStripes = numStripes;
    }

    public void makeSound() {
        System.out.println(getSound());
        System.out.println(getSound());
    }
}
