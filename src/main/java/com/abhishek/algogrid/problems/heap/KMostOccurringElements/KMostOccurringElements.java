package com.abhishek.algogrid.problems.heap.KMostOccurringElements;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;
import com.abhishek.algogrid.input.KMostOccurringElementsInput;

public class KMostOccurringElements extends AGProblemTemplate<KMostOccurringElementsInput, int[]> {
    @Override
    protected String problemName() {
        return "K Most Occurring Elements";
    }

    @Override
    protected void validate(KMostOccurringElementsInput input) {
    }

    @Override
    protected KMostOccurringElementsInput copyInput(KMostOccurringElementsInput input) {
        return input;
    }

    @Override
    protected String formatInput(KMostOccurringElementsInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.heap.kMostOccurringElements";
    }
}
