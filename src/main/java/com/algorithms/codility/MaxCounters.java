package com.algorithms.codility;

public class MaxCounters {

    public int[] solution(int N, int[] A) {

        final int[] counters = new int[N];

        int max = 0;
        int maxCounter = 0;

        for(int index = 0; index < A.length; index++) {
            if(A[index] == N + 1) {
                maxCounter = max;
            } else {
                counters[A[index] - 1] = Math.max(counters[A[index] - 1], maxCounter) + 1;
                max = Math.max(max, counters[A[index] - 1]);
            }
        }

        for(int index = 0; index < counters.length; index++) {
            counters[index] = Math.max(counters[index], maxCounter);
        }

        return counters;
    }
}
