/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ObjectOrientedProgramming.UsingObjects;

import java.util.Scanner;

public class RoundDecimalWhatever {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What do you want to round?");
            double toRound = input.nextDouble();
            input.nextLine();
        System.out.println("Do you want to decimals or to Whole Numbers?");
            String roundBy = input.nextLine();
        if (roundBy.equals("Whole Numbers") || roundBy.equals("Whole")|| roundBy.equals("WN") || roundBy.equals ("W")){
                System.out.println("To what place do you want to round to?");
                int decimals = input.nextInt();
                double middleValue = toRound / Math.pow(10, decimals);
                middleValue += 0.5;
                int toGo = (int)middleValue;
                double output = (int)(toGo*Math.pow(10, decimals));
            System.out.println("Your new number is " + output);
        }
        
        else {
            System.out.println("To how many decimal places do you want to round to?");
                int decimals = input.nextInt();
                double middleValue = toRound * Math.pow(10, decimals);
                middleValue += 0.5;
                int toGo = (int)middleValue;
                double output = toGo/Math.pow(10, decimals);
            System.out.println("Your new number is " + output);
        }
    }
}
