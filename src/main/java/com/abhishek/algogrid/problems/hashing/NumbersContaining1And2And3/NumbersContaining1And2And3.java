package com.abhishek.algogrid.problems.hashing.NumbersContaining1And2And3;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;

public class NumbersContaining1And2And3 extends AGProblemTemplate<Integer, int[]> {
    @Override
    protected String problemName() {
        return "Numbers Containing 1, 2 and 3";
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
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.hashing.numbersContaining1And2And3";
    }
}
