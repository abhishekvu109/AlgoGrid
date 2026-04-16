package com.abhishek.algogrid.strategies.arrays.SubArrayWithAGivenSum;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.SubArrayWithAGivenSumInput;

public class SubArrayWithAGivenSumSlidingWindow implements AGProblemStrategy<SubArrayWithAGivenSumInput, int[]> {
    @Override
    public int[] solve(SubArrayWithAGivenSumInput input) {
        int[] arr = input.arr();
        int target = input.sum();
        int n = arr.length;
        int left = 0;
        int currentSum = 0;
        for (int right = 0; right < n; right++) {
            currentSum += arr[right];
            while (currentSum > target && left < right) {
                currentSum -= arr[left++];
            }
            if (currentSum == target) {
                return new int[]{left + 1, right + 1}; // 1-based indices
            }
        }
        return new int[]{-1};
    }

    @Override
    public String name() {
        return "Sliding Window";
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
