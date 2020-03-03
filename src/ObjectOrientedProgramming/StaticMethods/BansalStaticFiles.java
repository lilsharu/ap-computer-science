/*
 @author shourya.bansal
*/

import java.util.*;

public class BansalStaticFiles {
    public static double cylinderVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }
    
    public static String middleThree(String word) {
        int length = word.length();
        int position = length/2;
        String word1 = word.substring(0, position-1);
        String word2 = word.substring((position+1)+1);
        return word1 + word2;
    }
    
    public static double[] quadSolver(double a, double b, double c) {
        double[] solution = new double[2];
        solution[0] = (-b + Math.sqrt(Math.pow(b, 2)-(4*a*c))/(2*a));
        solution[1] = (-b - Math.sqrt(Math.pow(b, 2)-(4*a*c))/(2*a));
        return solution;
    }
    
    public static void separateData(String entered){
        StringTokenizer st = new StringTokenizer(entered);
        String firstName = st.nextToken();
        String lastName = st.nextToken();
        int ID = Integer.parseInt(
                entered.substring(entered.indexOf(", ") + 2)
        );
        
        //Prints stuff
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("ID: " + ID);
    }
    
    public static double mortgage(double principal, double annualRate, int years) {
        annualRate /= 100;
        double montlyRate = annualRate / 12;
        int numberOfPayments = 12 * years;
        double monthlyPaymentUnrounded = principal * (
                (montlyRate * Math.pow(1+montlyRate, numberOfPayments))
                /
                ((Math.pow(1 + montlyRate, numberOfPayments))-1));
        double monthlyPayment = ((int)(monthlyPaymentUnrounded * 100 + 0.5))/100.0;
        return monthlyPayment;
    }
}
