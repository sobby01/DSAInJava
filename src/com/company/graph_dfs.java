package com.company;

import java.util.ArrayList;

public class graph_dfs {
    Boolean visited [];
    public ArrayList<Integer> dfsGraph(int vertex, ArrayList<ArrayList<Integer>> adj){
        visited = new Boolean[vertex+1];
        ArrayList<Integer> output = new ArrayList<>();
        for(int i = 1; i <=vertex; i++){
            if(!visited[i]){
                DFS(adj, output, i);
            }
        }
        return output;
    }

    private void DFS(ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> output, int v){
        output.add(v);
        visited[v] = true;

        for(int elem : adj.get(v)){
            if(!visited[elem]){
                DFS(adj, output, elem);
            }
        }
    }
}
