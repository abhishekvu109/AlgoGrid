package com.abhishek.algogrid.problems.sorting.TripletSumInArray;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.TripletSumInArrayInput;

public class TripletSumInArray extends AGProblemTemplate<TripletSumInArrayInput, Boolean> {
    @Override
    protected String problemName() {
        return "Triplet Sum in Array";
    }

    @Override
    protected void validate(TripletSumInArrayInput input) {
    }

    @Override
    protected TripletSumInArrayInput copyInput(TripletSumInArrayInput input) {
        return input;
    }

    @Override
    protected String formatInput(TripletSumInArrayInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Boolean output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.sorting.tripletSumInArray";
    }
}
