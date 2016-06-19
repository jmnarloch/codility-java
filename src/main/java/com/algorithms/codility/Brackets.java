package com.algorithms.codility;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Brackets {

    private static final Map<Character, Character> BRACKETS = new HashMap<Character, Character>() {{
       put('(', ')');
       put('{', '}');
       put('[', ']');
    }};

    public int solution(String S) {

        if(S.isEmpty()) {
            return 1;
        }

        final Deque<Character> stack = new LinkedList<>();
        for(int index = 0; index < S.length(); index++) {

            final char c = S.charAt(index);
            if(isOpeningBracket(c)) {
                pushClosingBracket(stack, c);
            } else if(stack.isEmpty() || !stack.peek().equals(S.charAt(index))) {
                return 0;
            } else {
                stack.pop();
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }

    private boolean isOpeningBracket(char c) {
        return BRACKETS.containsKey(c);
    }

    private void pushClosingBracket(Deque<Character> stack, char c) {
        stack.push(BRACKETS.get(c));
    }
}
