/**
 * Created by shour on 1/28/2020 at 9:06 AM
 */
package DataStructures.Arrays;

import java.util.*;

public class Pokemon {
    private String name;
    private String[] attacks;
    private int hp;

    public Pokemon(String name, String[] attacks, int hp) {
        this.name = name;
        this.attacks = attacks;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public String[] getAttacks() {
        return attacks;
    }

    public int getHp() {
        return hp;
    }

    /**
     * Adds an attack to the array. Considers if the Array has empty space
     * or needs to have a spot created.
     * @param newAttack The new attack that is added
     */
    public void addAttack(String newAttack){
        boolean emptySpace = false;
        int freeIndex = -1;
        for (int i = 0; i < attacks.length; i++) {
            if (attacks[i] == null || attacks[i].equals("")) {
                emptySpace = true;
                freeIndex = i;
                break;
            }
        }
        if (emptySpace) {
            attacks[freeIndex] = newAttack;
        }
        else {
            String[] newAttacks = new String[attacks.length + 1];
            for (int i = 0; i < attacks.length; i++) {
                newAttacks[i] = attacks[i];
            }
            newAttacks[attacks.length] = newAttack;
            attacks = newAttacks;
        }
    }

    /**
     * Sorts in Alphabetical Order and add attack
     * @param newAttack Attack Being Added
     */
    public void addAttacksInOrder(String newAttack) {
        addAttack(newAttack);
        Arrays.sort(attacks);
    }

    /**
     * Creates an Array of Pokemon containing all pokemon with hp > 100 in a given Array
     * @param current the current pokemon that need to be sorted
     * @return the new Pokemon Array
     */
    public Pokemon[] isGood(Pokemon[] current) {
        Arrays.sort(current, new ComparePokemonHP());
        Pokemon[] newPok = null;
        int indexOf100 = -1;
        for (int i = 0; i < current.length; i++) {
            if (current[i].getHp() > 100) {
                indexOf100 = i;
                newPok = new Pokemon[current.length - indexOf100];
                for (int x = indexOf100; x < current.length; x++) {
                    newPok[i - indexOf100] = current[i];
                }
                break;
            }
        }

        if (indexOf100 == -1) {
            return null;
        }
        return newPok;
    }

    @Override
    public String toString() {
        return ("Name: " + name + "; HP = " + hp + "; Moves: " + Arrays.toString(attacks) + "\n");
    }
}

