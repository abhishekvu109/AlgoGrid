package com.abhishek.algogrid.problems.graph.FindWhetherPathExist;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.FindWhetherPathExistInput;

public class FindWhetherPathExist extends AGProblemTemplate<FindWhetherPathExistInput, Boolean> {
    @Override
    protected String problemName() {
        return "Find Whether Path Exist";
    }

    @Override
    protected void validate(FindWhetherPathExistInput input) {
    }

    @Override
    protected FindWhetherPathExistInput copyInput(FindWhetherPathExistInput input) {
        return input;
    }

    @Override
    protected String formatInput(FindWhetherPathExistInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Boolean output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.graph.findWhetherPathExist";
    }
}
