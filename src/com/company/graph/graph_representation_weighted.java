package com.company.graph;

class Edge{
    int src;
    int dest;
    int weight;
}

class Graph{
    int noOfvertex;
    int noOfedge;

    Edge edge[];
}

public class graph_representation_weighted {

public Graph CreateGraph(int v, int e){
    Graph graph = new Graph();
    graph.noOfedge = e;
    graph.noOfvertex = v;
    graph.edge = new Edge[e];

    for(int i = 0; i < graph.noOfedge; i++){
        graph.edge[i] = new Edge();
    }

    return graph;
}

public void Initialize(){

    Graph graph = CreateGraph(5, 8);

    // add edge 0-1 (or A-B in above figure)
    graph.edge[0].src = 0;
    graph.edge[0].dest = 1;
    graph.edge[0].weight = -1;

    // add edge 0-2 (or A-C in above figure)
    graph.edge[1].src = 0;
    graph.edge[1].dest = 2;
    graph.edge[1].weight = 4;

    // add edge 1-2 (or B-C in above figure)
    graph.edge[2].src = 1;
    graph.edge[2].dest = 2;
    graph.edge[2].weight = 3;

    // add edge 1-3 (or B-D in above figure)
    graph.edge[3].src = 1;
    graph.edge[3].dest = 3;
    graph.edge[3].weight = 2;

    // add edge 1-4 (or A-E in above figure)
    graph.edge[4].src = 1;
    graph.edge[4].dest = 4;
    graph.edge[4].weight = 2;

    // add edge 3-2 (or D-C in above figure)
    graph.edge[5].src = 3;
    graph.edge[5].dest = 2;
    graph.edge[5].weight = 5;

    // add edge 3-1 (or D-B in above figure)
    graph.edge[6].src = 3;
    graph.edge[6].dest = 1;
    graph.edge[6].weight = 1;

    // add edge 4-3 (or E-D in above figure)
    graph.edge[7].src = 4;
    graph.edge[7].dest = 3;
    graph.edge[7].weight = -3;
}

public void Initialize_Matrix(){
    int vertex = 5, edge = 8;
    int[][] matrix = new int[vertex][edge];

    matrix[0][0] = 0;
    matrix[0][1] = -1;
    matrix[0][2] = 6;
    matrix[0][3] = 3;
    matrix[0][4] = -1;

    matrix[1][0] = 3;
    matrix[1][1] = 3;
    matrix[1][2] = 0;
    matrix[1][3] = -1;
    matrix[1][4] = -1;
}
}
