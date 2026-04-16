package com.abhishek.algogrid.strategies.greedy.ActivitySelection;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.ActivitySelectionInput;

public class ActivitySelectionGreedy implements AGProblemStrategy<ActivitySelectionInput, Integer> {
    @Override
    public Integer solve(ActivitySelectionInput input) {
        throw new UnsupportedOperationException("TODO: Implement ActivitySelection - Greedy");
    }

    @Override
    public String name() {
        return "Greedy";
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
