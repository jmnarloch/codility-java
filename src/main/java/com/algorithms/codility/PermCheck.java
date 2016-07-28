package com.algorithms.codility;

public class PermCheck {

    public static int solution(int[] A) {

        final int N = A.length;
        int index = 0;

        while(index < N) {
            while(A[index] != index + 1) {
                if(A[index] > N || A[A[index] - 1] == A[index]) {
                    return 0;
                }
                swap(A, index, A[index] - 1);
            }
            index++;
        }
        return 1;
    }

    private static void swap(int[] a, int i, int j) {
        final int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String[] args) {

//        final int[] A = {4, 1, 3, 2};
        final int[] A = {4, 1, 3};
        System.out.println(solution(A));
    }
}
