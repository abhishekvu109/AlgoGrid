package com.abhishek.algogrid.strategies.arrays.MoveZeroToEnd;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;

public class MoveZerosToEndTwoPointerApproach implements AGProblemStrategy<int[], int[]> {

    @Override
    public int[] solve(int[] input) {
        int left = 0, N = input.length;
        int right = N - 1;
        while (left < right) {
            if (input[right] == 0) {
                right--;
            } else if (input[left] != 0) {
                left++;
            } else {
                int temp = input[left];
                input[left] = input[right];
                input[right] = temp;
                left++;
                right--;
            }
        }
        return input;
    }

    @Override
    public String name() {
        return "Using two-pointer approach.";
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
