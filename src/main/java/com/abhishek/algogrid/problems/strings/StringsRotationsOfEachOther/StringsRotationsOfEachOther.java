package com.abhishek.algogrid.problems.strings.StringsRotationsOfEachOther;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.StringsRotationsOfEachOtherInput;

public class StringsRotationsOfEachOther extends AGProblemTemplate<StringsRotationsOfEachOtherInput, Boolean> {
    @Override
    protected String problemName() {
        return "Strings Rotations of Each Other";
    }

    @Override
    protected void validate(StringsRotationsOfEachOtherInput input) {
    }

    @Override
    protected StringsRotationsOfEachOtherInput copyInput(StringsRotationsOfEachOtherInput input) {
        return input;
    }

    @Override
    protected String formatInput(StringsRotationsOfEachOtherInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Boolean output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.strings.stringsRotationsOfEachOther";
    }
}
