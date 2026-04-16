package com.abhishek.algogrid.strategies.matrix.SearchInASortedMatrix;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.SearchInASortedMatrixInput;

public class SearchInASortedMatrixBruteForce implements AGProblemStrategy<SearchInASortedMatrixInput, Boolean> {
    @Override
    public Boolean solve(SearchInASortedMatrixInput input) {
        throw new UnsupportedOperationException("TODO: Implement SearchInASortedMatrix - Brute Force");
    }

    @Override
    public String name() {
        return "Brute Force";
    }

    @Override
    public String timeComplexity() {
        return "O(?)";
    }

    @Override
    public String spaceComplexity() {
        return "O(?)";
    }
}
