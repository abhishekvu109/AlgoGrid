package com.abhishek.algogrid.problems.linkedlist.IdenticalLinkedLists;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.IdenticalLinkedListsInput;

public class IdenticalLinkedLists extends AGProblemTemplate<IdenticalLinkedListsInput, Boolean> {
    @Override
    protected String problemName() {
        return "Identical Linked Lists";
    }

    @Override
    protected void validate(IdenticalLinkedListsInput input) {
    }

    @Override
    protected IdenticalLinkedListsInput copyInput(IdenticalLinkedListsInput input) {
        return input;
    }

    @Override
    protected String formatInput(IdenticalLinkedListsInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Boolean output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.linkedlist.identicalLinkedLists";
    }
}
