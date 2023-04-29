package org.example;

public class Troll7K {
    public static String disemvowel(String str) {
        String newStr = str.replaceAll("[aeiouAEIOU]", "");
        return  newStr;
    }
}
