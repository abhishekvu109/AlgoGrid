package com.abhishek.algogrid.problems.backtracking.RatMazeWithMultipleJumps;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.RatMazeWithMultipleJumpsInput;

public class RatMazeWithMultipleJumps extends AGProblemTemplate<RatMazeWithMultipleJumpsInput, String> {
    @Override
    protected String problemName() {
        return "Rat Maze With Multiple Jumps";
    }

    @Override
    protected void validate(RatMazeWithMultipleJumpsInput input) {
    }

    @Override
    protected RatMazeWithMultipleJumpsInput copyInput(RatMazeWithMultipleJumpsInput input) {
        return input;
    }

    @Override
    protected String formatInput(RatMazeWithMultipleJumpsInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(String output) {
        return output;
    }

    @Override
    protected String strategyKey() {
        return "problem.backtracking.ratMazeWithMultipleJumps";
    }
}
