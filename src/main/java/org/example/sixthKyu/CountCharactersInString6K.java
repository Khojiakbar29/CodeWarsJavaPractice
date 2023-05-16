package org.example.sixthKyu;

import java.util.HashMap;
import java.util.Map;

public class CountCharactersInString6K {
    public static Map<Character, Integer> count(String str) {
        char[] arrChars = str.toCharArray();
        Map<Character, Integer> result = new HashMap<>();
        for (char c : arrChars) {
            result.put(c, result.getOrDefault(c, 0) + 1);
        }
        return result;
    }
}
