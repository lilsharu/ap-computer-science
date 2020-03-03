package ConditionalsAndLoops.Loops;

import java.util.*;

public class Find {
    public static boolean isFour(int num) {
        while (num > 0){
            if (num % 10 == 4) return true;
            else {
                num /= 10;
            }
        }
        return false;
    }
    public static boolean isNumIn (int num, int look) {
        while (num > 0) {
            if (num % 10 == look) return true;
            else num /= 10;
        }
        return false;
    }
    public static int countFour(int num) {
        int count = 0;
        while (num > 0){
            if (num % 10 == 4) count++;
        }
        return count;
    }
    public static int countZs (String str) {
        int count = 0;
        while (str.indexOf("z") != -1) {
            count++;
            str = str.substring(str.indexOf("z") + 1);
        }
        return count;
    }
}
