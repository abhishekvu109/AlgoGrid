package com.abhishek.algogrid.problems.linkedlist.JoinTwoLinkedLists;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.JoinTwoLinkedListsInput;

public class JoinTwoLinkedLists extends AGProblemTemplate<JoinTwoLinkedListsInput, int[]> {
    @Override
    protected String problemName() {
        return "Join Two Linked Lists";
    }

    @Override
    protected void validate(JoinTwoLinkedListsInput input) {
    }

    @Override
    protected JoinTwoLinkedListsInput copyInput(JoinTwoLinkedListsInput input) {
        return input;
    }

    @Override
    protected String formatInput(JoinTwoLinkedListsInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.linkedlist.joinTwoLinkedLists";
    }
}
