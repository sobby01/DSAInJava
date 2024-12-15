package com.company.graph;

import java.util.Arrays;

class Edge_k implements Comparable<Edge_k>{
    int src;
    int dest;
    int wt;

    Edge_k(int s, int d, int w){
        this.src = s;
        this.dest = d;
        this.wt= w;
    }

    @Override
    public int compareTo(Edge_k o) {
        return this.wt - o.wt;
    }
}

public class graph_mst_kruskal {
    int[] parent;
    int[] rank;

    private int find(int x){
        if(parent[x] == x)
            return x;

        return find(x);
    }

    private void union(int x, int y){
        int rep_x = find(x);
        int rep_y = find(y);

        if(rep_x == rep_y)
            return;

        if(rank[rep_x] > rank[rep_y]){
            parent[rep_y] = rep_x;
        }
        else if(rank[rep_x] < rank[rep_y]){
            parent[rep_x] = rep_y;
        }
        else{
            parent[rep_y] = rep_x;
            rank[rep_x]++;
        }
    }

    public int Kruskal(Edge_k[] arr, int v){
        Arrays.sort(arr); //E*LogE
        parent = new int[v];
        rank = new int[v];

        for(int i = 0; i < v; i++){
            parent[i] = i;
            rank[i] = 0;
        }

        int result = 0;
        int s = 0;
        for(int i = 0; i< v-1; i++){ // index of next edge
            Edge_k edge = arr[i];

            int x = edge.src;
            int y = edge.dest;

            int x_rep = find(x);
            int y_rep = find(y);

            //if it matches then it means there is a cycle
            if(x_rep != y_rep){
                result += edge.wt;
                union(x_rep, y_rep);
                s++; // current size of MST
            }
        }

        return result;
    }

    public Edge_k[] Kruskal_Edges(Edge_k[] arr, int v){
        Arrays.sort(arr); //E*LogE
        parent = new int[v];
        rank = new int[v];
        int s = 0;
        Edge_k[] resultEdges = new Edge_k[v-1];
        for(int i = 0; i < v; i++){
            parent[i] = i;
            rank[i] = 0;
        }

        int result = 0;

        for(int i = 0; i< v-1; i++){ // index of next edge
            Edge_k edge = arr[i];

            int x = edge.src;
            int y = edge.dest;

            int x_rep = find(x);
            int y_rep = find(y);

            //if it matches then it means there is a cycle
            if(x_rep != y_rep){
                result += edge.wt;
                union(x_rep, y_rep);
                resultEdges[s] = edge;
                s++; // current size of MST
            }
        }

        return resultEdges;
    }


}
