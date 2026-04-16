package com.abhishek.algogrid.strategies.dp.NCR;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.NCRInput;

public class NCRTabulation implements AGProblemStrategy<NCRInput, Integer> {
    @Override
    public Integer solve(NCRInput input) {
        throw new UnsupportedOperationException("TODO: Implement NCR - Bottom-Up Tabulation");
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
