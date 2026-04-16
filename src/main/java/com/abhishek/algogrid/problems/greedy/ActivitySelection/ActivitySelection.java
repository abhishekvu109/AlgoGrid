package com.abhishek.algogrid.problems.greedy.ActivitySelection;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.ActivitySelectionInput;

public class ActivitySelection extends AGProblemTemplate<ActivitySelectionInput, Integer> {
    @Override
    protected String problemName() {
        return "Activity Selection";
    }

    @Override
    protected void validate(ActivitySelectionInput input) {
    }

    @Override
    protected ActivitySelectionInput copyInput(ActivitySelectionInput input) {
        return input;
    }

    @Override
    protected String formatInput(ActivitySelectionInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.greedy.activitySelection";
    }
}
