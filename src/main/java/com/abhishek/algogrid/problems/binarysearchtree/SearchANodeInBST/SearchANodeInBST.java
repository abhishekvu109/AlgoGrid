package com.abhishek.algogrid.problems.binarysearchtree.SearchANodeInBST;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.SearchANodeInBSTInput;

public class SearchANodeInBST extends AGProblemTemplate<SearchANodeInBSTInput, Boolean> {
    @Override
    protected String problemName() {
        return "Search a Node in BST";
    }

    @Override
    protected void validate(SearchANodeInBSTInput input) {
    }

    @Override
    protected SearchANodeInBSTInput copyInput(SearchANodeInBSTInput input) {
        return input;
    }

    @Override
    protected String formatInput(SearchANodeInBSTInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Boolean output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.binarysearchtree.searchANodeInBST";
    }
}
