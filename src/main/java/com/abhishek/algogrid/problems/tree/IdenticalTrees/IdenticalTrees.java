package com.abhishek.algogrid.problems.tree.IdenticalTrees;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.IdenticalTreesInput;

public class IdenticalTrees extends AGProblemTemplate<IdenticalTreesInput, Boolean> {
    @Override
    protected String problemName() {
        return "Identical Trees";
    }

    @Override
    protected void validate(IdenticalTreesInput input) {
    }

    @Override
    protected IdenticalTreesInput copyInput(IdenticalTreesInput input) {
        return input;
    }

    @Override
    protected String formatInput(IdenticalTreesInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Boolean output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.tree.identicalTrees";
    }
}
