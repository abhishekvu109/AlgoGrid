package com.abhishek.algogrid.problems.searching.SortedArraySearch;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.SortedArraySearchInput;

public class SortedArraySearch extends AGProblemTemplate<SortedArraySearchInput, Integer> {
    @Override
    protected String problemName() {
        return "Sorted Array Search";
    }

    @Override
    protected void validate(SortedArraySearchInput input) {
    }

    @Override
    protected SortedArraySearchInput copyInput(SortedArraySearchInput input) {
        return input;
    }

    @Override
    protected String formatInput(SortedArraySearchInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.searching.sortedArraySearch";
    }
}
