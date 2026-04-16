package com.abhishek.algogrid.strategies.dp.WaysToWriteNAsSum;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.WaysToWriteNAsSumInput;

public class WaysToWriteNAsSumTabulation implements AGProblemStrategy<WaysToWriteNAsSumInput, Integer> {
    @Override
    public Integer solve(WaysToWriteNAsSumInput input) {
        throw new UnsupportedOperationException("TODO: Implement WaysToWriteNAsSum - Bottom-Up Tabulation");
    }

    @Override
    public String name() {
        return "Bottom-Up Tabulation";
    }

    @Override
    public String timeComplexity() {
        return "O(?)";
    }

    @Override
    public String spaceComplexity() {
        return "O(?)";
    }
}
