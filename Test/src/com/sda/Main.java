package com.sda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> tests = new ArrayList<>();
        tests.add(8);
        tests.add(4);
        tests.add(5);
        tests.add(8);
        tests.add(4);

        getMaxSubsequenceSize(tests);
	// write your code here
    }

    public static int getMaxSubsequenceSize(List<Integer> tickets) {
        List<Integer> subsequence;
        int maxSubSequenceSize = 0;
        int ticketToEvaluate = 0;
        Collections.sort(tickets);
        for(int i = 0; i < tickets.size(); i++) {
            subsequence = new ArrayList<>();
            if(tickets.get(i) > ticketToEvaluate) {
                ticketToEvaluate = tickets.get(i);
            } else continue;
            for(int j = i; j < tickets.size(); j++) {
                if(Math.abs(ticketToEvaluate - tickets.get(j)) <= 1)
                    subsequence.add(tickets.get(j));
            }
            System.out.println(subsequence);
            if(maxSubSequenceSize < subsequence.size()) {
                maxSubSequenceSize = subsequence.size();
            }
        }
        return maxSubSequenceSize;
    }
}
