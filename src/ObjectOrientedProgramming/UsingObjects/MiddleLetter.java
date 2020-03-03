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
public class MiddleLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! Let us identify the Middle Letter of your word?");
        System.out.println("What is your word?");
            String word = input.next();
        System.out.println("Let me calculate the Middle Letter.");
            int len = word.length() - 1;
            int middlePosition = len/2;
            char middleChar = word.charAt(middlePosition);
        System.out.println("The Middle Character is " + middleChar);
    }   
}
