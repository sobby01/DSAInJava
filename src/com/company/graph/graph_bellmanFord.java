package com.company.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

//This algorithm can work both on directed and undirected graph
//THis algorithm will fail in negative edge cases
//TC : O(EV)
public class graph_bellmanFord {
    public int IsNegativeWeightCycle(int n, int[][] edges, int e){
        int [] distance = new int[n]; //n is vertex

        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[0] = 0;

        for(int count =1; count < n; count++){
            for(int j = 0; j < e; j++){
                int src = edges[j][0];
                int dest = edges[j][1];
                int wt = edges[j][2];

                if(distance[src] != Integer.MAX_VALUE && distance[src] + wt < distance[dest]){
                    distance[dest] = distance[src] + wt;
                }
            }
        }

        for(int j = 0; j < e; j++){
            int src = edges[j][0];
            int dest = edges[j][1];
            int wt = edges[j][2];

            if(distance[src] != Integer.MAX_VALUE && distance[src] + wt < distance[dest]){
                return 1;
            }
        }
        return 0;
    }
}
