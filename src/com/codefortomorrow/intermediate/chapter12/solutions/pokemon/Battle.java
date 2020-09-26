package com.codefortomorrow.intermediate.chapter12.solutions.pokemon;

import java.util.Scanner;

public class Battle {
    private Scanner sc = new Scanner(System.in);
    private Pokemon pokemonOne;
    private Pokemon pokemonTwo;
    private int turn;

    public Battle(Pokemon pokemonOne, Pokemon pokemonTwo) {
        this.pokemonOne = pokemonOne;
        this.pokemonTwo = pokemonTwo;
        turn = 1;
    }

    public void runBattle() {
        while (true) {
            if (turn == 1) {
                executeTurn(pokemonOne, pokemonTwo);
            } else {
                executeTurn(pokemonTwo, pokemonOne);
            }
            System.out.println(pokemonOne);
            System.out.println(pokemonTwo);
            if (
                pokemonOne.getCurrentHP() <= 0 || pokemonTwo.getCurrentHP() <= 0
            ) {
                break;
            }
        }
    }

    public void executeTurn(Pokemon pokemon, Pokemon other) {
        System.out.println("It's " + pokemon.getName() + "'s move!");

        Move[] pokemonMoves = pokemon.getMoveList();
        for (int i = 1; i <= pokemonMoves.length; i++) {
            System.out.println(i + ": " + pokemonMoves[i - 1].getName());
        }
        System.out.print("Move #: ");
        int move = sc.nextInt();
        pokemon.attack(other, move - 1);
        System.out.println();

        if (turn == 1) {
            turn = 0;
        } else {
            turn = 1;
        }
    }
}
