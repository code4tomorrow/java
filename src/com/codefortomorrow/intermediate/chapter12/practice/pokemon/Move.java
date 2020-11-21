package com.codefortomorrow.intermediate.chapter12.practice.pokemon;

/**
 * represents a Pokemon's move
 */
public class Move {

    private String name;
    private boolean poisoning;
    private boolean sleeping;
    private boolean paralyzing;
    private boolean burning;
    private boolean freezing;
    private int baseDamage;

    /**
     * Constructs a Move object. This has been done for you.
     * @param name move's name
     * @param poisoning whether the move poisons
     * @param sleeping whether the move sleeps
     * @param paralyzing whether the move paralyzes
     * @param burning whether the move burns
     * @param freezing whether the move freezes
     * @param baseDamage base damage of the move
     */
    public Move(
        String name,
        boolean poisoning,
        boolean sleeping,
        boolean paralyzing,
        boolean burning,
        boolean freezing,
        int baseDamage
    ) {
        this.name = name;
        this.poisoning = poisoning;
        this.sleeping = sleeping;
        this.paralyzing = paralyzing;
        this.burning = burning;
        this.freezing = freezing;
        this.baseDamage = baseDamage;
    }

    /**
     * calculates the move's damage by multiplying the base damage of the move by the given level
     * @param level the Pokemon's level
     * @return the move's total damage
     */
    public int calculateDamage(int level) {
        return 0; //TODO: Fix
    }

    public String getName() {
        return name;
    }
}
