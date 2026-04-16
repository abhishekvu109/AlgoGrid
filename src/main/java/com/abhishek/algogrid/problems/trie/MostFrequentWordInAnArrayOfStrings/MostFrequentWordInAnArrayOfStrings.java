package com.abhishek.algogrid.problems.trie.MostFrequentWordInAnArrayOfStrings;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;

public class MostFrequentWordInAnArrayOfStrings extends AGProblemTemplate<String[], String> {
    @Override
    protected String problemName() {
        return "Most Frequent Word in an Array of Strings";
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
    protected String formatOutput(String output) {
        return output;
    }

    @Override
    protected String strategyKey() {
        return "problem.trie.mostFrequentWordInAnArrayOfStrings";
    }
}
