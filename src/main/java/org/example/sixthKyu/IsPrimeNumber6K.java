package org.example.sixthKyu;

import org.example.Main;

public class IsPrimeNumber6K {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // числа меньше или равные 1 не являются простыми
        }
        // проверяем числа до корня из num, т.к. большие делители уже будут проверены
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // число не простое, т.к. делится без остатка на i
            }
        }
        return true; // число простое
    }

}
