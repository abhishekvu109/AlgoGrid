package com.abhishek.algogrid.strategies.arrays.SubArrayWithAGivenSum;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.SubArrayWithAGivenSumInput;

import java.util.HashMap;

public class SubArrayWithAGivenSumPrefixSum implements AGProblemStrategy<SubArrayWithAGivenSumInput, int[]> {
    @Override
    public int[] solve(SubArrayWithAGivenSumInput input) {
        int[] arr = input.arr();
        int target = input.sum();
        int n = arr.length;
        // Map from prefix sum value to the index where it was seen
        HashMap<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0, -1);
        int prefixSum = 0;
        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];
            int needed = prefixSum - target;
            if (prefixMap.containsKey(needed)) {
                int start = prefixMap.get(needed) + 1;
                return new int[]{start + 1, i + 1}; // 1-based indices
            }
            prefixMap.put(prefixSum, i);
        }
        return new int[]{-1};
    }

    @Override
    public String name() {
        return "Prefix Sum";
    }

    @Override
    public String timeComplexity() {
        return TimeComplexity.BIG_O_OF_N;
    }

    @Override
    public String spaceComplexity() {
        return SpaceComplexity.BIG_OF_N;
    }
}
