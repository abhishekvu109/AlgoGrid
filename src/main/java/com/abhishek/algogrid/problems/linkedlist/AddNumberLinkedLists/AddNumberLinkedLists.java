package com.abhishek.algogrid.problems.linkedlist.AddNumberLinkedLists;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.AddNumberLinkedListsInput;

public class AddNumberLinkedLists extends AGProblemTemplate<AddNumberLinkedListsInput, int[]> {
    @Override
    protected String problemName() {
        return "Add Number Linked Lists";
    }

    @Override
    protected void validate(AddNumberLinkedListsInput input) {
    }

    @Override
    protected AddNumberLinkedListsInput copyInput(AddNumberLinkedListsInput input) {
        return input;
    }

    @Override
    protected String formatInput(AddNumberLinkedListsInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.linkedlist.addNumberLinkedLists";
    }
}
