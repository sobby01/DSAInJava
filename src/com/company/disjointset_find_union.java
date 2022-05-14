package com.company;

public class disjointset_find_union {

    int[] parent;

    public void Initialize(int v){
        for(int i = 0; i < v; i++){
            parent[i] = i;
        }
    }

    public int find(int x){
        if(parent[x] == x)
            return x;

        return find(parent[x]);
    }

    public void union(int x, int y){
        int x_rep = find(x);
        int y_rep = find(y);

        if(x_rep == y_rep)
            return;
        parent[y_rep] = x_rep;
    }
}
