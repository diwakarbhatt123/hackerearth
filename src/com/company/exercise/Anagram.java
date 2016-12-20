package com.company.exercise;

import java.util.Arrays;

public class Anagram {

    public static boolean checkForAnagram(String word1, String word2) {
        if (word1.length() == word2.length()) {
            char[] word1Chars = word1.toCharArray();
            char[] word2Chars = word2.toCharArray();
            Arrays.sort(word1Chars);
            Arrays.sort(word2Chars);
            return Arrays.equals(word1Chars, word2Chars);
        }
        return false;
    }

    public static void main(String[] args) {
        String result = "";
        String[] wordList = {"vase", "bat", "gods", "latte", "name", "apres", "spit", "joke", "ham", "dog", "act", "tale", "parse", "pits", "asper", "tab", "table", "mane", "late",
                "god", "cat", "table", "save", "spare"};
        for (int i = 0; i < wordList.length; i++) {
            for (int j = 0; j < wordList.length; j++) {
                if (!wordList[i].equals(wordList[j])) {
                    if (checkForAnagram(wordList[i], wordList[j])) {
                        if(!result.contains(wordList[i])&&!result.contains(wordList[j]))
                        result+= wordList[i] + " " + wordList[j]+"\n";
                    }
                }
            }
        }
        System.out.println(result);

    }
}
