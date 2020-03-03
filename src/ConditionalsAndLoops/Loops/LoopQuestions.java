package ConditionalsAndLoops.Loops;

public class LoopQuestions {
    public static void main(String[] args) {
        System.out.println("a".compareTo("b"));
    }
    public static int charOcurrences(String s, char c) {
        int count = 0;
        while (s.indexOf(c) != -1) {
            count++;
            s = s.substring(s.indexOf(c) + 1);
        }
        return count;
    }
    public static int[] eIndicesArray(String findIndex) {
        int index = charOcurrences(findIndex, 'e');
        int length = findIndex.length();
        int count = 0;
        int[] indices = new int[index];
        for (int i = 0; i < length; i++) {
            if (findIndex.charAt(i) == 'e') {
                indices[count] = i;
                count++;
            }
        }
        return indices;
    }
    public static String eIndicesString(String findIndex) {
        int length = findIndex.length();
        String indices = "(";
        for (int i = 0; i < length; i++) {
            if (findIndex.charAt(i) == 'e')
                indices += i + ", ";
        }
        indices += ")";
        return indices;
    }
    public static int indexOfLastA(String s) {
        int index = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'a') {
                index = i;
            }
        }
        return index;
    }
    public static int numberOfString(String s, String l){
        int count = 0;
        while (s.indexOf(l) != -1) {
            count++;
            try {
                s = s.substring(s.indexOf(l) + 1);
            }
            catch (Exception e){
                //Do Nothing
            }
        }
        return count;
    }

    public static String reverse(String s) {
        String output = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            output += s.charAt(i);
        }
        return output;
    }
}
