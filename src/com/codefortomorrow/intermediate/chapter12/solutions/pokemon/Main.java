package com.codefortomorrow.intermediate.chapter12.solutions.pokemon;

public class Main {

    public static void main(String[] args) {
        Move a1 = new Move("Water Gun", false, false, false, false, false, 15);
        Move a2 = new Move("Tackle", false, false, false, false, false, 10);
        Move a3 = new Move("Bubble", false, false, false, false, false, 16);
        Move a4 = new Move(
            "Water Splash",
            false,
            false,
            false,
            false,
            false,
            6
        );
        Move[] moveListA = { a1, a2, a3, a4 };
        Pokemon a = new Pokemon(
            moveListA,
            40,
            0,
            "Squirtle",
            "Water",
            "Squirtle",
            1
        );

        Move b1 = new Move(
            "Thunder Shock",
            false,
            false,
            false,
            false,
            false,
            25
        );
        Move b2 = new Move("Slam", false, false, false, false, false, 16);
        Move b3 = new Move(
            "Quick Attack",
            false,
            false,
            false,
            false,
            false,
            10
        );
        Move b4 = new Move("Thunder", false, false, false, false, false, 6);
        Move[] moveListB = { b1, b2, b3, b4 };
        Pokemon b = new Pokemon(
            moveListB,
            30,
            0,
            "Pikachu",
            "Electric",
            "Pikachu",
            1
        );
        Battle battle = new Battle(a, b);
        battle.runBattle();
    }
}
