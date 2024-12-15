package com.company.intervals;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayInteger {

    class myComparator implements Comparator<Object> {
        public int compare(Object a, Object b) {

            Integer x = (Integer) a;
            Integer y = (Integer) b;

            System.out.println(x);
            System.out.println(y);
            int val = x - y;
            String sf2 = String.format("value is %d", val);
            System.out.println(sf2);
            return val;
        }
    }

        public void eraseOverlapIntervals(Object[] intervals) {
            if (intervals.length == 0) {
                return;
            }
            Arrays.sort(intervals, new ArrayInteger.myComparator());
         }
    }
