package com.abhishek.algogrid.problems.arrays.LargestElementInAnArray;

import com.abhishek.algogrid.problems.AGProblemTemplate;

public class LargestElementInAnArray extends AGProblemTemplate<Long[], Long> {

    @Override
    protected String problemName() {
        return "Largest element in an Array.";
    }

    @Override
    protected void validate(Long[] input) {
        if (input.length == 0) {
            throw new IllegalArgumentException("Required a value in the input.");
        }
    }

    @Override
    protected Long[] copyInput(Long[] input) {
        return input.clone();
    }

    @Override
    protected String formatInput(Long[] input) {
        StringBuilder s = new StringBuilder("[");
        for (Long l : input) {
            s.append(l);
            s.append(",");
        }
        s.deleteCharAt(s.length() - 1);
        s.append("]");
        return s.toString();
    }

    @Override
    protected String formatOutput(Long output) {
        return output.toString();
    }

    @Override
    protected String strategyKey() {
        return "problem.arrays.largestElementInAnArray";
    }
}
