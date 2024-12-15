package com.company.graph;
import java.util.ArrayList;

class NodePair{
    int vertex;
    int parent;
    NodePair(int v, int parent){
        this.vertex = v;
        this.parent = parent;
    }
}

public class graph_detectCycle {

    public boolean IsCycle(ArrayList<ArrayList<Integer>> adj, int v){
        boolean isCycle = false;
        boolean visited[] = new boolean[v+1];
        for(int i =1; i <= v; i++){
            if(!visited[i]){
                DFS(adj, i, -1, visited);
            }
        }
        return isCycle;
    }

    private boolean DFS(ArrayList<ArrayList<Integer>> adj, int v, int parent, boolean visited[] ){
        visited[v] = true;

        for(int data : adj.get(v)){
            if(!visited[data]) {
                if(DFS(adj, data, v, visited))
                    return true;
            }
            else{
                if(parent != data){
                    return true;
                }
            }
        }
        return false;
    }
}
