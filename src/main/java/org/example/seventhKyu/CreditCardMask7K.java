package org.example.seventhKyu;

public class CreditCardMask7K {
    public static String maskify(String str) {
        String finalStr = str;
        if (str.length() > 4) {
            String maskingStr = str.substring(0, str.length() - 4);
            String immuteStr = str.substring(str.length() - 4);
            String resStr = maskingStr.replaceAll("[\\p{Alnum}\\p{Punct}\\s]",  "#");
            finalStr = resStr + immuteStr;
        }
        return finalStr;
    }
}
