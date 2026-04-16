package com.abhishek.algogrid.problems.bitmagic.LongestConsecutive1s;

import com.abhishek.algogrid.problems.AGProblemTemplate;

public class LongestConsecutive1s extends AGProblemTemplate<Integer, Integer> {
    @Override
    protected String problemName() {
        return "Longest Consecutive 1s";
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
        return "problem.bitmagic.longestConsecutive1s";
    }
}
