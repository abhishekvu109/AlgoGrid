package com.abhishek.algogrid.strategies.greedy.NMeetingsInOneRoom;

import com.abhishek.algogrid.constants.SpaceComplexity;
import com.abhishek.algogrid.constants.TimeComplexity;
import com.abhishek.algogrid.strategies.AGProblemStrategy;
import com.abhishek.algogrid.input.NMeetingsInOneRoomInput;

public class NMeetingsInOneRoomGreedy implements AGProblemStrategy<NMeetingsInOneRoomInput, Integer> {
    @Override
    public Integer solve(NMeetingsInOneRoomInput input) {
        throw new UnsupportedOperationException("TODO: Implement NMeetingsInOneRoom - Greedy");
    }

    @Override
    public String name() {
        return "Greedy";
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
