package com.company.graph;

import java.util.ArrayList;

public class graph_dfs {
    Boolean visited [];

    static void addEdge(ArrayList<ArrayList<Integer> > adj,
                        int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public void Build(int V){
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >(V);
        for (int i = 1; i <= V; i++)
            adj.add(new ArrayList<Integer>());

        // Adding edges one by one.
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 3);
        addEdge(adj, 2, 7);
        addEdge(adj, 3, 5);
        addEdge(adj, 4, 6);

        dfsGraph(V, adj);
    }

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
