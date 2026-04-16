package com.abhishek.algogrid.strategies.segmenttree.RangeSumQueries;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.RangeSumQueriesInput;

public class RangeSumQueriesBinaryIndexedTree implements AGProblemStrategy<RangeSumQueriesInput, Long> {
    @Override
    public Long solve(RangeSumQueriesInput input) {
        throw new UnsupportedOperationException("TODO: Implement RangeSumQueries - Binary Indexed Tree (Fenwick)");
    }

    @Override
    public String name() {
        return "Binary Indexed Tree (Fenwick)";
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
