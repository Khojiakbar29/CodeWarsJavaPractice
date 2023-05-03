package org.example;

import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder6K {
    static String encode(String word) {
        word = word.toLowerCase();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (word.indexOf(currentChar) == word.lastIndexOf(currentChar)) {
                result.append("(");
            } else {
                result.append(")");
            }
        }
        return result.toString();
    }
}
