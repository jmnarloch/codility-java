package com.algorithms.codility;

public class Dominator {

    public int solution(int[] A) {

        final int N = A.length;

        if(N == 0) {
            return 0;
        }

        int leader = A[0];
        int occurrences = 1;

        for (int index = 1; index < A.length; index++) {
            if (A[index] == leader) {
                occurrences++;
            } else {
                occurrences--;
            }

            if (occurrences == 0) {
                leader = A[index];
                occurrences = 1;
            }
        }

        int count = 0;
        int leaderIndex = -1;
        for (int index = 0; index < A.length; index++) {
            if (A[index] == leader) {
                if(leaderIndex < 0) {
                    leaderIndex = index;
                }
                count++;
            }
        }

        if (count <= N / 2) {
            return -1;
        }

        return leaderIndex;
    }
}
