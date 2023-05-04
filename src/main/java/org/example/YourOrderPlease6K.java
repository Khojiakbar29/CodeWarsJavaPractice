package org.example;

public class YourOrderPlease6K {
    public static String order(String words) {
        String[] strArr = words.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= strArr.length; i++) {
            for (String w : strArr) {
                if(w.contains(Integer.toString(i))) {
                    sb.append(w).append(" ");
                }
            }
        }
        return sb.toString().trim();
    }
}
