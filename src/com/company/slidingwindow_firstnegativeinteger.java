package com.company;

import java.util.ArrayDeque;

public class slidingwindow_firstnegativeinteger {

    ArrayDeque<Integer> dq = new ArrayDeque<>();

    private void updateDQ(int i, int k, int[] nums)
    {
        int current = i-k;
        if(!dq.isEmpty() && current == dq.getFirst()){
            dq.removeFirst();
        }
    }

    // 12,-1,-7,8,-15,30,16
    public int[] firstNegativeInteger(int[] nums, int k){

        int firstNegative = 0;

        for(int i = 0; i < k; i++){
            updateDQ(i,k,nums);
            if(nums[i] < 0){
                dq.addLast(i);
            }
        }
        int i = 0;
        int[] output = new int[nums.length - k +1];
        if(!dq.isEmpty())
            output[i++] = nums[dq.getFirst()];
        else
            output[i++] = 0;

        for(int j = k; j < nums.length; j++){
            updateDQ(j,k,nums);
            if(nums[j] < 0){
                dq.addLast(j);
            }

            if(!dq.isEmpty())
                output[i++] = nums[dq.getFirst()];
            else
                output[i++] = 0;

        }

        return output;
    }

}
