package com.abhishek.algogrid.strategies.arrays.CheckIfArrayIsSorted;

import com.abhishek.algogrid.strategies.AGProblemStrategy;

public class CheckIfArrayIsSortedBruteForce implements AGProblemStrategy<int[], Boolean> {
    @Override
    public Boolean solve(int[] input) {
        int N = input.length;
        if (input[0] < input[N - 1]) {
            for (int i = 1; i < N; i++) {
                if (input[i - 1] > input[i]) {
                    return false;
                }
            }
        } else {
            for (int i = 1; i < N; i++) {
                if (input[i - 1] < input[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public String name() {
        return "Brute force";
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
