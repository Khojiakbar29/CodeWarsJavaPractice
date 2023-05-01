package org.example;

public class HumanReadableTime7K {
    public static String makeReadable(int seconds) {
        if (seconds < 0 || seconds > 359999) {
            throw new IllegalArgumentException("Invalid number of seconds");
        }

        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int secs = seconds % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, secs);
    }
}
