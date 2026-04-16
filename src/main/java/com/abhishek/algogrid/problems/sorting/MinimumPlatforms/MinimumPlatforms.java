package com.abhishek.algogrid.problems.sorting.MinimumPlatforms;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.MinimumPlatformsInput;

public class MinimumPlatforms extends AGProblemTemplate<MinimumPlatformsInput, Integer> {
    @Override
    protected String problemName() {
        return "Minimum Platforms";
    }

    @Override
    protected void validate(MinimumPlatformsInput input) {
    }

    @Override
    protected MinimumPlatformsInput copyInput(MinimumPlatformsInput input) {
        return input;
    }

    @Override
    protected String formatInput(MinimumPlatformsInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.sorting.minimumPlatforms";
    }
}
