package com.abhishek.algogrid.problems.arrays.LeftRotateAnArrayByDPlaces;

import com.abhishek.algogrid.input.LeftRotateAnArrayByDPlacesInput;
import com.abhishek.algogrid.problems.AGProblemTemplate;

import java.util.Arrays;

public class LeftRotateAnArrayByDPlaces extends AGProblemTemplate<LeftRotateAnArrayByDPlacesInput, int[]> {
    @Override
    protected String problemName() {
        return "Left rotate an array by D places.";
    }

    @Override
    protected void validate(LeftRotateAnArrayByDPlacesInput input) {

    }

    @Override
    protected LeftRotateAnArrayByDPlacesInput copyInput(LeftRotateAnArrayByDPlacesInput input) {
        return input;
    }

    @Override
    protected String formatInput(LeftRotateAnArrayByDPlacesInput input) {
        return "Array: " + Arrays.toString(input.input()) + ",  D: " + input.D();
    }

    @Override
    protected String formatOutput(int[] output) {
        return Arrays.toString(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.arrays.leftRotateAnArrayByDPlaces";
    }
}
