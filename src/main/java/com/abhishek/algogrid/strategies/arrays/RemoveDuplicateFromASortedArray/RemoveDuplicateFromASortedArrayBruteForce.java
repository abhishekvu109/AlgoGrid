package com.abhishek.algogrid.strategies.arrays.RemoveDuplicateFromASortedArray;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;

public class RemoveDuplicateFromASortedArrayBruteForce implements AGProblemStrategy<int[], int[]> {
    @Override
    public int[] solve(int[] input) {
        int N = input.length;
        int distinctCount = 0;
        int[] temp = new int[N];
        for (int i = 0; i < N; i++) {
            boolean found = false;
            for (int j = i + 1; j < N; j++) {
                if (input[i] == input[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                temp[distinctCount] = input[i];
                distinctCount++;
            }
        }
        int[] result = new int[distinctCount];
        for (int i = 0; i < distinctCount; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    @Override
    public String name() {
        return "Brute force";
    }

    @Override
    public String timeComplexity() {
        return TimeComplexity.BIG_O_OF_N_SQUARE;
    }

    @Override
    public String spaceComplexity() {
        return SpaceComplexity.THETA_N;
    }
}
