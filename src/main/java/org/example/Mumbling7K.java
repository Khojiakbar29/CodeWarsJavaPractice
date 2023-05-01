package org.example;

public class Mumbling7K {
    public static String accum(String s) {
        char[] charArr = s.toLowerCase().toCharArray();
        String res = "";
        int per = 0;
        for (int i = 0; i < charArr.length; i++) {
            per = i;
            StringBuilder sb = new StringBuilder();
            for (int k = 0; k <= per; k++) {
                sb.append(String.valueOf(charArr[per]));
            }
            if (per == 0) {
                res += sb;
            } else res += ("-" + sb);
        }
        String[] words = res.split("-");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            String frst = word.substring(0, 1).toUpperCase();
            String rest = word.substring(1);
            result.append(frst).append(rest);
            result.append("-");
        }
        result.deleteCharAt(result.length() - 1);
        return result.toString();
    }
}
