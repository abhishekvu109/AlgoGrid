package com.abhishek.algogrid.problems.tree.CountNodesAtDistanceKFromLeaf;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.CountNodesAtDistanceKFromLeafInput;

public class CountNodesAtDistanceKFromLeaf extends AGProblemTemplate<CountNodesAtDistanceKFromLeafInput, Integer> {
    @Override
    protected String problemName() {
        return "Count Nodes at Distance K from Leaf";
    }

    @Override
    protected void validate(CountNodesAtDistanceKFromLeafInput input) {
    }

    @Override
    protected CountNodesAtDistanceKFromLeafInput copyInput(CountNodesAtDistanceKFromLeafInput input) {
        return input;
    }

    @Override
    protected String formatInput(CountNodesAtDistanceKFromLeafInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.tree.countNodesAtDistanceKFromLeaf";
    }
}
