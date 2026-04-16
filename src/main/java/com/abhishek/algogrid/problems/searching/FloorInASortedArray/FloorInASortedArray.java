package com.abhishek.algogrid.problems.searching.FloorInASortedArray;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.FloorInASortedArrayInput;

public class FloorInASortedArray extends AGProblemTemplate<FloorInASortedArrayInput, Integer> {
    @Override
    protected String problemName() {
        return "Floor in a Sorted Array";
    }

    @Override
    protected void validate(FloorInASortedArrayInput input) {
    }

    @Override
    protected FloorInASortedArrayInput copyInput(FloorInASortedArrayInput input) {
        return input;
    }

    @Override
    protected String formatInput(FloorInASortedArrayInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.searching.floorInASortedArray";
    }
}
