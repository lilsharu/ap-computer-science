/**
 * Created by shour on 1/31/2020 at 8:09 AM
 */
package DataStructures.Arrays;

import java.util.*;
import java.io.*;

public class PokemonPC {
    private Pokemon[] pokemon;

    public PokemonPC(Pokemon[] pokemon) {
        this.pokemon = pokemon;
    }

    public Pokemon[] getPokemon() {
        return this.pokemon;
    }

    /**
     * Adds a new Pokemon in the specified index. Everything else gets pushed forward and the
     * size of the array increases by 1;
     *
     * @param pokemon the new pokemon being added
     * @param index   the index of the pokemon you want
     */
    public void insert(Pokemon pokemon, int index) {
        Pokemon[] newPok = new Pokemon[this.pokemon.length + 1];
        int originalIndex = 0;
        for (int i = 0; i < newPok.length; i++) {
            if (i == index) {
                newPok[i] = pokemon;
            } else {
                newPok[i] = this.pokemon[originalIndex];
                originalIndex++;
            }
        }
        this.pokemon = newPok;
    }

    /**
     * Removes Pokemon with given name
     *
     * @param name name that we are removing
     */
    public void remove(String name) {
        Pokemon[] newPokemon = new Pokemon[pokemon.length - 1];
        int index = -1;
        for (int i = 0; i < pokemon.length; i++) {
            if (pokemon[i].getName().equals(name)) {
                index = i;
                break;
            }
        }
        int newIndex = 0;
        for (int i = 0; i < pokemon.length; i++) {
            if (i == index) {
                continue;
            } else {
                newPokemon[newIndex] = pokemon[i];
                newIndex++;
            }
        }
    }

    /**
     * Array of pokemon with hp greater than 100
     * @param pokemon array of pokemon to be used
     * @return only hp > 100
     */
    public Pokemon[] getGood(Pokemon[] pokemon) {
        int count = 0;
        for (Pokemon p : pokemon) {
            if (p.getHp() > 100) count++;
        }
        Pokemon[] newPokemon = new Pokemon[count];
        if (count == 0)
            return null;
        int index = 0;
        for (Pokemon p : pokemon) {
            if (p.getHp() > 100){
                newPokemon[index] = p;
                index++;
            }
        }
        return newPokemon;
    }


    /**
     * Array of pokemon with hp greater than 100
     * @return only hp > 100
     */
    public Pokemon[] getGood() {
        int count = 0;
        for (Pokemon p : pokemon) {
            if (p.getHp() > 100) count++;
        }
        Pokemon[] newPokemon = new Pokemon[count];
        if (count == 0)
            return null;
        int index = 0;
        for (Pokemon p : pokemon) {
            if (p.getHp() > 100){
                newPokemon[index] = p;
                index++;
            }
        }
        return newPokemon;
    }

    /**
     * Inserts a pokemon and sorts
     *
     * @param name    Name of Pokemon
     * @param attacks Pokemon Attacks
     * @param hp      HP
     */
    public void insert(String name, String[] attacks, int hp) {
        Pokemon toInsert = new Pokemon(name, attacks, hp);
        this.insert(toInsert, 0);
        Arrays.sort(pokemon, new ComparePokemonName());
    }

    public ArrayList<String> whoHasThisAttack(String attack) {
        ArrayList<String> names = new ArrayList<>();
        for (Pokemon p : pokemon) {
            for (String a : p.getAttacks())
                if (a.equals(attack)) {
                    names.add(p.getName());
                    break;
                }
        }
        return names;
    }

    /**
     * Make a list of Pokemon names in Alphabetical order by name
     */
    public ArrayList<Pokemon> order() {
        ArrayList<Pokemon> list = new ArrayList<>(Arrays.asList(pokemon));
        for (int i = 0; i < list.size(); i++){
            if (i + 1 == list.size()) {
                break;
            }
            if (list.get(i).getName().compareTo(list.get(i+1).getName()) > 0) {
                Pokemon temp = list.get(i);
                list.remove(i);
                list.add(i+1, temp);
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            if (i == 0) {
                break;
            }
            if (list.get(i).getName().compareTo(list.get(i - 1).getName()) < 0) {
                Pokemon temp = list.get(i);
                list.remove(i);
                list.add(i - 1, temp);
            }
        }
        return list;
    }

    /**
     * The order method we went over in class
     * @return the ordered ArrayList
     */
    public ArrayList<String> orderReview() {
        ArrayList<String> names = new ArrayList<>();
        names.add(pokemon[0].getName());
        for (int i = 1; i < pokemon.length; i++) {
            Pokemon p = pokemon[i];
        }
        return null;
    }
}

class ComparePokemonHP implements Comparator<Pokemon> {
    @Override
    public int compare(Pokemon o1, Pokemon o2) {
        return o1.getHp() - o2.getHp();
    }
}

class ComparePokemonName implements Comparator<Pokemon> {
    @Override
    public int compare(Pokemon o1, Pokemon o2) {
        return o1.getName().compareTo(o2.getName());
    }
}