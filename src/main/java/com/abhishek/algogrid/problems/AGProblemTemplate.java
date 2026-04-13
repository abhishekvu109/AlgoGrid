package com.abhishek.algogrid.problems;

import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.strategies.AGProblemStrategyFactory;

import java.util.List;

public abstract class AGProblemTemplate<I,O>{
    // THE TEMPLATE — this flow never changes
    public final void run(I input) {
        System.out.println("\n" + "=".repeat(100));
        System.out.println("Problem : " + problemName());
        System.out.println("Input   : " + formatInput(input));
        System.out.println("=".repeat(100));

        validate(input);                    // Step 1 — guard
        List<AGProblemStrategy<I, O>> strategies = loadStrategies(); // Step 2 — Factory called HERE

        for (AGProblemStrategy<I, O> strategy : strategies) {
            long start = System.nanoTime();
            O result = strategy.solve(copyInput(input));   // Step 3 — Strategy called HERE
            long elapsed = System.nanoTime() - start;

            System.out.printf("%-25s → %-10s | Time: %-10s | Space: %-10s | %d ns%n",
                    strategy.name(),
                    formatOutput(result),
                    strategy.timeComplexity(),
                    strategy.spaceComplexity(),
                    elapsed);
        }
    }

    // Subclasses define these
    protected abstract String problemName();
    protected abstract void validate(I input);
    protected abstract I copyInput(I input);       // needed for sort-based strategies
    protected abstract String formatInput(I input);
    protected abstract String formatOutput(O output);

    // Factory is called HERE — subclass just provides the prefix key
    protected List<AGProblemStrategy<I, O>> loadStrategies() {
        return AGProblemStrategyFactory.getAll(strategyKey());
    }

    protected abstract String strategyKey(); // e.g. "finddup", "twosum"
}
