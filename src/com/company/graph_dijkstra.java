package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class graph_dijkstra {
    public int[] MST(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj){
        boolean [] visited = new boolean[v+1];
        int source = 0;
        int[] answer = new int[v+1];
        Arrays.fill(answer, 1000000);
        answer[source] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<Node>();
        pq.add(new Node(source,0));
        while(pq.size() != 0){
            Node currentNode = pq.poll();
            int u = currentNode.vertex;

            if(visited[u]){
                continue;
            }
            visited[u] = true;

            ArrayList<ArrayList<Integer>> adjNhbr = adj.get(u);

            for(ArrayList<Integer> nhbr : adjNhbr){
                int ver = nhbr.get(0);
                int wgt = nhbr.get(1);

                if(answer[ver] > answer[u] + wgt)
                {
                    answer[ver] = answer[u] + wgt;
                    pq.add(new Node(ver, answer[ver]));
                }
            }
        }
        return answer;
    }
}
