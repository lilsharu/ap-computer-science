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
public class LastLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! Today, I will output the last letter of a String!");
            System.out.println("What String do you want to get the last letters of?");
                String word = input.nextLine();
                int len = word.length();
                int lastPosition = len-1;
                char character = word.charAt(lastPosition);
            System.out.println("The last letter of " + word + " is " + character);
    }
}