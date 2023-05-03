package org.example;

public class FindTheParityOutlier6K {
    static int find(int[] integers) {
        int res = 1;
        for (int n : integers) {
            if (n % 2 == 0) {
                res++;
            }
        }
        int result = 0;
        if (res == 2) {
            for (int n : integers) {
                if (n % 2 == 0) {
                    result = n;
                }
            }
        }
        if (res > 2) {
            for (int n : integers) {
                if (n % 2 != 0) {
                    result = n;
                }
            }
        }
        return result;
    }
}
