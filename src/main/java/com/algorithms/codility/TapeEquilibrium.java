package com.algorithms.codility;

public class TapeEquilibrium {

    public int solution(int[] A) {
        final int N = A.length;

        int sum = 0;
        for(int val : A) {
            sum += val;
        }

        int right = 0;
        int left = sum;

        int min = Integer.MAX_VALUE;

        for(int ind = N - 1; ind > 0; ind--) {
            left -= A[ind];
            right += A[ind];
            final int diff = Math.abs(right - left);
            min = Math.min(min, diff);
        }
        return min;
    }
}
