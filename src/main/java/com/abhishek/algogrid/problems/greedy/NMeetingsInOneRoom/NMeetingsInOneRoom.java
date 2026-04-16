package com.abhishek.algogrid.problems.greedy.NMeetingsInOneRoom;

import com.abhishek.algogrid.problems.AGProblemTemplate;
import com.abhishek.algogrid.input.NMeetingsInOneRoomInput;

public class NMeetingsInOneRoom extends AGProblemTemplate<NMeetingsInOneRoomInput, Integer> {
    @Override
    protected String problemName() {
        return "N Meetings in One Room";
    }

    @Override
    protected void validate(NMeetingsInOneRoomInput input) {
    }

    @Override
    protected NMeetingsInOneRoomInput copyInput(NMeetingsInOneRoomInput input) {
        return input;
    }

    @Override
    protected String formatInput(NMeetingsInOneRoomInput input) {
        return input.toString();
    }

    @Override
    protected String formatOutput(Integer output) {
        return String.valueOf(output);
    }

    @Override
    protected String strategyKey() {
        return "problem.greedy.nMeetingsInOneRoom";
    }
}
