/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ObjectOrientedProgramming.UsingObjects;

import java.util.Scanner;

public class RoundDecimal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What number do you want to round?");
            double in = input.nextDouble();
            double inUp = in * 100;
            int inUP2 = (int)(inUp);
            double out = inUP2/100;
        System.out.println("Rounded to two decimal places is " + out);
    }
    
}
