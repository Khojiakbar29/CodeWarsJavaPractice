package org.example;

public class PLayinWithDigits6K {
    public static long digPow(int n, int p) {
        String numStr = String.valueOf(n);
        int sum = 0;
        int koren = p;
        long result = 0;
        int[] digits = new int[numStr.length()];

        for (int i = 0; i<numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        for (int d : digits) {
            sum += Math.pow(d, koren);
            koren++;
        }
        if (sum % n == 0) {
            result = sum / n;
        } else {
            result = -1;
        }

        return result;
    }
}
