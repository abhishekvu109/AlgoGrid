package com.abhishek.algogrid.strategies.arrays.ReverseAnArray;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;

public class ReverseAnArrayTwoPointer implements AGProblemStrategy<int[], int[]> {
    @Override
    public int[] solve(int[] input) {
        int N = input.length, left = 0;
        int right = N - 1;
        while (left < right) {
            input[left] = input[right];
            left++;
            right--;
        }
        return input;
    }

    @Override
    public String name() {
        return "Two pointer approach";
    }

    @Override
    public String timeComplexity() {
        return TimeComplexity.BIG_O_OF_N;
    }

    @Override
    public String spaceComplexity() {
        return SpaceComplexity.THETA_OF_ONE;
    }
}
