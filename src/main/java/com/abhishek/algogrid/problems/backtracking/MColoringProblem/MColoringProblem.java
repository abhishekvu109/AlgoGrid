package com.abhishek.algogrid.problems.backtracking.MColoringProblem;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.MColoringProblemInput;

public class MColoringProblem extends AGProblemTemplate<MColoringProblemInput, Boolean> {
    @Override
    protected String problemName() {
        return "M-Coloring Problem";
    }

    @Override
    protected void validate(MColoringProblemInput input) {
    }

    @Override
    protected MColoringProblemInput copyInput(MColoringProblemInput input) {
        return input;
    }

    @Override
    protected String formatInput(MColoringProblemInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Boolean output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.backtracking.mColoringProblem";
    }
}
