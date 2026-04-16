package com.abhishek.algogrid.problems.linkedlist.MergeTwoSortedLinkedLists;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.MergeTwoSortedLinkedListsInput;

public class MergeTwoSortedLinkedLists extends AGProblemTemplate<MergeTwoSortedLinkedListsInput, int[]> {
    @Override
    protected String problemName() {
        return "Merge Two Sorted Linked Lists";
    }

    @Override
    protected void validate(MergeTwoSortedLinkedListsInput input) {
    }

    @Override
    protected MergeTwoSortedLinkedListsInput copyInput(MergeTwoSortedLinkedListsInput input) {
        return input;
    }

    @Override
    protected String formatInput(MergeTwoSortedLinkedListsInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.linkedlist.mergeTwoSortedLinkedLists";
    }
}
