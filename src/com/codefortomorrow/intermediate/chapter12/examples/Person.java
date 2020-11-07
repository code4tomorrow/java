package com.codefortomorrow.intermediate.chapter12.examples;

public class Person {

    private String name;
    private int age;
    private String address;
    private boolean hungry;

    /** Constructs a default Person object */
    public Person() {
        name = "";
        age = 0;
        address = "";
        hungry = false;
    }

    /**
     * Constructs a Person object with a given name,
     * age, address, and hunger status
     * @param name  name of person
     * @param age  how old the person is, in years
     * @param address  address of person
     * @param hungry  whether the person is hungry or not
     */
    public Person(String name, int age, String address, boolean hungry) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.hungry = hungry;
    }

    /**
     * Prints a given message
     * (makes the person talk)
     * @param message  message to print
     */
    public void talk(String message) {
        System.out.println(message);
    }

    /**
     * Eats the specified food
     * and sets isHungry to false
     * @param food  food to eat
     */
    public void eat(String food) {
        System.out.println("Eating " + food);
        hungry = false;
    }

    /**
     * Makes the person walk
     * and sets isHungry to true
     */
    public void walk() {
        System.out.println("Walking");
        hungry = true;
    }

    /** Returns the person's name */
    public String getName() {
        return name;
    }

    /** Sets the person's name to a new specified name */
    public void setName(String name) {
        this.name = name;
    }

    /** Returns the person's age */
    public int getAge() {
        return age;
    }

    /** Sets the person's age to a new specified age */
    public void setAge(int age) {
        this.age = age;
    }

    /** Returns the person's address */
    public String getAddress() {
        return address;
    }

    /** Sets the person's address to a new specified address */
    public void setAddress(String address) {
        this.address = address;
    }

    /** Returns true if the person is hungry */
    public boolean isHungry() {
        return hungry;
    }

    /** Sets hungry to a specified value */
    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }
}
