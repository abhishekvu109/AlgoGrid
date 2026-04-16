package com.abhishek.algogrid.strategies.greedy.JobSequencingProblem;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.JobSequencingProblemInput;

public class JobSequencingProblemGreedy implements AGProblemStrategy<JobSequencingProblemInput, Integer> {
    @Override
    public Integer solve(JobSequencingProblemInput input) {
        throw new UnsupportedOperationException("TODO: Implement JobSequencingProblem - Greedy");
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
