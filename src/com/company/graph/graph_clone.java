package com.company.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class graph_clone {



    public graphNode cloneGraph_DFS(graphNode node) {
        HashMap<graphNode, graphNode> visitedNodes =  new HashMap <> ();
        if (node == null) {
            return node;
        }

        if(visitedNodes.containsKey(node))
            return visitedNodes.get(node);

        graphNode cloneNode = new graphNode(node.val, new ArrayList<>());
        visitedNodes.put(node, cloneNode);

        for (graphNode neighbour : node.neighbors) {
            cloneNode.neighbors.add(cloneGraph_DFS(neighbour));
        }

        return cloneNode;
    }

    public graphNode cloneGraph_BFS(graphNode node) {
        HashMap<graphNode, graphNode> visitedNodes =  new HashMap <> ();
        Queue<graphNode> q = new LinkedList<>();
        q.add(node);

        graphNode cloneNode = new graphNode(node.val, new ArrayList<>());
        visitedNodes.put(node, cloneNode);

        while(!q.isEmpty()){
            graphNode current = q.poll();
            graphNode cNode =  visitedNodes.get(current);
            for (graphNode n :current.neighbors) {
                if(!visitedNodes.containsKey(n)){
                    q.add(n);
                    graphNode cloneNodeG = new graphNode(n.val, new ArrayList<>());
                    visitedNodes.put(n, cloneNodeG);
                }
                visitedNodes.get(current).neighbors.add(visitedNodes.get(n));
            }
        }

        return visitedNodes.get(node);

    }
}
