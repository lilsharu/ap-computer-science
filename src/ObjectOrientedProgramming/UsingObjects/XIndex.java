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
public class XIndex {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! I will find the location of a character, if it exists, in a String!");
        System.out.print("Please input a String:");
            String word = input.nextLine();
        System.out.print("Thank you! Which letter are you looking for?");
            String character = input.next();
            int position = word.indexOf(character);
        if (position==-1){
            System.out.println("I'm Sorry. The character you are looking for is not in the String");
        }
            System.out.println("You character first shows up at position " + position + ", so it letter number " +
                    (position+1));
            int counter = 1;
            String nextString = word.substring(position+1);
            while (-1!= nextString.indexOf(character)){
                counter++;
                nextString = nextString.substring(nextString.indexOf(character+1));
            }
            System.out.println("The character " + character + " shows up " + counter + " times");
    }
}
