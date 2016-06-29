package com.algorithms.codility;

import java.util.Arrays;

public class Distinct {

    public int solution(int[] A) {

        if(A == null || A.length == 0) {
            return 0;
        }

        Arrays.sort(A);

        int distinct = 1;
        for(int index = 1; index < A.length; index++) {
            if(A[index] != A[index - 1]) {
                distinct++;
            }
        }
        return distinct;
    }
}
