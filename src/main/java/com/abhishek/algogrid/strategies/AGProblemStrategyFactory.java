package com.abhishek.algogrid.strategies;

import com.abhishek.algogrid.problems.arrays.LeftRotateAnArrayByDPlaces.LeftRotateAnArrayByDPlaces;
import com.abhishek.algogrid.strategies.arrays.CheckIfArrayIsSorted.CheckIfArrayIsSortedBruteForce;
import com.abhishek.algogrid.strategies.arrays.CheckIfArrayIsSorted.CheckIfArrayIsSortedDivideAndConquer;
import com.abhishek.algogrid.strategies.arrays.LargestElementInAnArray.LargestElementInAnArrayBruteForce;
import com.abhishek.algogrid.strategies.arrays.LargestElementInAnArray.LargestElementInAnArrayUsingSorting;
import com.abhishek.algogrid.strategies.arrays.LeftRotateAnArrayByDPlaces.LeftRotateAnArrayByDPlacesUsingDeque;
import com.abhishek.algogrid.strategies.arrays.MoveZeroToEnd.MoveZerosToEndTwoPointerApproach;
import com.abhishek.algogrid.strategies.arrays.MoveZeroToEnd.MoveZerosToEndUsingDeque;
import com.abhishek.algogrid.strategies.arrays.RemoveDuplicateFromASortedArray.RemoveDuplicateFromASortedArrayBruteForce;
import com.abhishek.algogrid.strategies.arrays.RemoveDuplicateFromASortedArray.RemoveDuplicateFromASortedArrayLinearSearch;
import com.abhishek.algogrid.strategies.arrays.ReverseAnArray.ReverseAnArrayBruteForce;
import com.abhishek.algogrid.strategies.arrays.ReverseAnArray.ReverseAnArrayTwoPointer;
import com.abhishek.algogrid.strategies.arrays.SecondLargestElementInAnArray.SecondLargestInAnArrayLinearSearch;
import com.abhishek.algogrid.strategies.arrays.SecondLargestElementInAnArray.SecondLargestInAnArrayUsingSorting;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class AGProblemStrategyFactory {

    // Each problem registers its own strategies here
    private static final Map<String, Supplier<AGProblemStrategy<?, ?>>> registry = new HashMap<>();

    static {

        registry.put("problem.arrays.largestElementInAnArray.bruteforce", LargestElementInAnArrayBruteForce::new);
        registry.put("problem.arrays.largestElementInAnArray.usingSorting", LargestElementInAnArrayUsingSorting::new);
        registry.put("problem.arrays.secondLargestElementInAnArray.bruteforce", SecondLargestInAnArrayLinearSearch::new);
        registry.put("problem.arrays.secondLargestElementInAnArray.usingSorting", SecondLargestInAnArrayUsingSorting::new);
        registry.put("problem.arrays.checkIfTheArrayIsSorted.bruteforce", CheckIfArrayIsSortedBruteForce::new);
        registry.put("problem.arrays.checkIfTheArrayIsSorted.divideAndConquer", CheckIfArrayIsSortedDivideAndConquer::new);
        registry.put("problem.arrays.reverseAnArray.bruteforce", ReverseAnArrayBruteForce::new);
        registry.put("problem.arrays.reverseAnArray.twoPointer", ReverseAnArrayTwoPointer::new);
        registry.put("problem.arrays.removeDuplicateFromASortedArray.bruteForce", RemoveDuplicateFromASortedArrayBruteForce::new);
        registry.put("problem.arrays.removeDuplicateFromASortedArray.linearSearch", RemoveDuplicateFromASortedArrayLinearSearch::new);
        registry.put("problem.arrays.moveZerosToEnd.twoPointerApproach", MoveZerosToEndTwoPointerApproach::new);
        registry.put("problem.arrays.moveZerosToEnd.usingDeque", MoveZerosToEndUsingDeque::new);
        registry.put("problem.arrays.leftRotateAnArrayByDPlaces.usingDeque", LeftRotateAnArrayByDPlacesUsingDeque::new);
    }

    @SuppressWarnings("unchecked")
    public static <I, O> AGProblemStrategy<I, O> get(String key) {
        Supplier<AGProblemStrategy<?, ?>> supplier = registry.get(key.toLowerCase());
        if (supplier == null)
            throw new IllegalArgumentException("No strategy registered for: " + key);
        return (AGProblemStrategy<I, O>) supplier.get();
    }

    // Get ALL strategies for a problem (to run and compare all)
    @SuppressWarnings("unchecked")
    public static <I, O> List<AGProblemStrategy<I, O>> getAll(String problemPrefix) {
        return registry.entrySet().stream()
                .filter(e -> e.getKey().startsWith(problemPrefix + "."))
                .map(e -> (AGProblemStrategy<I, O>) e.getValue().get())
                .collect(Collectors.toList());
    }
}
