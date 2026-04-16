package com.abhishek.algogrid.strategies.dp.EggDroppingPuzzle;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.EggDroppingPuzzleInput;

public class EggDroppingPuzzleMemoization implements AGProblemStrategy<EggDroppingPuzzleInput, Integer> {
    @Override
    public Integer solve(EggDroppingPuzzleInput input) {
        throw new UnsupportedOperationException("TODO: Implement EggDroppingPuzzle - Top-Down Memoization");
    }

    @Override
    public String name() {
        return "Top-Down Memoization";
    }

    @Override
    public String timeComplexity() {
        return "O(?)";
    }

    @Override
    public String spaceComplexity() {
        return "O(?)";
    }
}
