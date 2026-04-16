package com.abhishek.algogrid.problems.segmenttree.RangeGCDQueries;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.RangeGCDQueriesInput;

public class RangeGCDQueries extends AGProblemTemplate<RangeGCDQueriesInput, Integer> {
    @Override
    protected String problemName() {
        return "Range GCD Queries";
    }

    @Override
    protected void validate(RangeGCDQueriesInput input) {
    }

    @Override
    protected RangeGCDQueriesInput copyInput(RangeGCDQueriesInput input) {
        return input;
    }

    @Override
    protected String formatInput(RangeGCDQueriesInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.segmenttree.rangeGCDQueries";
    }
}
