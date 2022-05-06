package com.company;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<int[]>((a,b) -> b[0] - a[0]);;

        for( int i = 0; i < points.length; i++){

            int dist = points[i][0] * points[i][0] + points[i][1] * points[i][1];

            int[] entry = new int[]{dist, i};

            if(maxHeap.size() < k)
                maxHeap.add(entry);
            else if(entry[0] < maxHeap.peek()[0]){
                maxHeap.poll();
                maxHeap.add(entry);
            }
        }

        int[][] answer = new int[k][2];
        for (int i = 0; i < k; i++) {
            int entryIndex = maxHeap.poll()[1];
            answer[i] = points[entryIndex];
        }
        return answer;

    }

}
