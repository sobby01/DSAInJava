package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        graph_representation_weighted grw = new graph_representation_weighted();
        grw.Initialize();

        graph_representation gr = new graph_representation();
        gr.AdjList();

        SingleNumber3 sNumber = new SingleNumber3();
        var daTA = sNumber.singleNumber(new int[]{5,1,2,3,1,5,4});


        PriorityQueueMinHeap pqmh1 = new PriorityQueueMinHeap();
        pqmh1.TestMin();

        PriorityQueueMaxHeap pqmh = new PriorityQueueMaxHeap();
        pqmh.TestMax();



        KthLargestElement klarge = new KthLargestElement();
        klarge.findKthLargest(new int[] {3,2,1,5,6,4}, 2);



        GenerateParenthesis cp = new GenerateParenthesis();
        cp.generateParenthesis(3);

        PermutatioonWithCaseChange pcs = new PermutatioonWithCaseChange();
        pcs.Permutations("ABC", 0, "");

        PermutationSpace ps = new PermutationSpace();
        ps.Permutations("ABC", 0, "");

        KthGrammar kgram = new KthGrammar();
        kgram.kthGrammar1(2,2);

longestSubString lss = new longestSubString();
lss.lengthOfLongestSubstring("saurabhsinsgh");


    }
}
