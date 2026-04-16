package com.abhishek.algogrid.problems.heap.BinaryHeapOperations;

import com.abhishek.algogrid.problems.AGProblemTemplate;

public class BinaryHeapOperations extends AGProblemTemplate<Integer, String> {
    @Override
    protected String problemName() {
        return "Binary Heap Operations";
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
        return "problem.heap.binaryHeapOperations";
    }
}
