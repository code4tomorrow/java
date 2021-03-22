package com.codefortomorrow.intermediate.chapter12.solutions.pokemon;

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
        this.species = species;
        this.type = type;
    }

    /**
     * Complete this constructor. See the above constructor for default values.
     * @param species the species of the Pokemon
     * @param type of the Pokemon
     * @param name the name/nickname of the Pokemon
     */
    public Pokemon(String species, String type, String name) {
        this.species = species;
        this.type = type;
        this.name = name;
    }

    /**
     * Complete this constructor. See the first constructor for default values.
     */
    public Pokemon(
        Move[] moveList,
        int maxHP,
        int XP,
        String species,
        String type,
        String name,
        int level
    ) {
        this.moveList = moveList;
        this.maxHP = maxHP;
        this.XP = XP;
        this.species = species;
        this.type = type;
        this.name = name;
        this.level = level;
        currentHP = maxHP;
    }

    /**
     * Places given move in the moveList at the given index. If a move was previously present, it
     * is replaced, and returned
     * @param index the index to place the move
     * @param move the move to learn
     * @return old move or null if not applicable
     */
    public Move learnMove(int index, Move move) {
        Move oldMove = moveList[index];
        moveList[index] = move;
        return oldMove;
    }

    /**
     * attacks enemy Pokemon with the move at the given moveIndex
     * @param enemy enemy Pokemon
     * @param moveIndex index of the move to make
     */
    public void attack(Pokemon enemy, int moveIndex) {
        int damage = moveList[moveIndex].calculateDamage(level);
        enemy.takeDamage(damage);
        System.out.println(
            name +
            " used " +
            moveList[moveIndex].getName() +
            " on " +
            enemy.getName()
        );
        System.out.println(enemy.getName() + " took " + damage + " damage.");
    }

    /**
     * Subtracts damage from currentHP. Returns true if Pokemon fainted
     * @param damage damage to take
     */
    public boolean takeDamage(int damage) {
        currentHP -= damage;
        if (currentHP < 0) {
            currentHP = 0;
            return true;
        }
        return false;
    }

    /**
     * Adds given HP to current HP
     * @param hp given hp to heal
     */
    public void heal(int hp) {
        if (currentHP + hp > maxHP) {
            currentHP = maxHP;
            return;
        }
        currentHP += hp;
    }

    public String getName() {
        return name;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public Move[] getMoveList() {
        return moveList;
    }

    public String toString() {
        return name + "\n" + "HP: " + currentHP + " / " + maxHP;
    }
}
