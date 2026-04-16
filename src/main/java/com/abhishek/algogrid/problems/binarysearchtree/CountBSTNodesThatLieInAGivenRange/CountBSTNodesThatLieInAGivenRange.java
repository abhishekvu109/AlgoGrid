package com.abhishek.algogrid.problems.binarysearchtree.CountBSTNodesThatLieInAGivenRange;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.CountBSTNodesThatLieInAGivenRangeInput;

public class CountBSTNodesThatLieInAGivenRange extends AGProblemTemplate<CountBSTNodesThatLieInAGivenRangeInput, Integer> {
    @Override
    protected String problemName() {
        return "Count BST Nodes in a Given Range";
    }

    @Override
    protected void validate(CountBSTNodesThatLieInAGivenRangeInput input) {
    }

    @Override
    protected CountBSTNodesThatLieInAGivenRangeInput copyInput(CountBSTNodesThatLieInAGivenRangeInput input) {
        return input;
    }

    @Override
    protected String formatInput(CountBSTNodesThatLieInAGivenRangeInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.binarysearchtree.countBSTNodesThatLieInAGivenRange";
    }
}
