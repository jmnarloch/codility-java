package com.algorithms.codility;

public class OddOccurrencesInArray {

    public static int solution(int[] A) {
        int odd = 0;
        for(int val : A) {
            odd ^= val;
        }
        return odd;
    }
}
