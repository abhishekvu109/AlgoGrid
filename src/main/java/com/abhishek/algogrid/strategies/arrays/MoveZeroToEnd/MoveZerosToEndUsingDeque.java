package com.abhishek.algogrid.strategies.arrays.MoveZeroToEnd;

import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;

import java.util.Deque;
import java.util.LinkedList;

public class MoveZerosToEndUsingDeque implements AGProblemStrategy<int[],int[]> {
    @Override
    public int[] solve(int[] input) {
        Deque<Integer> deque=new LinkedList<>();
        int N=input.length;
        for(int i=0;i<N;i++){
            if(input[i]==0){
                deque.offerLast(input[i]);
            }else {
                deque.offerFirst(input[i]);
            }
        }
        for(int i=0;i<N;i++){
            input[i]=deque.pollFirst();
        }
        return input;
    }

    @Override
    public String name() {
        return "Two pointer approach.";
    }

    @Override
    public String timeComplexity() {
        return TimeComplexity.THETA_N;
    }

    @Override
    public String spaceComplexity() {
        return null;
    }
}
