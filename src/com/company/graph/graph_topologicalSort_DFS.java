package com.company.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class graph_topologicalSort_DFS {

    public int[] TopologicalSort(ArrayList<ArrayList<Integer>> adj, int v){

        boolean[] visited = new boolean[v];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i <v; i++){

            if(!visited[i]){
                findTopological(adj, st, visited, i);
            }
        }

        int topo[] = new int[v];
        int ind = 0;
        while(!st.isEmpty()) {
            topo[ind++] = st.pop();
        }
        return topo;
    }

    private void findTopological(ArrayList<ArrayList<Integer>> adj, Stack<Integer> st , boolean[] visited, int n){
        visited[n] = true;
        ArrayList<Integer> nodes = adj.get(n);
        for(Integer cur : nodes){
            if(!visited[cur]){
                findTopological(adj, st, visited, cur);
            }
        }
        st.push(n);

    }
}
