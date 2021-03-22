package com.codefortomorrow.intermediate.chapter12.examples;

public class TestInstrument {

    public static void main(String[] args) {
        // construct a new Guitar object
        Guitar taylorGuitar = new Guitar("acoustic", "steel");

        // print the Guitar object
        System.out.println(taylorGuitar);

        // prints "Playing instrument" 6 times
        taylorGuitar.strum();
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

class Guitar extends Instrument {

    private String type;
    private String stringType;

    public Guitar() {
        super("guitar");
        type = "acoustic";
        stringType = "steel";
    }

    public Guitar(String type, String stringType) {
        super("guitar");
        this.type = type;
        this.stringType = stringType;
    }

    public void strum() {
        for (int i = 0; i < 6; i++) {
            super.play(); // use super.methodName() to call a superclass method
        }
    }

    @Override
    public String toString() {
        return stringType + "-string " + type + " guitar";
    }
}
