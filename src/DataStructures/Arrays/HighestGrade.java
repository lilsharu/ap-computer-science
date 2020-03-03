package DataStructures.Arrays;

public class HighestGrade {
    public static void main(String[] args) {
        int[] grades = {93, 45, 36, 12, 92, 98, 27};
    }
    public static int highestGrade(int[] grades) {
        int highest = grades[0];
        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > highest) highest = grades[i];
        }
        return highest;
    }

}
