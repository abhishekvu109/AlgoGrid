package com.abhishek.algogrid.strategies.arrays.ReverseArrayInGroups;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.ReverseArrayInGroupsInput;

public class ReverseArrayInGroupsBruteForce implements AGProblemStrategy<ReverseArrayInGroupsInput, int[]> {
    @Override
    public int[] solve(ReverseArrayInGroupsInput input) {
        int[] arr = input.arr();
        int k = input.k();
        int left = 0;
        int right = 0;
        int N = arr.length;
        while (right < N) {
            int shift = 0;
            while (shift < k && right < N) {
                right++;
                shift++;
            }
            reverse(arr, left, right);
            left = right;
        }
        return arr;
    }

    private void reverse(int arr[], int left, int right) {
        right--;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
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
