package com.abhishek.algogrid.problems.tree.CheckIfSubtree;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.CheckIfSubtreeInput;

public class CheckIfSubtree extends AGProblemTemplate<CheckIfSubtreeInput, Boolean> {
    @Override
    protected String problemName() {
        return "Check if Subtree";
    }

    @Override
    protected void validate(CheckIfSubtreeInput input) {
    }

    @Override
    protected CheckIfSubtreeInput copyInput(CheckIfSubtreeInput input) {
        return input;
    }

    @Override
    protected String formatInput(CheckIfSubtreeInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Boolean output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.tree.checkIfSubtree";
    }
}
