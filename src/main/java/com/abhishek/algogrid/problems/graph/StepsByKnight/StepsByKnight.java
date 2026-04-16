package com.abhishek.algogrid.problems.graph.StepsByKnight;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.StepsByKnightInput;

public class StepsByKnight extends AGProblemTemplate<StepsByKnightInput, Integer> {
    @Override
    protected String problemName() {
        return "Steps by Knight";
    }

    @Override
    protected void validate(StepsByKnightInput input) {
    }

    @Override
    protected StepsByKnightInput copyInput(StepsByKnightInput input) {
        return input;
    }

    @Override
    protected String formatInput(StepsByKnightInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.graph.stepsByKnight";
    }
}
