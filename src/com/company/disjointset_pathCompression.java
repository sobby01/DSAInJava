package com.company;

public class disjointset_pathCompression {
    int[] parent;
    int[] rank;

    public void Initialize(int v){
        for(int i = 0; i < v; i++){
            parent[i] = i;
            rank[i] = 0;
        }
    }

    public int find(int x){
        if(parent[x] == x)
            return x;
        parent[x] = find(parent[x]);
        return parent[x];
    }

    public void union(int x, int y){
        int x_rep = find(x);
        int y_rep = find(y);

        if(x_rep == y_rep)
            return;

        if(rank[x_rep] > rank[y_rep]){
            parent[y_rep] = x_rep;
        }
        else if(rank[y_rep] > rank[x_rep]){
            parent[x_rep] = y_rep;
        }
        else{
            parent[y_rep] = x_rep;
            rank[x_rep] ++;
        }
    }
}
