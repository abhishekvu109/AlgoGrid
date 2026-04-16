package com.abhishek.algogrid.problems.dp.EggDroppingPuzzle;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.EggDroppingPuzzleInput;

public class EggDroppingPuzzle extends AGProblemTemplate<EggDroppingPuzzleInput, Integer> {
    @Override
    protected String problemName() {
        return "Egg Dropping Puzzle";
    }

    @Override
    protected void validate(EggDroppingPuzzleInput input) {
    }

    @Override
    protected EggDroppingPuzzleInput copyInput(EggDroppingPuzzleInput input) {
        return input;
    }

    @Override
    protected String formatInput(EggDroppingPuzzleInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.dp.eggDroppingPuzzle";
    }
}
