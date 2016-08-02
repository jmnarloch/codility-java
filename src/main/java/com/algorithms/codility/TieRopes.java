package com.algorithms.codility;

public class TieRopes {

    public int solution(int K, int[] A) {

        final int N = A.length;

        int ropes = 0;
        int length = 0;

        for (int index = 0; index <= N; index++) {
            if (length >= K) {
                length = 0;
                ropes++;
            }
            if (index == N) {
                break;
            }
            length += A[index];
        }
        return ropes;
    }
}
