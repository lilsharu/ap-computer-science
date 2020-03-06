package SearchingAndSorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 9, 3, 5, 0, 7, 1, 4, 6, 3};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Uses an Insertion Sort to sort through an array
     *
     * @param arr The array being sorted
     */
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int k = i; k > 0 && arr[k] < arr[k - 1]; k--) {
                int temp = arr[k];
                arr[k] = arr[k - 1];
                arr[k - 1] = temp;
            }
        }
    }
}
