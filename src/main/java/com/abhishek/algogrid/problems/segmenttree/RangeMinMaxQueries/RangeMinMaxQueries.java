package com.abhishek.algogrid.problems.segmenttree.RangeMinMaxQueries;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.RangeMinMaxQueriesInput;

public class RangeMinMaxQueries extends AGProblemTemplate<RangeMinMaxQueriesInput, int[]> {
    @Override
    protected String problemName() {
        return "Range Min Max Queries";
    }

    @Override
    protected void validate(RangeMinMaxQueriesInput input) {
    }

    @Override
    protected RangeMinMaxQueriesInput copyInput(RangeMinMaxQueriesInput input) {
        return input;
    }

    @Override
    protected String formatInput(RangeMinMaxQueriesInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.segmenttree.rangeMinMaxQueries";
    }
}
