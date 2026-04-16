package com.abhishek.algogrid.problems.matrix.SearchInASortedMatrix;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.SearchInASortedMatrixInput;

public class SearchInASortedMatrix extends AGProblemTemplate<SearchInASortedMatrixInput, Boolean> {
    @Override
    protected String problemName() {
        return "Search in a Sorted Matrix";
    }

    @Override
    protected void validate(SearchInASortedMatrixInput input) {
    }

    @Override
    protected SearchInASortedMatrixInput copyInput(SearchInASortedMatrixInput input) {
        return input;
    }

    @Override
    protected String formatInput(SearchInASortedMatrixInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Boolean output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.matrix.searchInASortedMatrix";
    }
}
