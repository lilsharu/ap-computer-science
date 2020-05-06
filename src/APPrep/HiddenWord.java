public class HiddenWord {
    private String hiddenWord;
    private int length;

    public HiddenWord(String word) {
        hiddenWord = word;
        length = word.length();
    }

    public String getHint(String guessIn) {
        char[] hiddenWord = getCharArray(this.hiddenWord);
        char[] guess = getCharArray(guessIn);
        char[] output = new char[length];

        for (int i = 0; i < length; i++) {
            if (hiddenWord[i] == guess[i]) output[i] = hiddenWord[i];
            else if (hiddenWord.indexOf(guess[i]) != -1) output[i] = '+';
            else output[i] = '*';
        }

        String finalOutput = "";
        for (char c : output) {
            finalOutput += c;
        }

        return finalOutput;
    }

    private char[] getCharArray(String s) {
        char[] arr = new char[length];
        for (int i = 0; i < length; i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }
}
