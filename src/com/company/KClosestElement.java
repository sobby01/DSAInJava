package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class XPair{
    Integer key;
    Integer value;

    XPair(Integer k, Integer v){
        this.key = k;
        this.value = v;
    }
}

public class KClosestElement {

    static class maxHeapComparator implements Comparator<XPair> {
        @Override
        public int compare (XPair x, XPair y) {
            int z = y.key-x.key; //y -> 100- x ->20 = 80 ?// 1, 0, -1

            if(z == 0){
                return y.value - x.value;
            }
            return z;
        }
    }

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<XPair> pq = new PriorityQueue<XPair>(arr.length, new maxHeapComparator());
        List<Integer> returnList = new ArrayList<Integer>();
        for(Integer elem : arr){
            pq.add(new XPair(Math.abs(elem-x), elem));

            if(pq.size() > k){
                pq.poll();
            }
        }

        for(int i = 0; i < k; i++){
            returnList.add(pq.poll().value);
        }

        return returnList;
    }
}
