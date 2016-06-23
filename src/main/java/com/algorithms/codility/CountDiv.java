package com.algorithms.codility;

public class CountDiv {

    public int solution(int A, int B, int K) {
        // 2, 3, 4
        // 3, 4, 5
        int div = (B / K) - (A / K);
        if(A % K == 0) {
            div++;
        }
        return div;
    }
}
