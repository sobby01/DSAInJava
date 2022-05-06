package com.company;

import java.util.ArrayList;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair>{

    public int v;
    public int wt;

    Pair(int v, int wt){
        this.v = v;
        this.wt = wt;
    }
    @Override
    public int compareTo(Pair t){

        return this.wt - t.wt;
    }
}

public class MST_Prism {

    public int MST(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj){
        boolean[] visited = new boolean[v];

        PriorityQueue<Pair> pq = new PriorityQueue<Pair>();

        pq.add((new Pair(0,0)));

        int ans = 0;

        while(pq.size() != 0){
            Pair current = pq.remove();
            int vertex = current.v;

            if(visited[vertex]){
                continue;
            }
            var nbh = adj.get(vertex);
            for(var items : nbh){
                int v1 = items.get(0);
                int wt = items.get(1);
                if(visited[vertex]){
                    continue;
                }
                else{
                    pq.add((new Pair(v1,wt)));
                }
            }
        }
        return ans;
    }
}
