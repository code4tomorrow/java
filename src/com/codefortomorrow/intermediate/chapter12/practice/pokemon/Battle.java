package com.codefortomorrow.intermediate.chapter12.practice.pokemon;

import java.util.Scanner;

public class Battle {
    private Pokemon pokemonOne;
    private Pokemon pokemonTwo;
    private int turn;

    public Battle (Pokemon pokemonOne, Pokemon pokemonTwo) {
        this.pokemonOne = pokemonOne;
        this.pokemonTwo = pokemonTwo;
        turn = 1;
    }

    public void runBattle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("It's " + pokemonOne.getName() + "'s move!");

        Move[] pokemonOneMoves = pokemonOne.getMoveList();
        for (int i = 1; i <= pokemonOneMoves.length; i++) {
            System.out.println(i + ": " + pokemonOneMoves[i]);
        }
        System.out.println("Move #: ");

        int move = sc.nextInt();
        pokemonOne.attack(pokemonTwo, move);
    }
}