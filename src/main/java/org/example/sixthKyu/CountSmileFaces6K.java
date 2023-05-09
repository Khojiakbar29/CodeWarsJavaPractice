package org.example.sixthKyu;

import java.util.List;

public class CountSmileFaces6K {
    public static int countSmileys(List<String> arr) {
        int count = 0;
        for (String face : arr) {
            if (face.matches("[:;][-~]?[)D]")) {
                count++;
            }
        }
        return count;
    }
}
