package org.example;

public class NumberUtils6K {
    public static boolean isNarcissistic(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        int sum = 0;
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        for (int d : digits) {
            sum += (int) Math.pow(d, digits.length);
        }

        return sum == number;
    }
}
