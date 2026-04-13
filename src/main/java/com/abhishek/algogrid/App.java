package com.abhishek.algogrid;

import com.abhishek.algogrid.input.LeftRotateAnArrayByDPlacesInput;
import com.abhishek.algogrid.problems.arrays.LeftRotateAnArrayByDPlaces.LeftRotateAnArrayByDPlaces;
import com.abhishek.algogrid.problems.arrays.MoveZeroToEnd.MoveZeroToEnd;
import com.abhishek.algogrid.problems.arrays.RemoveDuplicateFromASortedArray.RemoveDuplicateFromASortedArray;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        new LargestElementInAnArray().run(new Long[]{2l, 5l, 67l, 5l});

//        new SecondLargestElementInAnArray().run(new int[]{2, 5, 67, 7});

//        new CheckIfTheArrayIsSorted().run(new int[]{1,2,3,4,5,6});
//        new CheckIfTheArrayIsSorted().run(new int[]{6,5,4,3,2,1});
//        new CheckIfTheArrayIsSorted().run(new int[]{10,20,60,80,100});
//        new CheckIfTheArrayIsSorted().run(new int[]{10,5,30,40,50,90});
//        new CheckIfTheArrayIsSorted().run(new int[]{10,50,60,90,500,90});

//        new ReverseAnArray().run(new int[]{1, 2, 3, 4, 5});
//        new ReverseAnArray().run(new int[]{1, 2, 3, 4, 5, 6});


//        new RemoveDuplicateFromASortedArray().run(new int[]{1, 2, 2, 2, 3, 4, 5, 5, 7, 8, 9, 9});
//        new RemoveDuplicateFromASortedArray().run(new int[]{9, 9, 8, 7, 6, 6, 5, 5, 5, 5, 4, 3, 2, 1, 1, 1, 0});

//        new MoveZeroToEnd().run(new int[]{3,2,4,5,6,0,0,0,2,3,1,0,3,4});
//        new MoveZeroToEnd().run(new int[]{1,1,1,1,10,0,0,0,0,0});

        new LeftRotateAnArrayByDPlaces().run(new LeftRotateAnArrayByDPlacesInput(new int[]{1,2,3,4,5,6},3));
        new LeftRotateAnArrayByDPlaces().run(new LeftRotateAnArrayByDPlacesInput(new int[]{1,2,3,4,5,6},1));
        new LeftRotateAnArrayByDPlaces().run(new LeftRotateAnArrayByDPlacesInput(new int[]{1,2,3,4,5,6,7},2));
    }
}
