package com.abhishek.algogrid.problems.arrays.ArrayInsertAtIndex;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.ArrayInsertAtIndexInput;

public class ArrayInsertAtIndex extends AGProblemTemplate<ArrayInsertAtIndexInput, int[]> {
    @Override
    protected String problemName() {
        return "Array Insert at Index";
    }

    @Override
    protected void validate(ArrayInsertAtIndexInput input) {
    }

    @Override
    protected ArrayInsertAtIndexInput copyInput(ArrayInsertAtIndexInput input) {
        return input;
    }

    @Override
    protected String formatInput(ArrayInsertAtIndexInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.arrays.arrayInsertAtIndex";
    }
}
