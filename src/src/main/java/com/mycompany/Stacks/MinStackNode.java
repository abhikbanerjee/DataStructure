package com.mycompany.Stacks;

/**
 * Created by Abhik Banerjee on 12/20/16.
 */
public class MinStackNode {
    int item;
    int min;
    MinStackNode next;

    public MinStackNode(int item, int min)
    {
        this.item = item;
        this.min = min;
    }
}
