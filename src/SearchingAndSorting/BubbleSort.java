package SearchingAndSorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 9, 3, 5, 0, 7, 1, 4, 6, 3};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Uses a BubbleSort to sort through the array.
     *
     * @param arr The array being sorted
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 1; arr.length - i >= 0; i++) {
            for (int k = 0; k < arr.length - 1; k++) {
                if (arr[k] > arr[k + 1]) {
                    int temp = arr[k];
                    arr[k] = arr[k + 1];
                    arr[k + 1] = temp;
                }
            }
        }
    }
}
