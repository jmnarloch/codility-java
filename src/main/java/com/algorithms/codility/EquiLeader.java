package com.algorithms.codility;

public class EquiLeader {

    public static int solution(int[] A) {

        final int N = A.length;

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
        for (int index = 0; index < A.length; index++) {
            if (A[index] == leader) {
                count++;
            }
        }

        if (count <= N / 2) {
            return 0;
        }

        int result = 0;
        final int[] leaders = new int[N + 1];
        for (int index = 0; index < N; index++) {
            leaders[index + 1] = leaders[index];
            if (A[index] == leader) {
                leaders[index + 1]++;
            }

            if(leaders[index + 1] > (index + 1) / 2 && (count - leaders[index + 1]) > (N - index - 1) / 2 ) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        final int[] A = {4, 4, 2, 5, 3, 4, 4, 4};
        System.out.println(EquiLeader.solution(A));
    }
}
