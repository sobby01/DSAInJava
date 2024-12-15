package com.company.graph;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class graph_bipartite {

    public boolean checkBipartite_bfs(ArrayList<ArrayList<Integer>> adj, int n ){
        int color[] = new int[n];
        for(int i = 0; i < n; i++){
            color[i] = -1;
        }

        for(int i = 0;i <n; i++){

            if(color[i] == -1){
                //Call BFS
                if(!bfsCheck(color, adj, i)){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean bfsCheck(int color[], ArrayList<ArrayList<Integer>> adj, int node){
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        color[node] = 1;

        while(!q.isEmpty()){
            Integer n = q.poll();
            ArrayList<Integer> adjNodes = adj.get(n);

            for(Integer d : adjNodes){
                if(color[d] == -1){
                    color[d] = 1-color[n];
                    q.add(d);
                }
                else if(color[d] == color[n]){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkBipartite_dfs(ArrayList<ArrayList<Integer>> adj, int n){
        int color[] = new int[n];
        for(int i = 0; i < n; i++){
            color[i] = -1;
        }

        for(int i = 0;i <n; i++){

            if(color[i] == -1){
                //Call DFS
                if(!dfsCheck(color, adj, i)){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean dfsCheck(int color[], ArrayList<ArrayList<Integer>> adj, int node){
        color[node] = 1;
        ArrayList<Integer> adjNodes = adj.get(node);
        for(Integer d : adjNodes){
            if(color[d] == -1){
                color[d] = 1-color[node];
                if (!dfsCheck(color,adj, d))
                    return false;
            }
            else if(color[d] == color[node]){
                    return false;
                }
        }
        return true;
    }
}
