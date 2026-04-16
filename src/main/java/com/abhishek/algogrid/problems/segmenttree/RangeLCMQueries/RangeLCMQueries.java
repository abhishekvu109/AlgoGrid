package com.abhishek.algogrid.problems.segmenttree.RangeLCMQueries;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.RangeLCMQueriesInput;

public class RangeLCMQueries extends AGProblemTemplate<RangeLCMQueriesInput, Long> {
    @Override
    protected String problemName() {
        return "Range LCM Queries";
    }

    @Override
    protected void validate(RangeLCMQueriesInput input) {
    }

    @Override
    protected RangeLCMQueriesInput copyInput(RangeLCMQueriesInput input) {
        return input;
    }

    @Override
    protected String formatInput(RangeLCMQueriesInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Long output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.segmenttree.rangeLCMQueries";
    }
}
