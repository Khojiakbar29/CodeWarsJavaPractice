package org.example;

public class BitCounting6K {
    public static int countBits(int n) {
        int res = 0;
        String str = Integer.toBinaryString(n);
        char[] digits = str.toCharArray();
        int[] result = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            result[i] = Character.getNumericValue(digits[i]);
        }
        for (int i = 0; i < result.length; i++) {
            res += result[i];
        }
        return res;
    }
}
