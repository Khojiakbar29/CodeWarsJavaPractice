package org.example.seventhKyu;

public class ExesAndOxes7K {
    public static boolean getXO (String str) {
        boolean result = false;
        char ex = 'x';
        char ox = 'o';
        int resX = 0;
        int resO = 0;
        char[] strChars = str.toLowerCase().toCharArray();
        for (char c : strChars) {
            if (c == ex) {
                resX++;
            } else if (c == ox){
                resO++;
            }
        }
        if (resO == resX) {
            result = true;
        }
        return result;
    }
}
