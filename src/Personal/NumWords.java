package Personal;

import java.util.*;
import java.io.*;

public class NumWords {
    final static String fileLocation = "C:\\Users\\shour\\Downloads\\Mel-Robbins.txt";
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(new File(fileLocation));
        reader.useDelimiter("(\\p{javaWhitespace}|\\.|,|-|>)+");
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("WordsList.txt")));

//        List<String> wordsList = new ArrayList<>();
//        List<Integer> wordCount = new ArrayList<>();
        List<Word> wordList = new ArrayList<>();

        while (reader.hasNext()) {
            String word = reader.next().toUpperCase();
            if (isExcludedWord(word)) continue;
//            if (wordsList.contains(word)) {
//                wordCount.set(wordsList.indexOf(word), wordCount.get(wordsList.indexOf(word)) + 1);
//            }
            if (wordList.contains(new Word(word))) {
                wordList.get(wordList.indexOf(new Word(word))).plusOne();
            }
            else {
                wordList.add(new Word(word));
//                wordsList.add(word);
//                wordCount.add(1);
            }
        }

        wordList.sort((w1, w2) -> w2.getCount() - w1.getCount());

        for (Word w : wordList) {
            out.println(w);
        }
        out.close();
    }

    public static boolean isExcludedWord(String word) {
        return (word.equalsIgnoreCase("TO") || word.equalsIgnoreCase("AND") || word.equalsIgnoreCase("YOU") ||
                word.equalsIgnoreCase("THE") || word.equalsIgnoreCase("THAT") || word.equalsIgnoreCase("I") ||
                word.equalsIgnoreCase("A") || word.equalsIgnoreCase("OF") || word.equalsIgnoreCase("IS") ||
                word.equalsIgnoreCase("IN") || word.equalsIgnoreCase("IT") || word.equalsIgnoreCase("THIS") ||
                word.equalsIgnoreCase("YOUR") || word.equalsIgnoreCase("SO"));
    }

    static class Word implements Comparable<Word>{
        private String word;
        private int count;

        public Word(String word) {
            this.word = word;
            count = 1;
        }

        public void plusOne() {
            count++;
        }

        public boolean isString(String compareTo) {
            return word.equalsIgnoreCase(compareTo);
        }

        public String getWord() {
            return word;
        }

        public int getCount() {
            return count;
        }

        @Override
        public int compareTo(Word o) {
            return this.getWord().compareTo(o.getWord());
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Word)) return false;
            Word word1 = (Word) o;
            return word.equalsIgnoreCase(word1.word);
        }

        @Override
        public String toString() {
            return word + ": " + count;
        }
    }
}
