package com.company;
import com.company.Tree.BuildTree;
import com.company.Tree.PrintNodesAtK;
import com.company.Tree.TreeNode;
import com.company.collections.HashSets;
import com.company.collections.LinkedLists;
import com.company.graph.graph_dfs;
import com.company.graph.graph_representation;
import com.company.graph.graph_representation_weighted;
import com.company.intervals.ArrayInteger;
import com.company.intervals.overlappingintervals;

public class Main {

    public static void main(String[] args) {
        GenerateParenthesis gp = new GenerateParenthesis();
        gp.genParenthesis(3);

        KClosestElement kce = new KClosestElement();
        kce.findClosestElements(new int[]{1,2,3,4,5}, 4,3);
        ArrayInteger ai = new ArrayInteger();
        ai.eraseOverlapIntervals(new Object[]{4,1,5,6,2});

        int [][] twodarray = new int[5][2];
        twodarray[0][0] = 1;
        twodarray[0][1] = 2;

        twodarray[1][0] = 2;
        twodarray[1][1] = 5;

        twodarray[2][0] = 1;
        twodarray[2][1] = 4;

        twodarray[3][0] = 2;
        twodarray[3][1] = 3;

        twodarray[4][0] = 3;
        twodarray[4][1] = 6;


        overlappingintervals ointerval = new overlappingintervals();
        ointerval.eraseOverlapIntervals(twodarray);

        BuildTree rootNode = new BuildTree();
        TreeNode root = rootNode.Build();
        PrintNodesAtK printNodes = new PrintNodesAtK();
        printNodes.distanceK(root, root.left, 2);



	    // write your code here
        HashSets hs = new HashSets();
        hs.Action();

        LinkedLists ll1 = new LinkedLists();
        ll1.Action();

        graph_dfs gdfs = new graph_dfs();
        gdfs.Build(7);

        PriorityQueueMaxHeap pqmh = new PriorityQueueMaxHeap();
        pqmh.TestMax();

        KthLargestElement klarge = new KthLargestElement();
        klarge.findKthLargest(new int[] {3,2,1,5,6,4}, 2);

        int[] bs3Array = new int[]{3,3,5,0,0,3,1,4};
        DP_BuySell3 bs3 = new DP_BuySell3();
        bs3.maxProfit(bs3Array);

        graph_representation gr = new graph_representation();
        gr.AdjList();

        graph_representation_weighted grw = new graph_representation_weighted();
        grw.Initialize();

        int[] seats = new int[]{0,0,1,0,0,0,1};

        PossibleSeats ps1 = new PossibleSeats();
        ps1.Solve(2, 7,seats);
        DecodeWays dw = new DecodeWays();
        dw.Solve("226", 0);

        square_sort ss = new square_sort();
        ss.sortedSquares(new int[]{-4,-1,0,3,10});


        slidingwindow_firstnegativeinteger fni = new slidingwindow_firstnegativeinteger();
        fni.firstNegativeInteger(new int[]{12,-1,-7,8,-15,30, 16,28}, 3);

        SlidingMaxWindow smw = new SlidingMaxWindow();
        smw.maxSlidingWindow(new int[]{1,3,1,2,0,5}, 3);





        SingleNumber3 sNumber = new SingleNumber3();
        var daTA = sNumber.singleNumber(new int[]{5,1,2,3,1,5,4});


        PriorityQueueMinHeap pqmh1 = new PriorityQueueMinHeap();
        pqmh1.TestMin();









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
