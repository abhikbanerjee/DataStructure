package com.mycompany.Graphs;

import com.mycompany.Queues.MyQueueImpl;

/**
 * Created by Abhik Banerjee
 * on 12/22/16.
 */
public class MyGraph
{
    public GraphNode[] nodes;

    public static void main(String args[])
    {
        MyGraph g = new MyGraph();
        g.createGraph();

            /**
            * Call for DFS from node 0;
            */
            g.depthFirstSearch(g.nodes[0]);

            /**
            * Call for BFS from node 0;
            */
            g.breadthFirstSearch(g.nodes[0]);

            /**
            * Ques 4.1 - Check if the path exists between start and end node
             */
//            boolean flag = g.pathExistsGraph(g.nodes[0], g.nodes[3]); // returns true

            boolean flag = g.pathExistsGraph(g.nodes[1], g.nodes[5]);
        if(flag)
            System.out.println("Path exists between "+g.nodes[0].item.toString()+" and "+g.nodes[3].item.toString());
        else
            System.out.println("Path does not exist between "+g.nodes[0].item.toString()+" and "+g.nodes[3].item.toString());


    }

    public void createGraph()
    {

        // Create a random graph with a few nodes and edges, such that BFS and DFS can be performed on the graph
        GraphNode node0 = new GraphNode(0);
        GraphNode node1 = new GraphNode(1);
        GraphNode node2 = new GraphNode(2);
        GraphNode node3 = new GraphNode(3);
        GraphNode node4 = new GraphNode(4);
        GraphNode node5 = new GraphNode(5);

        node0.children = new GraphNode[]{node1, node4, node5};
        node1.children = new GraphNode[]{node3, node4};
        node2.children = new GraphNode[]{node1};
        node3.children = new GraphNode[]{node2, node4};

        this.nodes = new GraphNode[]{node0, node1, node2, node3, node4, node5};

        System.out.println("Created a sample graph");

    }

    public void depthFirstSearch(GraphNode root) {
        if (root == null)
            return;
        System.out.println(root.item.toString());
        root.visited = true;
        if(root.children!=null)
        {
        for (GraphNode c : root.children) {
            if (c.visited == false) {
                depthFirstSearch(c);
                }
            }
        }
    }

    public void breadthFirstSearch(GraphNode root)
    {
        if(root ==null)
            return;
        MyQueueImpl q = new MyQueueImpl();
        q.enqueue(root);
        while(!q.isEmpty(q))
        {
            GraphNode g1 = (GraphNode)q.dequeue();
            System.out.println(g1.item.toString());
            if(g1.children!=null) {
                for (GraphNode c : g1.children) {
                    if (c.visited == false) {
                        c.visited = true;
                        q.enqueue(c);
                    }
                }
            }

        }
    }

    public Boolean pathExistsGraph(GraphNode start, GraphNode end)
    {
        Boolean pathFound = false;
        if(start==null|| end==null)
            return false;
        MyQueueImpl q = new MyQueueImpl();
        q.enqueue(start);
        while(!q.isEmpty(q))
        {
            GraphNode g = (GraphNode)q.dequeue();
            if(g==end)
            {
                return true;
            }
            if(g.children!=null)
            {
                for(GraphNode c: g.children)
                {
                    if(c.visited==false)
                    {
                        c.visited = true;
                        q.enqueue(c);
                    }
                }
            }
        }
        return pathFound;
    }
}
