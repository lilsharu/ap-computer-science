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
public class NameListSeperator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("I will seperate multiple names in a list with commas. \nPlease enter the names, using commas to seperate multiple different names");
            String name = input.nextLine();
        System.out.println("Now, to seperate....");
            String namePart;
            int counter = 1;
        while (name.indexOf(",") != -1){
            int spacePosition = name.indexOf(",");
            namePart = name.substring(0, spacePosition);
            System.out.println("Name " + counter + " is " + namePart);
            name = name.substring(spacePosition + 1);
            counter++;
        }
        if (name.indexOf(",") == -1){
            System.out.println("Name " + counter + " is " + name);
        }
    }
    
}
