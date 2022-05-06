package com.company;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Random;

public class KthLargestElement {

    public void findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(nums.length);

        for (int i = 0; i < nums.length; ++i) {
            minHeap.add(nums[i]);

            if (i >= k) {
                minHeap.poll();
            }
        }
        int topElement = minHeap.peek();

        System.out.println(topElement);
    }

}
