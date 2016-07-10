package com.algorithms.codility;

public class MaxDoubleSliceSum {

    public int solution(int[] A) {

        final int N = A.length;
        if(N <= 3) {
            return 0;
        }

        final int[] maxStart = new int[N];
        final int[] maxEnd = new int[N];

        int start = 0;
        int end = 0;

        for(int index = 1; index < N; index++) {

            end = Math.max(0, end + A[index]);
            maxEnd[index] = end;

            start = Math.max(0, start + A[N - 1 - index]);
            maxStart[N - 1 - index] = start;
        }

        int max = 0;
        for(int index = 1; index < N - 1; index++) {
            max = Math.max(max, maxEnd[index - 1] + maxStart[index + 1]);
        }
        return max;
    }
}
