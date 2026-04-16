package com.abhishek.algogrid.problems.linkedlist.IntersectionInYShapedLists;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.IntersectionInYShapedListsInput;

public class IntersectionInYShapedLists extends AGProblemTemplate<IntersectionInYShapedListsInput, Integer> {
    @Override
    protected String problemName() {
        return "Intersection in Y Shaped Lists";
    }

    @Override
    protected void validate(IntersectionInYShapedListsInput input) {
    }

    @Override
    protected IntersectionInYShapedListsInput copyInput(IntersectionInYShapedListsInput input) {
        return input;
    }

    @Override
    protected String formatInput(IntersectionInYShapedListsInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.linkedlist.intersectionInYShapedLists";
    }
}
