package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class DescendingOrder7K {
    public static int sortDesc(final int num) {
        String str = String.valueOf(num);
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        String reversedNumStr = new StringBuilder(new String(charArr)).reverse().toString();
        return Integer.parseInt(reversedNumStr);
    }
}
