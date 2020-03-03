package DataStructures.MultidimensionalArrays;

import java.util.Arrays;

public class FillWithName {
    public static void main(String[] args) {
        print2DArray(fillWithMyName(new String[6][6]));
    }
    public static String[][] fillWithMyName(String[][] name) {
        for (int i = 0; i < name.length; i++) {
            for (int k = 0; k < name[i].length; k++){
                name[i][k] = "Shourya Bansal";
            }
        }
        return name;
    }

    public static void print2DArray(String[][] arr) {
        for (String[] array : arr) {
            for (String element : array) {
                System.out.print(element + " ");
            }
            System.out.print("\n");
        }
    }
}
