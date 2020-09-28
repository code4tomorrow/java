package com.codefortomorrow.advanced.chapter15.solutions.animals;

public class Cat extends Animal {
    private String color;

    public Cat(
        String species,
        int age,
        String gender,
        String sound,
        String color
    ) {
        super(species, age, gender, sound);
        this.color = color;
    }

    public void makeSound() {
        System.out.println(getSound());
    }
}
