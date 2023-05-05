package org.example.seventhKyu;

public class RgbToHex7K {
    public static String rgb(int r, int g, int b) {
        r = Math.max(0, Math.min(255, r));
        g = Math.max(0, Math.min(255, g));
        b = Math.max(0, Math.min(255, b));

        // Convert the input values to hexadecimal strings
        String hexR = String.format("%02x", r);
        String hexG = String.format("%02x", g);
        String hexB = String.format("%02x", b);

        return hexR.toUpperCase() + hexG.toUpperCase() + hexB.toUpperCase();
    }
}
