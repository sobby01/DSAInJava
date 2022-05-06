package com.company;

import java.util.*;

public class PriorityQueueMaxHeap {

    //INNER CLASS
    static class maxHeapComparator implements Comparator<Integer> {
        @Override
        public int compare (Integer x, Integer y) {
            return y-x; //y -> 100- x ->20 = 80 ?// 1, 0, -1
        }
    }

    public void TestMax(){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(10, Collections.reverseOrder());

        for(int i=1; i<=10; ++i){
            int data = new Random().nextInt(100) +1;


            System.out.print(data);
            System.out.print(" ");
            maxHeap.add(data);
        }

        System.out.print("\nMAX Heap : ");
        Iterator<Integer> iter = maxHeap.iterator();
        while(iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }
}
