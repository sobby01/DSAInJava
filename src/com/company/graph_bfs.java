package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class graph_bfs {

    public ArrayList<Integer> bfsTraversal(int V, ArrayList<ArrayList<Integer>> obj){
        boolean vis[] = new boolean[V+1];
        ArrayList<Integer> bfs = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i =1; i<=V; i++){ //loop through every vertex
            if(vis[i] == false){
                q = new LinkedList<>();
                q.add(i);
                vis[i] = true;

                while(q.size() != 0){
                    Integer val = q.poll();
                    bfs.add(val);

                    for(var data : obj.get(val)){
                        if(vis[data] == false) {
                            vis[data] = true;
                            q.add(data);
                        }
                    }
                }
            }
        }
        return bfs;
    }
}
