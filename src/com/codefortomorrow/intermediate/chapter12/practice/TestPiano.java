package com.codefortomorrow.intermediate.chapter12.practice;

/*
Create the Piano class such that
when you call the playTriad() method,
it calls the play() method from the
Instrument class 3 times.

Also make sure to call the 1-argument superclass
constructor in both the default and 2-argument
Piano constructors. (The name of the instrument
is "piano".)

UML diagram for the Piano class:

                        Piano
------------------------------------------------------
- hammerWeight: double
- backPostMaterial: String
------------------------------------------------------
+ Piano()
+ Piano(hammerWeight: double, backPostMaterial: String)
+ playTriad(): void
+ toString(): String


Note: For the toString() method, you
can do whatever you want as long as
it displays the Piano object well.
 */

public class TestPiano {
	public static void main(String[] args) {
		// uncomment the 2 following lines to test the Piano class
//		Piano yamahaPiano = new Piano(22, "spruce");
//		yamahaPiano.playTriad();
	}
}

class Piano extends Instrument {
	// write code here
}

class Instrument {
	private String name;

	public Instrument() {
		name = "";
	}

	public Instrument(String name) {
		this.name = name;
	}

	public void play() {
		System.out.println("Playing instrument");
	}

	@Override
	public String toString() {
		return "Instrument, name: " + name;
	}
}


