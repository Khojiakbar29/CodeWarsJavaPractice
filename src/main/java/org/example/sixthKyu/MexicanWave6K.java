package org.example.sixthKyu;

import java.util.ArrayList;
import java.util.List;

public class MexicanWave6K {
    public static String[] wave(String str) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isWhitespace(c)) {
                continue;  // Skip whitespace characters
            }

            StringBuilder wave = new StringBuilder(str.toLowerCase());
            wave.setCharAt(i, Character.toUpperCase(c));
            result.add(wave.toString());
        }

        return result.toArray(new String[0]);
    }
}
