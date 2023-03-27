package org.example;

public class Main {
    public static void main(String[] args) {
        //First Task
        int number = 10;
        int sum = Solution.solution(number);
        System.out.println(sum);
        //Second Task
        int seconds = 4526;
        String result = HumanReadableTime.makeReadable(seconds);
        System.out.println(result);
    }
}

