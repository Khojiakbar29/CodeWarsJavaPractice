package org.example.sixthKyu;

import java.util.HashMap;
import java.util.Map;

public class FindTheUniqueNumber6K {
    public static double findUniq(double arr[]) {
        double result = 0;
        Map<Double, Integer> count = new HashMap<>();
        for ( double d : arr ) {
            count.put(d, count.getOrDefault(d, 0) + 1);
        }
        for (Map.Entry <Double, Integer> entry : count.entrySet()) {
            if (entry.getValue() == 1) {
                result = entry.getKey();
            }
        }
        return  result;
    }
}
