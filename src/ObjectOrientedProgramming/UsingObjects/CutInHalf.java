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
public class CutInHalf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("I am a program that will split a String into two halves");
        System.out.println("What String should I split?");
            String word = input.nextLine();
            int len = word.length();
            int halfLength = len/2;
            String firstHalf = word.substring(0, halfLength);
            String secondHalf = word.substring(halfLength, len);
        System.out.println("The first half of your String is: " + firstHalf 
        + "\n The Second half of your String is " + secondHalf);
    }
}
