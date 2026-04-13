package com.abhishek.algogrid.strategies.arrays.LeftRotateAnArrayByDPlaces;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.input.LeftRotateAnArrayByDPlacesInput;
import com.abhishek.algogrid.strategies.AGProblemStrategy;

import java.util.Deque;
import java.util.LinkedList;

public class LeftRotateAnArrayByDPlacesUsingDeque implements AGProblemStrategy<LeftRotateAnArrayByDPlacesInput, int[]> {
    @Override
    public int[] solve(LeftRotateAnArrayByDPlacesInput input) {
        int[] arr = input.input();
        int N = arr.length;
        int D = input.D();
        Deque<Integer> deque = new LinkedList<>();
        int d=N-D;
        for (int i = 0; i < d; i++) {
            deque.offerLast(arr[i]);
        }
        for (int i = N - 1; i >= d; i--) {
            deque.offerFirst(arr[i]);
        }
        for (int i = 0; i < N; i++) {
            arr[i] = deque.pollFirst();
        }
        return arr;
    }

    @Override
    public String name() {
        return "Using deque data structure.";
    }

    @Override
    public String timeComplexity() {
        return TimeComplexity.THETA_N;
    }

    @Override
    public String spaceComplexity() {
        return SpaceComplexity.THETA_N;
    }
}
