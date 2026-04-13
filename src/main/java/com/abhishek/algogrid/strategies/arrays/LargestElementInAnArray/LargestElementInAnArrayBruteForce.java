package com.abhishek.algogrid.strategies.arrays.LargestElementInAnArray;

import com.abhishek.algogrid.strategies.AGProblemStrategy;

public class LargestElementInAnArrayBruteForce implements AGProblemStrategy<Long[], Long> {
    @Override
    public Long solve(Long[] input) {
        long result = Long.MIN_VALUE;
        for (Long i : input) {
            result = Math.max(result, i);
        }
        return result;
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
        return "Theta(1)";
    }
}
