package com.abhishek.algogrid.problems.greedy.JobSequencingProblem;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.JobSequencingProblemInput;

public class JobSequencingProblem extends AGProblemTemplate<JobSequencingProblemInput, Integer> {
    @Override
    protected String problemName() {
        return "Job Sequencing Problem";
    }

    @Override
    protected void validate(JobSequencingProblemInput input) {
    }

    @Override
    protected JobSequencingProblemInput copyInput(JobSequencingProblemInput input) {
        return input;
    }

    @Override
    protected String formatInput(JobSequencingProblemInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.greedy.jobSequencingProblem";
    }
}
