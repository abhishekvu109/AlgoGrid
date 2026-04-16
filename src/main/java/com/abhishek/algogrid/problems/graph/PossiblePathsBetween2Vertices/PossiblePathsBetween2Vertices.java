package com.abhishek.algogrid.problems.graph.PossiblePathsBetween2Vertices;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.PossiblePathsBetween2VerticesInput;

public class PossiblePathsBetween2Vertices extends AGProblemTemplate<PossiblePathsBetween2VerticesInput, Integer> {
    @Override
    protected String problemName() {
        return "Possible Paths Between 2 Vertices";
    }

    @Override
    protected void validate(PossiblePathsBetween2VerticesInput input) {
    }

    @Override
    protected PossiblePathsBetween2VerticesInput copyInput(PossiblePathsBetween2VerticesInput input) {
        return input;
    }

    @Override
    protected String formatInput(PossiblePathsBetween2VerticesInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.graph.possiblePathsBetween2Vertices";
    }
}
