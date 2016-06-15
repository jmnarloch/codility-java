package com.algorithms.codility;

public class BinaryGap {

    public static int solution(int N) {

        int gap = -1;
        int maxGap = 0;

        while (N > 0) {
            if ((N & 1) == 1) {
                maxGap = Math.max(maxGap, gap);
                gap = 0;
            } else if(gap != -1) {
                gap++;
            }
            N >>= 1;
        }
        return maxGap;
    }
}
