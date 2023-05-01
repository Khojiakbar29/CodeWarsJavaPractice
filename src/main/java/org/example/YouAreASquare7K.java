package org.example;

public class YouAreASquare7K {
    public static boolean isSquare(int n) {
        boolean rest = false;
        if (n >= 0) {
            double res = Math.sqrt(n);
            if (res % 1 == 0) {
                rest = true;
            } else  {
                rest= false;
            }
        }
        return  rest;
    }
}
