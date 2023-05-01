package org.example;

import java.util.HashSet;
import java.util.Set;

public class Isogram7K {
    public static boolean  isIsogram(String str) {
        char[] strChars = str.toLowerCase().toCharArray();
        Set<Character> setChars = new HashSet<>();
        for(char c : strChars) {
            setChars.add(c);
        }
        boolean result = false;
        if (setChars.size() == strChars.length) {
            result = true;
        }
        return  result;
    }
}
