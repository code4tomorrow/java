package com.codefortomorrow.intermediate.chapter12.solutions;

/*
Create the Piano class (which inherits the Instrument class)
such that when you call the playTriad() method,
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
        Piano yamahaPiano = new Piano(22, "spruce");
        yamahaPiano.playTriad();
    }
}

class Piano extends Instrument {
    private double hammerWeight;
    private String backPostMaterial;

    public Piano() {
        super("piano");
        hammerWeight = 20;
        backPostMaterial = "oak";
    }

    public Piano(double hammerWeight, String backPostMaterial) {
        super("piano");
        this.hammerWeight = hammerWeight;
        this.backPostMaterial = backPostMaterial;
    }

    public void playTriad() {
        for (int i = 0; i < 3; i++) {
            super.play();
        }
    }

    @Override
    public String toString() {
        return (
            "Piano with " +
            hammerWeight +
            "pound hammers and a " +
            backPostMaterial +
            " back post"
        );
    }
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
