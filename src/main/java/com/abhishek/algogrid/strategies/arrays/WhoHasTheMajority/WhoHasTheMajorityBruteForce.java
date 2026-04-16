package com.abhishek.algogrid.strategies.arrays.WhoHasTheMajority;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;

public class WhoHasTheMajorityBruteForce implements AGProblemStrategy<int[], Integer> {
    @Override
    public Integer solve(int[] input) {
        int currentLeader = input[0];
        int count = 0;
        int N = input.length;
        for (int i = 0; i < N; i++) {
            int item = input[i];
            int currentCount = 0;
            for (int j = 0; j < N; j++) {
                if (item == input[j]) {
                    currentCount++;
                }
            }
            if (currentCount > count) {
                currentLeader = item;
            }
        }
        return currentLeader;
    }

    @Override
    public String name() {
        return "Brute Force";
    }

    @Override
    public String timeComplexity() {
        return TimeComplexity.THETA_OF_N_SQUARE;
    }

    @Override
    public String spaceComplexity() {
        return SpaceComplexity.THETA_OF_ONE;
    }
}
