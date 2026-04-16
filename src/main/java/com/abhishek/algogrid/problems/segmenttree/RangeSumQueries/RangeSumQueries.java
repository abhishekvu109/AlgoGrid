package com.abhishek.algogrid.problems.segmenttree.RangeSumQueries;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.RangeSumQueriesInput;

public class RangeSumQueries extends AGProblemTemplate<RangeSumQueriesInput, Long> {
    @Override
    protected String problemName() {
        return "Range Sum Queries";
    }

    @Override
    protected void validate(RangeSumQueriesInput input) {
    }

    @Override
    protected RangeSumQueriesInput copyInput(RangeSumQueriesInput input) {
        return input;
    }

    @Override
    protected String formatInput(RangeSumQueriesInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Long output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.segmenttree.rangeSumQueries";
    }
}
