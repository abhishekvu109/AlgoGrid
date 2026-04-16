package com.abhishek.algogrid.problems.dp.ReachAGivenScore;

import com.abhishek.algogrid.problems.AGProblemTemplate;

public class ReachAGivenScore extends AGProblemTemplate<Integer, Integer> {
    @Override
    protected String problemName() {
        return "Reach a Given Score";
    }

    @Override
    protected void validate(Integer input) {
    }

    @Override
    protected Integer copyInput(Integer input) {
        return input;
    }

    @Override
    protected String formatInput(Integer input) {
        return String.valueOf(input);
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.dp.reachAGivenScore";
    }
}
