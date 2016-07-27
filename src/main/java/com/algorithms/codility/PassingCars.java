package com.algorithms.codility;

public class PassingCars {

    public int solution(int[] A) {

        int cars = 0;
        int sum = 0;

        for(int index = 0; index < A.length; index++) {
            if(A[index] == 0) {
                cars++;
            } else {
                sum += cars;
            }
            if(sum > 1_000_000_000) {
                return -1;
            }
        }
        return sum;
    }
}
