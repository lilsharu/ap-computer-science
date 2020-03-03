package ConditionalsAndLoops.Loops;
import java.util.Scanner;

public class PasswordFor {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("You have 5 tries.");
        System.out.print("Password: ");
        String input = read.nextLine();
        int i = 0;
        for (i = 0; i < 4 && !input.equals("Password"); i++) {
            System.out.println("The Password you have entered is incorrect. Please Try Again.");
            System.out.println("You have " + (5 -  i) + " tries remaining");
            System.out.print("Password: ");
                input = read.nextLine();

        }
        if (i > 5) {
            System.out.println("You have lost all of your tries. Sorry");
        }
        else {
            System.out.println("Welcome! A huge Adventure Awaits");
        }
    }
}
