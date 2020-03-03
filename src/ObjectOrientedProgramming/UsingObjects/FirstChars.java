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
public class FirstChars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! Today, I will output the first few characters of a String!" 
        + " How many letters do you want of the String?");
            int letters = input.nextInt();
            System.out.println("What String do you want to get the first charecters of?");
            String word = input.next();
            int length = word.length();
            if (letters > length){
                System.out.println("Sorry, that won't work. You want more characters than charecters exist in your String");
            }
            else{
                String firstLetters = word.substring(0, letters);
                System.out.println("The first letters of " + word + " are " + firstLetters);
            }
    }  
}