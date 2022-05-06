package com.company;

import java.util.Stack;

public class SortRecursion {

    public void Sort(int[] arr, int index){

        Stack<Integer> st = new Stack<Integer>();


        if(arr.length == 1)
            return;

        int temp = arr[index];
        arr[index] = -1;

        Sort(arr, index-1);
    }

    void Insert(int[] arr, int temp){

    }

}
