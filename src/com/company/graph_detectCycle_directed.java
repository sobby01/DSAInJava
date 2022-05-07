package com.company;

import java.util.ArrayList;

public class graph_detectCycle_directed {

    public boolean IsCycle(ArrayList<ArrayList<Integer>> adj, int v){
        boolean isCycle = false;
        boolean visited[] = new boolean[v+1];
        boolean recStack[] = new boolean[v+1];
        for(int i =1; i <= v; i++){
            if(!visited[i]){
                DFS(adj, i, -1, visited, recStack);
            }
        }
        return isCycle;
    }

    private boolean DFS(ArrayList<ArrayList<Integer>> adj, int v, int parent, boolean visited[], boolean recsStack[]){
        visited[v] = true;
        recsStack[v] = true;

        for(int data : adj.get(v)){
            if(!visited[data]) {
                if(DFS(adj, data, v, visited, recsStack))
                    return true;
            }
            else{
                if(recsStack[data]){
                    return true;
                }
            }
        }

        recsStack[v] = false;
        return false;
    }
}
