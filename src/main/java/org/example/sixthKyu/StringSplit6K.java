package org.example.sixthKyu;

public class StringSplit6K {
    public static String[] solution(String s) {
        if (s == null || s.isEmpty()) {
            return new String[0];
        }

        int n = s.length();
        int m = n / 2 + n % 2;
        String[] result = new String[m];

        for (int i = 0; i < n; i += 2) {
            int j = i / 2;
            result[j] = (i < n - 1) ? s.substring(i, i + 2) : s.substring(i) + "_";
        }

        return result;
    }

}
