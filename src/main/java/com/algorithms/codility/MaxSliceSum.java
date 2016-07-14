package com.algorithms.codility;

public class MaxSliceSum {

    public int solution(int[] A) {

        final int N = A.length;

        int sum = A[0];
        int maxSum = A[0];
        for(int index = 1; index < N; index++) {

            sum = Math.max(A[index], sum + A[index]);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
