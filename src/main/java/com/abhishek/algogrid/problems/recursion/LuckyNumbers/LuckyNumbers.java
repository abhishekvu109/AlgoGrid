package com.abhishek.algogrid.problems.recursion.LuckyNumbers;

import com.abhishek.algogrid.problems.AGProblemTemplate;

public class LuckyNumbers extends AGProblemTemplate<Integer, Boolean> {
    @Override
    protected String problemName() {
        return "Lucky Numbers";
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
    protected String formatOutput(Boolean output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.recursion.luckyNumbers";
    }
}
