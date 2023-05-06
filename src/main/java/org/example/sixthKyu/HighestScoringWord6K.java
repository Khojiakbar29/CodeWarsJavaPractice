package org.example.sixthKyu;

public class HighestScoringWord6K {
    public static String high(String s) {
        String [] strArr = s.split("\\s+");
        int result = 0;
        int temp = 0;
        int res = 0;
        String str = "";
        for (String w : strArr) {
            char[] lettersArr = w.toCharArray();
            for (char l : lettersArr) {
                temp += (l - 'a' + 1);
            }
            if (temp > res) {
                res = temp;
                str = w;
            }
            temp = 0;
        }
        return str;
    }
}
