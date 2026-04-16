package com.abhishek.algogrid.problems.linkedlist.DeleteWithoutHeadPointer;

import com.abhishek.algogrid.problems.AGProblemTemplate;

public class DeleteWithoutHeadPointer extends AGProblemTemplate<Integer, String> {
    @Override
    protected String problemName() {
        return "Delete Without Head Pointer";
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
    protected String formatOutput(String output) {
        return output;
    }

    @Override
    protected String strategyKey() {
        return "problem.linkedlist.deleteWithoutHeadPointer";
    }
}
