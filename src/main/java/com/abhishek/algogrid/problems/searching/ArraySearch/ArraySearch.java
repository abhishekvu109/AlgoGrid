package com.abhishek.algogrid.problems.searching.ArraySearch;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.ArraySearchInput;

public class ArraySearch extends AGProblemTemplate<ArraySearchInput, Integer> {
    @Override
    protected String problemName() {
        return "Array Search";
    }

    @Override
    protected void validate(ArraySearchInput input) {
    }

    @Override
    protected ArraySearchInput copyInput(ArraySearchInput input) {
        return input;
    }

    @Override
    protected String formatInput(ArraySearchInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.searching.arraySearch";
    }
}
