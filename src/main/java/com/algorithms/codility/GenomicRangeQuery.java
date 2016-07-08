package com.algorithms.codility;

public class GenomicRangeQuery {

    public int[] solution(String S, int[] P, int[] Q) {

        final int N = S.length();

        final int[][] nucleotides = new int[N + 1][4];
        final int[] queries = new int[P.length];

        for (int n = 0; n < 4; n++) {
            nucleotides[0][n] = -1;
        }

        for (int index = 0; index < N; index++) {
            for (int n = 0; n < 4; n++) {
                nucleotides[index + 1][n] = nucleotides[index][n];
            }
            final int factor = factor(S.charAt(index));
            nucleotides[index + 1][factor] = index;
        }

        for(int index = 0; index < Math.min(P.length, Q.length); index++) {
            for (int n = 0; n < 4; n++) {
                if(nucleotides[Q[index] + 1][n] >= P[index]) {
                    queries[index] = n + 1;
                    break;
                }
            }
        }
        return queries;
    }

    private static int factor(char nucleotide) {

        int factor;
        switch (nucleotide) {
            case 'A':
                factor = 0;
                break;
            case 'C':
                factor = 1;
                break;
            case 'G':
                factor = 2;
                break;
            case 'T':
                factor = 3;
                break;
            default:
                throw new IllegalArgumentException();
        }
        return factor;
    }
}
