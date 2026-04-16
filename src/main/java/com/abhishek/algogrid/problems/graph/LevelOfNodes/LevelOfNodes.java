package com.abhishek.algogrid.problems.graph.LevelOfNodes;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.LevelOfNodesInput;

public class LevelOfNodes extends AGProblemTemplate<LevelOfNodesInput, Integer> {
    @Override
    protected String problemName() {
        return "Level of Nodes";
    }

    @Override
    protected void validate(LevelOfNodesInput input) {
    }

    @Override
    protected LevelOfNodesInput copyInput(LevelOfNodesInput input) {
        return input;
    }

    @Override
    protected String formatInput(LevelOfNodesInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.graph.levelOfNodes";
    }
}
