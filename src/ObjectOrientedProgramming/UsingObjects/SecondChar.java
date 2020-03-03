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
public class SecondChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! I am a program that will name the second character in a word or phrase!");
        System.out.println("What work do you want to use?");
            String word = input.nextLine();
        System.out.println("Calculating...");
        System.out.println("Calculating.....");
            char character = word.charAt(1);
        System.out.println("Calculated!");
        System.out.println("The second character is " + character);
    }
    
}
