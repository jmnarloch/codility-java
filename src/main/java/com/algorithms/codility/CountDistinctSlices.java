package com.algorithms.codility;

public class CountDistinctSlices {

    public static int solution(int M, int[] A) {

        final int N = A.length;
        final boolean[] values = new boolean[M + 1];

        int slices = 0;

        for (int start = 0, end = 0; end < N; end++) {
            while (values[A[end]]) {
                values[A[start]] = false;
                start++;
            }
            values[A[end]] = true;
            slices += (end - start + 1);

            if (slices > 1_000_000_000) {
                return 1_000_000_000;
            }
        }
        return slices;
    }

    public static int solution2(int M, int[] A) {

        final int N = A.length;
        final int[] values = new int[M + 1];

        int slices = 0;

        for (int start = 0, end = 0; end < N; end++) {
            if (values[A[end]] - 1 >= start) {
                start = values[A[end]];
            }
            values[A[end]] = end + 1;
            slices += (end - start + 1);

            if (slices > 1_000_000_000) {
                return 1_000_000_000;
            }
        }
        return slices;
    }

    public static void main(String[] args) {

        System.out.println(CountDistinctSlices.solution(6, new int[]{3, 4, 5, 5, 2}));
        System.out.println(CountDistinctSlices.solution2(6, new int[]{3, 4, 5, 5, 2}));
    }
}
