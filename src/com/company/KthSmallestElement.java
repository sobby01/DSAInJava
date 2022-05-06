package com.company;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {

    public void findKthSmallest(int[] nums, int k) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(nums.length, Collections.reverseOrder());

        for (int i = 0; i < nums.length; ++i) {
            maxHeap.add(nums[i]);

            if (i >= k) {
                maxHeap.poll();
            }
        }
        int topElement = maxHeap.peek();

        System.out.println(topElement);
    }
}
