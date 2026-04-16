package com.abhishek.algogrid.problems.dp.CountWaysToNthStair;

import com.abhishek.algogrid.problems.AGProblemTemplate;

public class CountWaysToNthStair extends AGProblemTemplate<Integer, Integer> {
    @Override
    protected String problemName() {
        return "Count Ways to N'th Stair";
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
        return "problem.dp.countWaysToNthStair";
    }
}
