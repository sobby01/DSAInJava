package com.company;

public class KthGrammar {

    public int kthGrammar1(int n, int k) {

        if(n == 0 && k == 0)
            return 0;


        int mid =  (int)Math.pow(2, n-1)/2;
        System.out.println(mid);

        if(k <= mid){
            return kthGrammar1(n-1,k);
        }
        else{
            return kthGrammar1(n-1,k-mid) == 0 ? 1 : 0;
        }
    }
}
