package com.abhishek.algogrid.problems.dp.MaximizeTheCutSegments;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.MaximizeTheCutSegmentsInput;

public class MaximizeTheCutSegments extends AGProblemTemplate<MaximizeTheCutSegmentsInput, Integer> {
    @Override
    protected String problemName() {
        return "Maximize the Cut Segments";
    }

    @Override
    protected void validate(MaximizeTheCutSegmentsInput input) {
    }

    @Override
    protected MaximizeTheCutSegmentsInput copyInput(MaximizeTheCutSegmentsInput input) {
        return input;
    }

    @Override
    protected String formatInput(MaximizeTheCutSegmentsInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.dp.maximizeTheCutSegments";
    }
}
