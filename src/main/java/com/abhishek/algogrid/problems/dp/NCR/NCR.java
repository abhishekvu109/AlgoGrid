package com.abhishek.algogrid.problems.dp.NCR;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.NCRInput;

public class NCR extends AGProblemTemplate<NCRInput, Integer> {
    @Override
    protected String problemName() {
        return "nCr";
    }

    @Override
    protected void validate(NCRInput input) {
    }

    @Override
    protected NCRInput copyInput(NCRInput input) {
        return input;
    }

    @Override
    protected String formatInput(NCRInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.dp.ncr";
    }
}
