package com.company;

import java.util.ArrayList;
import java.util.PriorityQueue;

class Node implements Comparable<Node>{
    int vertex;
    int weight;

    Node(int v, int wt){
        this.vertex = v;
        this.weight = wt;
    }

    @Override
    public int compareTo(Node o) {
        return this.weight - o.weight;
    }
}

public class graph_prims {

    public int MST(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj){
        boolean [] visited = new boolean[v+1];
        PriorityQueue<Node> pq = new PriorityQueue<Node>();
        pq.add(new Node(0,0));
        int ans = 0;

        while(pq.size() != 0){

            Node currentNode = pq.poll();
            int u = currentNode.vertex;

            if(visited[u]){
               continue;
            }
            ans += currentNode.weight;
            visited[u] = true;

            ArrayList<ArrayList<Integer>> adjNhbr = adj.get(u);

            for(ArrayList<Integer> nhbr : adjNhbr){
                int ver = nhbr.get(0);
                int wgt = nhbr.get(1);

                if(!visited[ver])
                    pq.add(new Node(ver, wgt));
            }
        }

        return ans;
    }
}
