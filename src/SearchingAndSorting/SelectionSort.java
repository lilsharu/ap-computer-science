package SearchingAndSorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {9, 1, 5, 6, 2, 8, 2, 6, 7};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            int min = arr[i];

            for (int k = i; k < arr.length; k++) {
                int kInt = arr[k];
                if (kInt < min) {
                    min = arr[k];
                    index = k;
                }
            }

            int temp = arr[i];
            arr[i] = min;
            arr[index] = temp;
        }
    }
}
