/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ObjectOrientedProgramming.UsingObjects;
import java.util.Scanner;

/**
 *
 * @author shourya.bansal
 */
public class RemovePhraseQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your phrase?");
            String phrase = input.nextLine();
        System.out.println("What word/phrase do you want to remove?");
            String remove = input.nextLine();
            int first = phrase.indexOf(remove);
            String word1 = phrase.substring(0, first);
            String word2 = phrase.substring(first+remove.length());
            String output = word1 + word2;
        System.out.println("Your new phrase is: " + output);
    }
    
}
