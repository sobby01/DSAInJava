package com.company;

public class DecodeWays {
    public int Solve(String s, int indexer){
        if(indexer  == s.length()-1)
            return 1;

        if(indexer >= s.length())
            return 0;

        if(s.charAt(indexer) == 0)
            return 0;

        int ans = Solve(s, indexer+1); //1
        //indexer: 0
        if(indexer +1 < s.length()){
            String s12 = s.substring(indexer, indexer+2);

            int s1 = Integer.valueOf(s12);

            if(s1 <= 26){
                //This is also a valid solution
                ans += Solve(s, indexer+1);//26
            }
        }


        return ans;
    }
}
