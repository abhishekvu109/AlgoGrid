package com.abhishek.algogrid.strategies.arrays.WhoHasTheMajority;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;

public class WhoHasTheMajorityMooresVoting implements AGProblemStrategy<int[], Integer> {
    @Override
    public Integer solve(int[] input) {
        int candidate = input[0];
        int currentCount = 1;
        int N = input.length;
        for (int i = 1; i < N; i++) {
            if (candidate == input[i]) {
                currentCount++;
            } else {
                currentCount--;
            }
            if (currentCount == 0) {
                candidate = input[i];
                currentCount = 1;
            }
        }
        int checkoutCount = this.count(input, N, candidate);
        return checkoutCount > (N / 2) ? candidate : -1;
    }

    private int count(int[] input, int N, int candidate) {
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (candidate == input[i]) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String name() {
        return "Moore's Voting Algorithm";
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
