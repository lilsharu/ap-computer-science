/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ObjectOrientedProgramming.UsingObjects;

/**
 *
 * @author shourya.bansal
 */
import java.util.Scanner;
public class AllButFirstAndLast {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Hello! I will give return any String with all but the first and last letters!");
        System.out.println("What String should I use?");
            String word = input.nextLine();
            int length = word.length();
            int lastLetter = length -1;
            String output = word.substring(1, lastLetter);
        System.out.println("The String without its first and last letters is " + output);
    }
}
