package com.algorithms.codility;

import java.util.Arrays;

public class MaxProductOfThree {

    public int solution(int[] A) {

        final int N = A.length;

        Arrays.sort(A);

        return Math.max(A[0] * A[1] * A[N - 1],
                A[N - 3] * A[N - 2] * A[N - 1]);
    }
}
