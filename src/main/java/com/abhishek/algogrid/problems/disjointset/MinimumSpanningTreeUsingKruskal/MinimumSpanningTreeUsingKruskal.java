package com.abhishek.algogrid.problems.disjointset.MinimumSpanningTreeUsingKruskal;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import java.util.Arrays;

public class MinimumSpanningTreeUsingKruskal extends AGProblemTemplate<int[], Integer> {
    @Override
    protected String problemName() {
        return "Minimum Spanning Tree using Kruskal";
    }

    @Override
    protected void validate(int[] input) {
    }

    @Override
    protected int[] copyInput(int[] input) {
        return input.clone();
    }

    @Override
    protected String formatInput(int[] input) {
        return Arrays.toString(input);
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.disjointset.minimumSpanningTreeUsingKruskal";
    }
}
