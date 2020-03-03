package DataStructures.Arrays;

public class ArrayPrograms {
    public static int sumOfTerms(int[] array) {
        int count = 0;
        for (int chang : array) {
            count += chang;
        }
        return count;
    }

    public static double sumOfTerms(double[] array) {
        double count = 0;
        for (double ching : array) {
            count += ching;
        }
        return count;
    }

    public static double average(int[] array) {
        int sum = sumOfTerms(array);
        return (double) sum / array.length;
    }

    public static double average(double[] array) {
        double sum = sumOfTerms(array);
        return sum / array.length;
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int var : array) {
            if (var < smallest) smallest = var;
        }
        return smallest;
    }

    public static double smallest(double[] array) {
        double smallest = array[0];
        for (double i : array) {
            if (i < smallest) smallest = i;
        }
        return smallest;
    }

    public static boolean contains5(int[] array) {
        for (int i : array) {
            if (i == 5) return true;
        }
        return false;
    }

    public static boolean contains5(double[] array) {
        for (double i : array) {
            if (i == 5.0) return true;
        }
        return false;
    }
}
