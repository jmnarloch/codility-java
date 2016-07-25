package com.algorithms.codility;

public class Nesting {

    public int solution(String S) {

        if (S.length() == 0) {
            return 1;
        }

        int brackets = 0;
        for (int index = 0; index < S.length(); index++) {
            if (S.charAt(index) == '(') {
                brackets++;
            } else {
                brackets--;
            }

            if(brackets < 0) {
                return 0;
            }
        }
        return brackets == 0 ? 1 : 0;
    }
}
