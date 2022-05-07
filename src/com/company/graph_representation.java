package com.company;

import java.util.ArrayList;

public class graph_representation {
    int n = 3, m = 3;
    int adj[][] = new int[n+1][m+1];
    ArrayList<ArrayList<Integer> > adjList = new ArrayList<ArrayList<Integer>>();

    public void AdjMatrix(){
        //edge 1->2
        adj[1][2] = 1;
        adj[2][1] = 1;

        //edge 2->3
        adj[2][3] = 1;
        adj[3][2] = 1;

        //edge 1->3
        adj[1][3] = 1;
        adj[3][1] = 1;
    }

    public void AdjList(){
        for (int i = 0; i <= n; i++)
            adjList.add(new ArrayList<Integer>());

        //edge 1->2
        adjList.get(1).add(2);
        adjList.get(2).add(1);

        //edge 2->3
        adjList.get(2).add(3);
        adjList.get(3).add(2);

        //edge 1->3
        adjList.get(1).add(3);
        adjList.get(3).add(1);

        //vertex is 1,2,3 : every vertex will have the arraylist of edges.
        //edges are  : 1->2, 2->3, 1 ->3
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.out.print(adjList.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

    public ArrayList<ArrayList<Integer>> getAdjList(){
        for (int i = 0; i <= n; i++)
            adjList.add(new ArrayList<Integer>());

        //edge 1->2
        adjList.get(1).add(2);
        adjList.get(2).add(1);

        //edge 2->3
        adjList.get(2).add(4);
        adjList.get(4).add(2);

        //edge 2->3
        adjList.get(2).add(7);
        adjList.get(7).add(2);

        //edge 1->3
        adjList.get(4).add(6);
        adjList.get(6).add(4);

        //edge 1->3
        adjList.get(7).add(6);
        adjList.get(6).add(7);

        //edge 1->3
        adjList.get(3).add(5);
        adjList.get(5).add(3);

        return adjList;
    }
}
