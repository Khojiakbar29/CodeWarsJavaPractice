package org.example;

import java.util.Arrays;

public class CreatePhoneNumber6K {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        for (int i : numbers) {
            sb.append(i);
        }
        String result = sb.toString();
        String frs = result.substring(0, 3);
        String sec = result.substring(3, 6);
        String thr = result.substring(6);
        String finalRes = "(" + frs + ")" + " " + sec + "-" + thr;
        return finalRes;
    }
}
