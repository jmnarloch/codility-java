package com.algorithms.codility;

public class TreeHeight {

    public int solution(Tree T) {

        if(T == null) {
            return -1;
        }

        return Math.max(solution(T.l), solution(T.r)) + 1;
    }

    class Tree {
        public int x;
        public Tree l;
        public Tree r;
    }
}
