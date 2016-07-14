package com.algorithms.codility;

public class MaxProfit {

    public int solution(int[] A) {

        final int N = A.length;

        if(N <= 1) {
            return 0;
        }

        int profit = 0;
        int maxProfit = 0;

        for(int index = 1; index < N; index++) {

            profit = Math.max(0, profit + A[index] - A[index - 1]);
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}
