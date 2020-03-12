package SearchingAndSorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {8, 2, 16, 1, 63, 4, 41, 123, 214, 52, 34};
        System.out.println(Arrays.toString(mergeSort(a)));
    }

    //Full Mergesort
    public static int[] mergeSort(int[] arr) {
        return merge(split(arr));
    }

    //Spliting Step
    public static int[][] split(int[] s) {
        int[][] arr = new int[s.length][];
        for (int i = 0; i < s.length; i++) {
            int[] element = {s[i]};
            arr[i] = element;
        }
        return arr;
    }

    //Merging Step 1
    public static int[] merge(int[][] s) {
        if (s.length == 1) {
            return s[0];
        }

        int[][] next = new int[s.length - 1][];
        next[0] = merge(s[0], s[1]);
        for (int i = 1; i < next.length; i++) {
            next[i] = s[i + 1];
        }

        return merge(next);
    }

    //Merging Step 2
    public static int[] merge(int[] a, int[] b) {
        int[] arr = new int[a.length + b.length];
        int bIndex = 0;
        int aIndex = 0;
        for (int i = 0; i < arr.length && (aIndex < a.length || bIndex < b.length); i++) {
            if ((bIndex >= b.length) || (aIndex < a.length && a[aIndex] < b[bIndex])) {
                arr[i] = a[aIndex];
                aIndex++;
            } else if ((aIndex >= a.length) || (bIndex < b.length && b[bIndex] < a[aIndex])) {
                arr[i] = b[bIndex];
                bIndex++;
            } else if (b[bIndex] == a[aIndex]) {
                arr[i] = b[bIndex];
                arr[i + 1] = a[aIndex];
                i++;
                bIndex++;
                aIndex++;
            }
        }
        return arr;
    }

    //Useless
    public static int[] merge1(int[] a, int[] b) {
        int[] arr = new int[a.length + b.length];
        int index = 0;
        for (int i = 0; i < a.length || i < b.length; i++) {
            System.out.println("" + i + " " + b.length + " " + (i >= b.length));
            if (i >= b.length || a[i] < b[i]) {
                arr[index] = a[i];
                index++;
            } else if (b[i] < a[i]) {
                arr[index] = b[i];
            } else {
                arr[index] = b[i];
                arr[index + 1] = a[i];
                index += 2;
            }
        }
        return arr;
    }
}
