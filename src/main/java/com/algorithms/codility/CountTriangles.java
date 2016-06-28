package com.algorithms.codility;

import java.util.Arrays;

public class CountTriangles {

    public static int solution(int[] A) {

        final int N = A.length;

        if (N == 0) {
            return 0;
        }

        Arrays.sort(A);

        int triangles = 0;
        for (int index = 0; index < N - 2; index++) {
            int end = index + 2;
            for (int start = index + 1; start < N - 1; start++) {
                while (end < N && A[index] + A[start] > A[end]) {
                    end++;
                }
                triangles += end - start - 1;
            }
        }
        return triangles;
    }

    public static void main(String[] args) {

        System.out.println(solution(new int[]{10, 2, 5, 1, 8, 12}));
    }
}
