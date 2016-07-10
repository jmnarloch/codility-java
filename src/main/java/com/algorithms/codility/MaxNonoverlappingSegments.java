package com.algorithms.codility;

public class MaxNonoverlappingSegments {

    public int solution(int[] A, int[] B) {

        final int N = Math.min(A.length, B.length);

        if(N == 0) {
            return 0;
        }

        int prev = 0;
        int count = 1;
        int index = 1;

        while(index < N) {
            if(B[prev] < A[index]) {
                count++;
                prev = index;
            }
            index++;
        }

        return count;
    }
}
