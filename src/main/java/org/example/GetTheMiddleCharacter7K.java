package org.example;

public class GetTheMiddleCharacter7K {
    public static String getMiddle(String word) {
        char [] charArr = word.toCharArray();
        int length = charArr.length;
        String ans = "";
        int res = 0;
        if (length % 2 != 0) {
            res = length / 2;
            ans = String.valueOf(charArr[res]);
        }
        if (length % 2 == 0) {
            res = length / 2;
            ans = String.valueOf(charArr[res-1]) + String.valueOf(charArr[res]);
        }
        return ans;
    }
}
