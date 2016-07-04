package com.algorithms.codility;

import java.util.Deque;
import java.util.LinkedList;

public class Fish {

    public int solution(int[] A, int[] B) {

        final Deque<Integer> stack = new LinkedList<>();

        int alive = 0;
        for(int index = 0; index < Math.min(A.length, B.length); index++) {

            if(B[index] == 1) {
                stack.push(A[index]);
            } else {
                while(!stack.isEmpty() && stack.peek() < A[index]) {
                    stack.pop();
                }

                if(stack.isEmpty()) {
                    alive++;
                }
            }
        }
        return alive + stack.size();
    }
}
