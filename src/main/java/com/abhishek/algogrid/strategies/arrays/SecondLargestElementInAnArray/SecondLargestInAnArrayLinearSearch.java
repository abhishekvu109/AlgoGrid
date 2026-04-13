package com.abhishek.algogrid.strategies.arrays.SecondLargestElementInAnArray;

import com.abhishek.algogrid.strategies.AGProblemStrategy;

public class SecondLargestInAnArrayLinearSearch implements AGProblemStrategy<int[], Integer> {
    @Override
    public Integer solve(int[] input) {
        int FIRST_MAX = Integer.MIN_VALUE;
        int SECOND_MAX = Integer.MIN_VALUE;
        for (Integer i : input) {
            FIRST_MAX = Math.max(FIRST_MAX, i);
        }
        for (Integer i : input) {
            int secondMax = Math.max(SECOND_MAX, i);
            if (secondMax != FIRST_MAX)
                SECOND_MAX = secondMax;
        }
        return SECOND_MAX;
    }

    @Override
    public String name() {
        return "BF-Linear Search";
    }

    @Override
    public String timeComplexity() {
        return "O(n)";
    }

    @Override
    public String spaceComplexity() {
        return "θ(1)";
    }
}
