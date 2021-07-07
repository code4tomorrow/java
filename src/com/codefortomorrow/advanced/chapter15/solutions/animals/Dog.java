package com.codefortomorrow.advanced.chapter15.solutions.animals;

public class Dog extends Animal {
    int ageInDogYears;

    public Dog(
        String species,
        int age,
        String gender,
        String sound,
        int ageInDogYears
    ) {
        super(species, age, gender, sound);
        this.ageInDogYears = ageInDogYears;
    }

    public void makeSound() {
        System.out.println(getSound());
        System.out.println(getSound());
        System.out.println(getSound());
    }
}
