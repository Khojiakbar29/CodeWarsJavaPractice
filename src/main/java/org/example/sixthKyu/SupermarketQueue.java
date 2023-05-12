package org.example.sixthKyu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class SupermarketQueue {
    public static int solveSuperMarketQueue(int[] customers, int n) {
        int[] checkoutTimes = new int[n];
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < customers.length; i++) {
            queue.offer(customers[i]);
        }

        while (!queue.isEmpty()) {
            int minTimeIndex = findMinTimeIndex(checkoutTimes);
            int nextCustomerTime = queue.poll();
            checkoutTimes[minTimeIndex] += nextCustomerTime;
        }
        return Arrays.stream(checkoutTimes).max().orElse(0);
    }

    private static int findMinTimeIndex(int[] chechoutTimes) {
        int minTime = Integer.MIN_VALUE;
        int minTimeIndex = 0;

        for (int i = 0; i < chechoutTimes.length; i++) {
            if (chechoutTimes[i] < minTime) {
                minTime = chechoutTimes[i];
                minTimeIndex = i;
            }
        }
        return minTimeIndex;
    }
}
