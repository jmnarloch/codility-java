package com.algorithms.codility;

public class PermMissingElem {

    public int solution(int[] A) {
        // write your code in Java SE 8

        final long N = A.length;

        long expected = (N + 1) * (N + 2) / 2;
        long sum = 0;
        for(int val : A) {
            sum += val;
        }

        return (int)(expected - sum);
    }
}
