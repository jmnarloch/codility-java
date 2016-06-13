package com.algorithms.codility;

public class AbsDistinct {

    public static int solution(int[] A) {

        final int N = A.length;

        if (N == 0) {
            return 0;
        }

        int lo = 0;
        int hi = N - 1;

        int last = Math.max(Math.abs(A[lo]), Math.abs(A[hi]));
        int distinct = 1;
        while (true) {
            while (lo <= hi && Math.abs(A[lo]) == last) {
                lo++;
            }

            while (lo <= hi && Math.abs(A[hi]) == last) {
                hi--;
            }

            if (lo > hi) {
                break;
            }

            if (Math.abs(A[hi]) > Math.abs(A[lo])) {
                last = Math.abs(A[hi]);
            } else {
                last = Math.abs(A[lo]);
            }
            distinct++;
        }
        return distinct;
    }

    public static void main(String[] args) {

        final int[] A = new int[]{-5, -3, -1, 0, 3, 6};
        System.out.println(solution(A));
    }
}
