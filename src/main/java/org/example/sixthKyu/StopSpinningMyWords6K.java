package org.example.sixthKyu;

import java.util.Arrays;

public class StopSpinningMyWords6K {
    public static String spinWords(String sentence) {
        String[] words = sentence.split("\\s+");
        String[] results = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 5) {
                String tempW = words[i];
                StringBuilder reversed = new StringBuilder(tempW);
                results[i] = reversed.reverse().toString();
            } else {
                results[i] = words[i];
            }
        }
        StringBuilder resultString = new StringBuilder();
        for (String result : results) {
            resultString.append(result).append(" ");
        }
        return resultString.toString().trim();
    }
}

