package com.algorithms.codility;

import java.util.Arrays;

public class Triangle {

    public int solution(int[] A) {

        Arrays.sort(A);

        for (int index = 0; index < A.length - 2; index++) {
            if (isTriplet(A, index, index + 1, index + 2)) {
                return 1;
            }
        }
        return 0;
    }

    private boolean isTriplet(int[] a, int p, int q, int r) {
        return (long) (a[p] + a[q]) > a[r]
                && (long) (a[q] + a[r]) > a[p]
                && (long) (a[p] + a[r]) > a[q];
    }
}
