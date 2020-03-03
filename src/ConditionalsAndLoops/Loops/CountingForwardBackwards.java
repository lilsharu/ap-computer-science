package ConditionalsAndLoops.Loops;

public class CountingForwardBackwards {
    public static void main(String[] args) {
        for (int i = 10; i <= 55; i++) {
            System.out.print(i + ", ");
        }
        System.out.print("\n");
        for (int i = 55; i >= 10; i--){
            System.out.print(i + ", ");
        }
    }
}