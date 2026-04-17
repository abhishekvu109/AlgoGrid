package com.abhishek.algogrid.strategies.arrays.FrequenciesInALimitedArray;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;

public class FrequenciesInALimitedArrayBruteForce implements AGProblemStrategy<int[], int[]> {
    @Override
    public int[] solve(int[] input) {
        int N = input.length;
        int[] output = new int[N];
        for (int i = 0; i < N; i++) {
            int item = input[i];
            output[item - 1] = output[item - 1] + 1;
        }
        return output;
    }

    @Override
    public String name() {
        return "Brute Force";
    }

    @Override
    public String timeComplexity() {
        return TimeComplexity.THETA_N;
    }

    @Override
    public String spaceComplexity() {
        return SpaceComplexity.THETA_OF_ONE;
    }
}
