package com.abhishek.algogrid.problems.recursion.JosephusProblem;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.JosephusProblemInput;

public class JosephusProblem extends AGProblemTemplate<JosephusProblemInput, Integer> {
    @Override
    protected String problemName() {
        return "Josephus Problem";
    }

    @Override
    protected void validate(JosephusProblemInput input) {
    }

    @Override
    protected JosephusProblemInput copyInput(JosephusProblemInput input) {
        return input;
    }

    @Override
    protected String formatInput(JosephusProblemInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.recursion.josephusProblem";
    }
}
