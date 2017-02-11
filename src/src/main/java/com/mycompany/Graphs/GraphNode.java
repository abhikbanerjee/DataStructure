package com.mycompany.Graphs;

/**
 * Created by Abhik Banerjee on 12/22/16.
 */
public class GraphNode<T>
{
    T item;
    Boolean visited;
    GraphNode[] children;

    public GraphNode(T item)
    {
        this.item = item;
        this.visited = false;
        this.children = null;
    }
}
