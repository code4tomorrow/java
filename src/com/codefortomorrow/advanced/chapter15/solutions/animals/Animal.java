package com.codefortomorrow.advanced.chapter15.solutions.animals;

public abstract class Animal {
    private String species;
    private int age;
    private String gender;
    private String sound;

    public Animal(String species, int age, String gender, String sound) {
        this.species = species;
        this.age = age;
        this.gender = gender;
        this.sound = sound;
    }

    public void grow() {
        age++;
    }

    public abstract void makeSound();

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getSound() {
        return sound;
    }
}
