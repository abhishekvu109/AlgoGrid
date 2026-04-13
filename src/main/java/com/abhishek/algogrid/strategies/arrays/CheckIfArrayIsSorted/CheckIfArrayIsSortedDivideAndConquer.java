package com.abhishek.algogrid.strategies.arrays.CheckIfArrayIsSorted;

import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;

public class CheckIfArrayIsSortedDivideAndConquer implements AGProblemStrategy<int[], Boolean> {
    @Override
    public Boolean solve(int[] input) {
        if (input.length == 1)
            return true;
        boolean isAsc = (input[0] < input[input.length - 1]);
        return solve(input, 0, input.length - 1, isAsc);
    }

    private Boolean solve(int[] input, int left, int right, boolean isAsc) {
        if (left >= right)
            return true;
        int mid = (left + right) / 2;
        boolean leftCall = solve(input, left, mid, isAsc);
        boolean rightCall = solve(input, mid + 1, right, isAsc);
        boolean current = isAsc ? input[left] < input[right] : input[left] > input[right];
        return leftCall && rightCall && current;
    }

    @Override
    public String name() {
        return "Divide & Conquer";
    }

    @Override
    public String timeComplexity() {
        return TimeComplexity.LOG_N;
    }

    @Override
    public String spaceComplexity() {
        return TimeComplexity.LOG_N;
    }
}
