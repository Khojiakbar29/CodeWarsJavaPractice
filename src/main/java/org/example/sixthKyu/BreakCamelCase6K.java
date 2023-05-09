package org.example.sixthKyu;

import java.util.ArrayList;
import java.util.List;

public class BreakCamelCase6K {
    public static String camelCase(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                result.append(" ");
            }
            result.append(c);
        }

        return result.toString();
    }
}
