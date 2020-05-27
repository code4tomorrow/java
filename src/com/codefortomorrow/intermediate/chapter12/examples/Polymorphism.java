package com.codefortomorrow.intermediate.chapter12.examples;

public class Polymorphism {
	public static void main(String[] args) {
		Animal myDog = new Dog();

		Animal[] animals = {
				new Dog(),
				new Cat(),
				new Chicken()
		};

		if (myDog instanceof Dog) { // true
			System.out.println(1);
		}

		if (myDog instanceof Animal) { // true
			System.out.println(2);
		}

		Animal myAnimal = new Animal();

		if (myAnimal instanceof Dog) { // false
			System.out.println(3);
		}

//		if (myAnimal instanceof String) { // compile error (inconvertible types)
//			System.out.println(4);
//		}

		for (Animal a: animals) {
			if (a instanceof Dog) {
				((Dog) a).bark(); // must cast before calling a subclass method
			} else if (a instanceof Cat) {
				((Cat) a).meow();
			} else if (a instanceof Chicken) {
				((Chicken) a).cluck();
			} else {
				System.out.println("Not a dog, cat, or chicken");
			}
		}
	}
}

class Animal {
	public Animal() {
	}
}

class Dog extends Animal {
	public Dog() {
	}

	public void bark() {
		System.out.println("Woof!");
	}
}

class Chicken extends Animal {
	public Chicken() {
	}

	public void cluck() {
		System.out.println("Cluck!");
	}
}

class Cat extends Animal {
	public Cat() {
	}

	public void meow() {
		System.out.println("Meow!");
	}
}


