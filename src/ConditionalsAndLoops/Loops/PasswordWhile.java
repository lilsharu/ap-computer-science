package ConditionalsAndLoops.Loops;
import java.util.Scanner;

public class PasswordWhile {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Password: ");
            String input = read.nextLine();
        while (!input.equals("Password")) {
            System.out.println("Wrong Password. Please Try Again.");
            System.out.print("Password?");
                input = read.nextLine();
            if (input.equals("Password")) break;
        }
        System.out.println("Congratulations. Welcome to the PC. A whole new adventure awaits thee...");
    }
}
