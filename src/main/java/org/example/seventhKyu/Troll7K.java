package org.example.seventhKyu;

public class Troll7K {
    public static String disemvowel(String str) {
        String newStr = str.replaceAll("[aeiouAEIOU]", "");
        return  newStr;
    }
}
