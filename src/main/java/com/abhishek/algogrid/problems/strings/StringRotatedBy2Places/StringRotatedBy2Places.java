package com.abhishek.algogrid.problems.strings.StringRotatedBy2Places;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.StringRotatedBy2PlacesInput;

public class StringRotatedBy2Places extends AGProblemTemplate<StringRotatedBy2PlacesInput, Boolean> {
    @Override
    protected String problemName() {
        return "String Rotated by 2 Places";
    }

    @Override
    protected void validate(StringRotatedBy2PlacesInput input) {
    }

    @Override
    protected StringRotatedBy2PlacesInput copyInput(StringRotatedBy2PlacesInput input) {
        return input;
    }

    @Override
    protected String formatInput(StringRotatedBy2PlacesInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Boolean output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.strings.stringRotatedBy2Places";
    }
}
