package com.abhishek.algogrid.strategies.arrays.ArrayLeaders;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;

import java.util.ArrayList;

public class ArrayLeadersBruteForce implements AGProblemStrategy<int[], int[]> {
    @Override
    public int[] solve(int[] arr) {
        ArrayList<Integer> result=new ArrayList<>();
        int N=arr.length;
        for(int i=0;i<N;i++){
            boolean isGreater=true;
            for(int j=i+1;j<N;j++){
                if(arr[i]<arr[j]){
                    isGreater=false;
                    break;
                }

            }
            if(isGreater){
                result.add(arr[i]);
            }
        }
        return result.stream().mapToInt(x->x).toArray();
    }

    @Override
    public String name() {
        return "Brute Force";
    }

    @Override
    public String timeComplexity() {
        return TimeComplexity.THETA_OF_N_SQUARE;
    }

    @Override
    public String spaceComplexity() {
        return SpaceComplexity.THETA_N;
    }
}
