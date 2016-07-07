package com.algorithms.codility;

public class FrogRiverOne {

    public int solution(int X, int[] A) {

        final int N = A.length;

        final int[] leaves = new int[X];

        int index = 0;
        int event = 0;
        int time = 0;

        while (index < X) {
            while (leaves[index] == 0 && event < N) {
                if(A[event] - 1 >= index && leaves[A[event] - 1] == 0) {
                    leaves[A[event] - 1] = event + 1;
                }
                event++;
            }
            if (leaves[index] == 0) {
                return -1;
            }
            time = Math.max(time, leaves[index] - 1);
            index++;
        }
        return time;
    }

    public static int solution1(int X, int[] A) {
        final int N = A.length;

        final int[] leaves = new int[X];
        for(int ind = 0; ind < X; ind++) {
            leaves[ind] = -1;
        }

        for(int ind = 0; ind < N; ind++) {
            if(leaves[A[ind] - 1] == -1) {
                leaves[A[ind] - 1] = ind;
            }
        }

        int time = 0;
        for(int ind = 0; ind < X; ind++) {
            if(leaves[ind] == -1) {
                return -1;
            }
            time = Math.max(time, leaves[ind]);
        }
        return time;
    }

    public static int solution2(int X, int[] A) {
        final int N = A.length;

        final int[] leaves = new int[X];

        for(int ind = 0; ind < N; ind++) {
            if(leaves[A[ind] - 1] == 0) {
                leaves[A[ind] - 1] = ind + 1;
            }
        }

        int time = 0;
        for(int ind = 0; ind < X; ind++) {
            if(leaves[ind] == 0) {
                return -1;
            }
            time = Math.max(time, leaves[ind] - 1);
        }
        return time;
    }
}
