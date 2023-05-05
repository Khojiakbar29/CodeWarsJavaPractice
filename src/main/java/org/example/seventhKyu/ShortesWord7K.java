package org.example.seventhKyu;

public class ShortesWord7K {
    public static int findShort(String s) {
        String [] wordsArr = s.split("\\s+");
        String minLength = wordsArr[0];
        int res = 0;
        for (int i = 0; i < wordsArr.length; i++) {
            if (wordsArr[i].length() < minLength.length()) {
                minLength = wordsArr[i];
                res = i;
            }
        }
        return res;
    }
}
