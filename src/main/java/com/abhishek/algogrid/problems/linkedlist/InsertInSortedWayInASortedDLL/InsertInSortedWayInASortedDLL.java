package com.abhishek.algogrid.problems.linkedlist.InsertInSortedWayInASortedDLL;

import com.abhishek.algogrid.problems.AGProblemTemplate;

public class InsertInSortedWayInASortedDLL extends AGProblemTemplate<Integer, String> {
    @Override
    protected String problemName() {
        return "Insert in Sorted Way in a Sorted DLL";
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
        return "problem.linkedlist.insertInSortedWayInASortedDLL";
    }
}
