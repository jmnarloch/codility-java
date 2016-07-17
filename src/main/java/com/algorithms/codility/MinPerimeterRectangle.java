package com.algorithms.codility;

public class MinPerimeterRectangle {

    public int solution(int N) {

        int min = Integer.MAX_VALUE;
        for(int div = 1; div * div <= N; div++) {
            if(N % div == 0) {
                min = Math.min(min, 2 * (div + N / div));
            }
        }
        return min;
    }
}
