package com.mycompany.Stacks;
import java.util.*;

/**
 * Created by Abhik Banerjee on 12/20/16.
 */
public class MinStackImpl extends Stack<MinStackNode>{
    public static void main(String args[])
    {
        MinStackImpl ml = new MinStackImpl();
        ml.push(5);
        ml.push(6);
        ml.push(3);
        ml.push(7);
        MinStackNode n = ml.pop();
        System.out.println("Popped Value " + n.item);
        System.out.println("Min Value " + n.min);
        MinStackNode n2 = ml.pop();
        System.out.println("Popped Value " + n2.item);
        System.out.println("Min Value " + n2.min);
        MinStackNode n3 = ml.pop();
        System.out.println("Popped Value " + n3.item);
        System.out.println("Min Value " + n3.min);


    }
    public void push(int item)
    {
        int minval = Math.min(item,min());
        super.push(new MinStackNode(item,minval));
    }

    public int min()
    {
        if(this.isEmpty())
        {
            return Integer.MAX_VALUE;
        }
        else
        {
            return this.peek().min;
        }
    }

}
