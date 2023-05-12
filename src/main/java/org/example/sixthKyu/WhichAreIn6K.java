package org.example.sixthKyu;

import java.util.Arrays;
import java.util.HashSet;

public class WhichAreIn6K {
    public static String[] inArray(String[] array1, String[] array2) {

        HashSet<String> result = new HashSet<>();
        for (String s1: array1) {
            for (String s2 : array2) {
                if (s2.contains(s1)) {
                    result.add(s1);
                    break;
                }
            }
        }
        String[] sortedResult = result.toArray(new String[result.size()]);
        Arrays.sort(sortedResult);
        return sortedResult;
    }
}
