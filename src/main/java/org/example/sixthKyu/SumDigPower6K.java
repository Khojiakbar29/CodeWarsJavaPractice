package org.example.sixthKyu;

import java.util.ArrayList;
import java.util.List;

public class SumDigPower6K {
    public static List<Long> sumDigPow(long a, long b) {
        List<Long> result = new ArrayList<>();

        for (long i = a; i <= b; i++ ) {
            long sumUp = 0;
            long num = i;
            String numStr = String.valueOf(num);
            List<Integer> numArr = new ArrayList<>();
            for (int j = 0; j < numStr.length(); j++) {
                numArr.add(Character.getNumericValue(numStr.charAt(j)));
            }
            for (int k = 0; k < numArr.size(); ++k) {
                long res = (long) Math.pow(numArr.get(k), k + 1);
                sumUp += res;
            }
            if (sumUp == num) {
                result.add(i);
            }
        }
        return result;
    }
}
