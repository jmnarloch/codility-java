package com.algorithms.codility;

import java.util.Deque;
import java.util.LinkedList;

public class StoneWall {

    public int solution(int[] H) {

        final Deque<Integer> stack = new LinkedList<>();

        int blocks = 0;
        for(int index = 0; index < H.length; index++) {
            if(stack.isEmpty() || stack.peek() < H[index]) {
                stack.push(H[index]);
                blocks++;
            } else {
                while(!stack.isEmpty() && stack.peek() > H[index]) {
                    stack.pop();
                }

                if(stack.isEmpty() || stack.peek() != H[index]) {
                    stack.push(H[index]);
                    blocks++;
                }
            }
        }
        return blocks;
    }
}
