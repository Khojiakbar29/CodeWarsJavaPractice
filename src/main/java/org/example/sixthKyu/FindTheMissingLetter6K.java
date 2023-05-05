package org.example.sixthKyu;

public class FindTheMissingLetter6K {
    public static char findMissingLetter(char[] array) {
       char prev = array[0];
       for (int i = 0; i<array.length; i++) {
           char current = array[i];
           if (current - prev > 1) {
               return (char) (prev + 1);
           }
           prev = current;
       }
       return array[array.length - 1];
    }
}
