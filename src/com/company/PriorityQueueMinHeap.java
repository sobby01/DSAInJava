package com.company;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueMinHeap {

    public void TestMin(){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(10);

        minHeap.add(4);
        minHeap.add(1);
        minHeap.add(10);
        minHeap.add(6);
        minHeap.add(2);
        minHeap.add(7);
        minHeap.add(11);
        //minHeap.

        /*for(int i=1; i<=10; ++i){
            int data = new Random().nextInt(100) +1;
            minHeap.add(data);
        }*/

        System.out.print("\nMIN Heap : ");
        System.out.print(minHeap.poll() + " ");

        System.out.print(minHeap.poll() + " ");

        System.out.print(minHeap.poll() + " ");

        System.out.print(minHeap.poll() + " ");

        System.out.print(minHeap.poll() + " ");

        System.out.print(minHeap.poll() + " ");

        System.out.print(minHeap.poll() + " ");
        ///Iterator<Integer> iter = minHeap.iterator();
        //while(iter.hasNext()){

            //System.out.print(iter.next() + " ");
        //}
    }
}
