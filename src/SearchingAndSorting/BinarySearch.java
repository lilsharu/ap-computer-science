package SearchingAndSorting;

public class BinarySearch {
    public static void main(String[] args) {
        int[] integer = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(integer, 11));
    }
    public static boolean binarySearch(int[] arr, int x) {
        int min = 0;
        int max = arr.length - 1;
        while (min <= max) {
            //Gets the middle value
            int mid = (min + max) / 2;

            //If the number is greater than the middle, make the minimum the middle + 1
            if (arr[mid] < x) min = mid + 1;

                //if the number is less than the middle, make the maximum  the middle - 1
            else if (arr[mid] > x) max = mid - 1;

                //If it is not one of them, that means it must equals, so it is true
            else return true;
        }

        //The minimum is greater than the maximum, so it is not in the array
        return false;
    }
}