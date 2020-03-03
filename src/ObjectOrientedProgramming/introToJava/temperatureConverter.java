/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ObjectOrientedProgramming.introToJava;
import java.util.Scanner;

/*
 * @author shourya.bansal
 */
public class temperatureConverter {
    final static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("What do you want to convert from? (i.e. Celsius or Farenhiet)");
        String type = input.next();
        if (type.equals("Farenheit") || type.equals("farenheit") || type.equals("f") || type.equals("F")){
            fToC();
        }
        else if (type.equals("Celsius") || type.equals("celsius") || type.equals("c") || type.equals("C")){
            cToF();
        }
        else {
            System.out.println("I'm very sorry; I don't understand what you are trying to say. Try again.");
        }
    }
    public static void fToC(){
        System.out.println("What temperature do you want to convert?");
        double temperature = input.nextDouble();
        double celsius = (temperature - 32)*(double)(5)/(9);
        System.out.println(temperature + " degrees farenheit is " + celsius + " degrees celsius");        
    }
    public static void cToF(){
        System.out.println("What temperature do you want to convert?");
        double temperature = input.nextDouble();
        double farenheit = (temperature * 9)/(5) + 32;
        System.out.println(temperature + " degrees celsius is " + farenheit +
                " degrees farenheit");  
    }
}
