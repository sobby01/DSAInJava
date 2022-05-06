package com.company;

public class longestSubString {

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int startWindow = 0;
        int endWindow = 0;

        int[] charArray = new int[256];

        while(endWindow < s.length()){

            char element = s.charAt(endWindow);
            charArray[element]++;

            while(charArray[element] > 1){
                char elementFromLeft = s.charAt(startWindow);
                charArray[elementFromLeft]--;
                startWindow++;
            }

            max = Math.max(max, endWindow-startWindow+1);

            endWindow++;

        }

        return max;
    }
}
