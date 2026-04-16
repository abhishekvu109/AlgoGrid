package com.abhishek.algogrid.problems.linkedlist.LRUCache;

import com.abhishek.algogrid.problems.AGProblemTemplate;

public class LRUCache extends AGProblemTemplate<Integer, Integer> {
    @Override
    protected String problemName() {
        return "LRU Cache";
    }

    @Override
    protected void validate(Integer input) {
    }

    @Override
    protected Integer copyInput(Integer input) {
        return input;
    }

    @Override
    protected String formatInput(Integer input) {
        return String.valueOf(input);
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.linkedlist.lruCache";
    }
}
