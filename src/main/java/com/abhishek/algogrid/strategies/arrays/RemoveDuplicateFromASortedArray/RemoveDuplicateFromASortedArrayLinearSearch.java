package com.abhishek.algogrid.strategies.arrays.RemoveDuplicateFromASortedArray;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;

import java.util.Stack;

public class RemoveDuplicateFromASortedArrayLinearSearch implements AGProblemStrategy<int[], int[]> {
    @Override
    public int[] solve(int[] input) {
        Stack<Integer> stack = new Stack<>();
        int N = input.length;
        stack.push(input[0]);
        for (int i = 1; i < N; i++) {
            if (stack.peek() != input[i]) {
                stack.push(input[i]);
            }
        }
        int distinctSize = stack.size();
        int[] result = new int[distinctSize];
        for (int i = distinctSize; i > 0; i--) {
            result[i - 1] = stack.pop();
        }
        return result;
    }

    @Override
    public String name() {
        return "Linear search";
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
