package org.example;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates6K {
    public static int duplicateCount(String text) {
        Map<Character, Integer> charCount = new HashMap<>();
        int result = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.toLowerCase().charAt(i);
            if (Character.isLetterOrDigit(c)){
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() >= 2) {
                result++;
            }
        }
        return result;
    }
}
