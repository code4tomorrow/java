package com.codefortomorrow.intermediate.chapter12.practice.pokemon;

/**
 * represents a Pokemon object
 */
public class Pokemon {
    private Move[] moveList;
    private int maxHP;
    private int currentHP;
    private int XP;
    private String species;
    private String type;
    private String name;
    private int level;
    private boolean poisoned;
    private boolean asleep;
    private boolean paralyzed;
    private boolean burned;
    private boolean frozen;
    private boolean fainted;

    /**
     * Complete this constructor. The move list should be initialized to an empty array of size 4.
     * Both Max HP and Current HP should be set to 40. Name should be set to species. Level should be
     * set to 1. XP should be set to 0. All effects should be set to false, including fainted.
     * @param species the species of the Pokemon
     * @param type type of the Pokemon
     */
    public Pokemon(String species, String type) {

    }

    /**
     * Complete this constructor. See the above constructor for default values.
     * @param species the species of the Pokemon
     * @param type of the Pokemon
     * @param name the name/nickname of the Pokemon
     */
    public Pokemon(String species, String type, String name) {

    }

    /**
     * Complete this constructor. See the first constructor for default values.
     */
    public Pokemon(Move[] moveList, int maxHP, int XP, String species, String type, String name, int level) {

    }

    /**
     * Places given move in the moveList at the given index. If a move was previously present, it
     * is replaced, and returned
     * @param index the index to place the move
     * @param move the move to learn
     * @return old move or null if not applicable
     */
    public Move learnMove(int index, Move move) {

    }

    /**
     * attacks enemy Pokemon with the move at the given moveIndex
     * @param enemy enemy Pokemon
     * @param moveIndex index of the move to make
     */
    public void attack(Pokemon enemy, int moveIndex) {

    }

    /**
     * Subtracts damage from currentHP
     * @param damage damage to take
     */
    public void takeDamage(int damage) {

    }

    /**
     * Adds given HP to current HP
     * @param hp given hp to heal
     */
    public void heal(int hp) {

    }

    public String getName() {

    }

    public Move[] getMoveList() {

    }
}
