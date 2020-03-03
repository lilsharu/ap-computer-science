package ConditionalsAndLoops.Loops;

public class NestedForLoopDesigns {
    public static void main(String[] args) {
        fancyXTriangle(3);
    }
    public static void xRectangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int x = 0; x < n; x++) {
                System.out.print("x");
            }
            System.out.print("\n");
        }
    }
    public static void xTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int x = 0; x < i; x++) {
                System.out.print("x");
            }
            System.out.print("\n");
        }
    }
    public static void numberedTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int x = 1; x <= i; x++) {
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
    public static void numberedTriangle2(int n) {
        for (int i = 0; i < n; i++) {
            for (int x = 1; x <= i; x++) {
                System.out.print(x);
            }
            System.out.print("\n");
        }
    }
    public static void numberedSquare(int n) {
        int counter = 1;
        for (int i = 0; i < n; i++) {
            for (int x = 0; x < n; x++) {
                System.out.print(counter);
                counter++;
            }
            System.out.print("\n");
        }
    }
    public static void numberedSquare2(int n) {
        int max = n * n;
        int x = 10;
        int num = 1;
        int count = 0;
        String space = "";
        while (x < max) {
            x *= 10;
            num++;
        }
        int counter = 1;
        for (int i = 0; i < n; i++) {
            for (int y = 0; y < n; y++) {
                for (int z = 1; z <= num; z ++){
                    if (counter < Math.pow(10, z)) {
                        for (int w = 0; w < z; w++) {
                            space += " ";
                        }
                    }
                }
                System.out.print(counter + space);
                counter++;
                space = "";
            }
            System.out.print("\n");
        }
    }
    public static void numberedTriangle3(int n) {
        int counter = 1;
        for (int i = 0; i < n; i++) {
            for (int x = 0; x < i; x++) {
                System.out.print(counter);
                counter++;
            }
            System.out.print("\n");
        }
    }
    public static void xTriangleSideways (int n) {
        int a = 1;
        boolean up = true;
        for (int i = 0; i < (2*n -1); i++) {
            for (int x = 0; x < a; x++) {
                System.out.print("x");
            }
            System.out.println("");
            if (a == n) up = false;
            if (up) {
                a++;
            }
            else {
                a--;
            }
        }
    }
    public static void fancyXTriangle (int n) {
        for (int i = 0; i < 2*n - 1; i ++) {
            for (int x = 0; x < n - Math.abs(i - n); x++) {
                System.out.print("x");
            }
            System.out.println("");
        }
    }
    public static void xoSquare (int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int x = 0; x < n; x++) {
                if ((count %= 2) == 0) System.out.print("x");
                else System.out.print("o");
                count++;
            }
            System.out.println("");
        }
    }
}
