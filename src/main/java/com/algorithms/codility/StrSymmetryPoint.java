package com.algorithms.codility;

public class StrSymmetryPoint {

    public int solution(String S) {

        if (S.length() % 2 == 0) {
            return -1;
        }

        int lo = 0;
        int hi = S.length() - 1;
        while (lo < hi) {

            if (S.charAt(lo) != S.charAt(hi)) {
                return -1;
            }
            lo++;
            hi--;
        }

        return lo;
    }
}
