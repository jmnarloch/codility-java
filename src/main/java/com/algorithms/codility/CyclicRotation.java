package com.algorithms.codility;

import java.util.Arrays;

public class CyclicRotation {

    public static int[] solution(int A[], int K) {

        // input: array of integers, the number of elements to move
        // output: rotated array
        // edge cases: A is null, A is empty, K is negative, K is zero
        // assumptions: N, K is in range [0, 100]

        final int N = A.length;

        if (N == 0 || K % N == 0) {
            return A;
        }
        K %= N;
        reverse(A, 0, N - K - 1);
        reverse(A, N - K, N - 1);
        reverse(A, 0, N - 1);
        return A;
    }

    private static void reverse(int[] A, int lo, int hi) {
        while (lo < hi) {
            swap(A, lo, hi);
            lo++;
            hi--;
        }
    }

    private static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String[] args) {
        final int[] A = {3, 8, 9, 7, 6};
        final int K = 3;
        System.out.println(Arrays.toString(solution(new int[0], K)));
        System.out.println(Arrays.toString(solution(A, K)));
    }
}
