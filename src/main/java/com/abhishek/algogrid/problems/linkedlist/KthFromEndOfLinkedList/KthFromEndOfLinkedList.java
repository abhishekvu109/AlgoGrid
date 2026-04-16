package com.abhishek.algogrid.problems.linkedlist.KthFromEndOfLinkedList;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.KthFromEndOfLinkedListInput;

public class KthFromEndOfLinkedList extends AGProblemTemplate<KthFromEndOfLinkedListInput, Integer> {
    @Override
    protected String problemName() {
        return "Kth From End of Linked List";
    }

    @Override
    protected void validate(KthFromEndOfLinkedListInput input) {
    }

    @Override
    protected KthFromEndOfLinkedListInput copyInput(KthFromEndOfLinkedListInput input) {
        return input;
    }

    @Override
    protected String formatInput(KthFromEndOfLinkedListInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.linkedlist.kthFromEndOfLinkedList";
    }
}
