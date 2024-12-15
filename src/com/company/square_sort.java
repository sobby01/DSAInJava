package com.company;

public class square_sort {

    public int[] sortedSquares(int[] nums) {
        int[] output = new int[nums.length];

        if(nums.length == 1){
            output[0] = nums[0] * nums[0];
            return output;
        }

        int leftPos = 0;
        int rightPos = nums.length-1;


        int i = nums.length-1;
        //0 <= 4
        while(leftPos <= rightPos){
            //4 > 10 ?
            if(Math.abs(nums[leftPos]) > Math.abs(nums[rightPos]))
            {
                output[i--] = nums[rightPos] * nums[rightPos];
                rightPos--; //100
            }
            else
            {
                output[i--] = nums[leftPos] * nums[leftPos];
                leftPos++;
            }
        }

        return output;
    }
}
