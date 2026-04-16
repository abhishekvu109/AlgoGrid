package com.abhishek.algogrid.problems.hashing.AccountMerge;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;

public class AccountMerge extends AGProblemTemplate<String[], String[]> {
    @Override
    protected String problemName() {
        return "Account Merge";
    }

    @Override
    protected void validate(String[] input) {
    }

    @Override
    protected String[] copyInput(String[] input) {
        return input;
    }

    @Override
    protected String formatInput(String[] input) {
        return Arrays.toString(input);
    }

    @Override
    protected String formatOutput(String[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.hashing.accountMerge";
    }
}
