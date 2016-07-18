package com.algorithms.codility;

public class MissingInteger {

    public int solution(int[] A) {

        final int N = A.length;

        for (int index = 0; index < N; index++) {
            while (index != A[index] - 1 && A[index] > 0 && A[index] <= N && A[A[index] - 1] != A[index] ) {
                swap(A, index, A[index] - 1);
            }
        }

        for (int index = 0; index < N; index++) {
            if (index != A[index] - 1) {
                return index + 1;
            }
        }
        return N + 1;
    }

    private void swap(int a[], int i, int j) {
        final int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
