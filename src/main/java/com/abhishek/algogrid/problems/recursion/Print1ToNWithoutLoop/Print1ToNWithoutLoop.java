package com.abhishek.algogrid.problems.recursion.Print1ToNWithoutLoop;

import com.abhishek.algogrid.problems.AGProblemTemplate;

public class Print1ToNWithoutLoop extends AGProblemTemplate<Integer, String> {
    @Override
    protected String problemName() {
        return "Print 1 To N Without Loop";
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
    protected String formatOutput(String output) {
        return output;
    }

    @Override
    protected String strategyKey() {
        return "problem.recursion.print1ToNWithoutLoop";
    }
}
