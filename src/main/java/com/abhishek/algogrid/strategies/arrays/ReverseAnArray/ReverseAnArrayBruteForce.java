package com.abhishek.algogrid.strategies.arrays.ReverseAnArray;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;

public class ReverseAnArrayBruteForce implements AGProblemStrategy<int[], int[]> {

    @Override
    public int[] solve(int[] input) {
        int N = input.length;
        int[] aux = new int[N];
        System.arraycopy(input, 0, aux, 0, N);
        for (int i = 0; i < N; i++) {
            input[i] = aux[N - i - 1];
        }
        return input;
    }

    @Override
    public String name() {
        return "Brute force";
    }

    @Override
    public String timeComplexity() {
        return TimeComplexity.BIG_O_OF_N;
    }

    @Override
    public String spaceComplexity() {
        return SpaceComplexity.BIG_OF_N;
    }
}
