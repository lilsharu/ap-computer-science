public class NumberCube {
    public int toss() {
        return 0;
    }

    public static int[] getCubeTosses(NumberCube cube, int numTosses) {
        int[] tosses = new int[numTosses];
        for (int i = 0; i < numTosses; i++) {
            tosses[i] = cube.toss();
        }
        return tosses;
    }

    public static int getLongestRun(int[] values) {
        int longestIndex = -1;
        int longestRun = 0;

        for (int i = 1; i < values.length; i++) {
            int num = values[i];
            int count = 0;
            for (int k = i; values[k] == num; k++) {
                count++;
            }
            if (count > longestRun) {
                longestRun = count;
                longestIndex = i;
            }
            i += count - 1;
        }

        return longestIndex;
    }
}
