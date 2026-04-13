package com.abhishek.algogrid.strategies;

public interface AGProblemStrategy<I, O> {
    O solve(I input);

    String name();

    String timeComplexity();

    String spaceComplexity();
}
