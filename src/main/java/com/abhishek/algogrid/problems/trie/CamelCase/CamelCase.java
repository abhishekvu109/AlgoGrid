package com.abhishek.algogrid.problems.trie.CamelCase;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;

public class CamelCase extends AGProblemTemplate<String[], int[]> {
    @Override
    protected String problemName() {
        return "Camel Case";
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
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.trie.camelCase";
    }
}
