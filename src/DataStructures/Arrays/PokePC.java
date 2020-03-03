/**
 * Created by shour on 1/28/2020 at 9:43 AM
 */
package DataStructures.Arrays;

import java.util.*;
import java.io.*;

public class PokePC {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", new String[6], 210);

        String[] squirtleMoveset = {"Water Gun", "Squirt", "Splash"};
        Pokemon squirtle = new Pokemon("Squirtle", squirtleMoveset, 175);

        System.out.println(Arrays.toString(squirtle.getAttacks()));

        squirtle.addAttack("Hydro Pump");
        System.out.println(Arrays.toString(squirtle.getAttacks()));

        String[] randoAttacks = {"Ching", "Chang", "Chong"};
        Pokemon a = new Pokemon("Test", randoAttacks, 1);
        Pokemon b = new Pokemon("John", randoAttacks, 1);
        Pokemon c = new Pokemon ("Chan", randoAttacks, 1);

        Pokemon[] test = {a, b, c, a, b};
        PokemonPC tester = new PokemonPC(test);
        System.out.println(Arrays.toString(tester.getPokemon()));

        System.out.println(tester.order());

    }
}
