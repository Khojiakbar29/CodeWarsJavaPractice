package org.example.seventhKyu;

public class Vowels7K {

    public static int getCount(String str) {
        char[] strChars = str.toCharArray();
        int count = 0;
        for(char c : strChars) {
            if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            count++;
        }
        return  count;
    }
}
    //The best sollution
//        public static int getCount(String str) {
//            return str.replaceAll("(?i)[^aeiou]", "").length();
//        }



