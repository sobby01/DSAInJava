package com.company.intervals;

import java.util.Arrays;
import java.util.Comparator;

public class overlappingintervals {
    class myComparator implements Comparator<int[]> {
        public int compare(int[] a, int[] b) {
            System.out.println(a[1]);
            System.out.println(b[1]);
            int val = a[1] - b[1];
            String sf2=String.format("value is %d",val);
            System.out.println(sf2);
            return val;
        }
    }

    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, new myComparator());
        int end = intervals[0][1];
        int count = 1;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= end) {
                end = intervals[i][1];
                count++;
            }
        }
        return intervals.length - count;
    }
}
