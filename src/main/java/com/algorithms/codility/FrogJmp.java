package com.algorithms.codility;

public class FrogJmp {

    public int solution(int X, int Y, int D) {
        final int distance = Y - X;
        int jumps = distance / D;
        if (distance % D != 0) {
            jumps++;
        }
        return jumps;
    }
}
