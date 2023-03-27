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
        //Third Task
        int red = 148;
        int green = 0;
        int blue = 211;
        String hex = RgbToHex.rgb(red, green, blue);
        System.out.println(hex);

    }
}

