package com.abhishek.algogrid.strategies.arrays.ArrayLeaders;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;

import java.util.ArrayList;

public class ArrayLeadersLinearSolution implements AGProblemStrategy<int[], int[]> {
    @Override
    public int[] solve(int[] arr) {
        int currentMax = Integer.MIN_VALUE;
        ArrayList<Integer> result = new ArrayList<>();
        int N = arr.length;
        for (int i = N; i > 0; i--) {
            if (arr[i - 1] >= currentMax) {
                currentMax = arr[i - 1];
                result.addFirst(currentMax);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    @Override
    public String name() {
        return "Leaders in an Array using Linear solution.";
    }

    @Override
    public String timeComplexity() {
        return TimeComplexity.THETA_N;
    }

    @Override
    public String spaceComplexity() {
        return SpaceComplexity.THETA_N;
    }
}
