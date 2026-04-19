package com.abhishek.algogrid.strategies.arrays.RotateArray;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.RotateArrayInput;

import java.util.Deque;
import java.util.LinkedList;

public class RotateArrayBruteForce implements AGProblemStrategy<RotateArrayInput, int[]> {
    @Override
    public int[] solve(RotateArrayInput input) {
        int N = input.arr().length;
        int d = input.d();
        int[] arr = input.arr();
        Deque<Integer> aux = new LinkedList<>();
        if (d > N) {
            d = d % N;
        }
        for (int i = 0; i < d; i++) {
            aux.offerLast(arr[i]);
        }
        for (int i = N; i > d; i--) {
            aux.offerFirst(arr[i - 1]);
        }
        for (int i = 0; i < N; i++) {
            arr[i] = aux.peekFirst() == null ? 0 : aux.pollFirst();
        }
        return arr;
    }

    @Override
    public String name() {
        return "Brute Force";
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
