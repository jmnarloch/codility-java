package com.algorithms.codility;

public class ChocolatesByNumbers {

    public int solution(int N, int M) {
        // write your code in Java SE 8

        return (int)(lcm(N, M) / M);
    }

    private long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    private long gcd(long a, long b) {

        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
