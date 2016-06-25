package com.algorithms.codility;

public class CountFactors {

    public int solution(int N) {

        int count = 0;
        int div = 1;

        while (div * div < N) {
            if (N % div == 0) {
                count += 2;
            }
            div++;
        }

        if (div * div == N) {
            count++;
        }

        return count;
    }
}
