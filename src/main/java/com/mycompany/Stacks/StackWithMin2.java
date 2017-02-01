package com.mycompany.Stacks;
import java.util.*;

/**
 * Created by Abhik Banerjee on 12/20/16.
 */
public class StackWithMin2 extends Stack<Integer>
{
    Stack<Integer> s2;
    public  StackWithMin2()
    {
        s2 = new Stack<Integer>();
    }
    public void push(int item)
    {
        if(item < min())
        {
            s2.push(item);
        }
        super.push(item);
    }

    public Integer pop()
    {
        int item = super.pop();
        if(item == s2.peek())
        {
            s2.pop();
        }
        return item;
    }

    public int min()
    {
        if(this.isEmpty())
        {
            return Integer.MAX_VALUE;
        }
        else
        {
            return this.peek();
        }
    }

    public static void main(String args[])
    {
        StackWithMin2 ml = new StackWithMin2();
        ml.push(5);
        ml.push(6);
        ml.push(3);
        ml.push(7);
        System.out.println("Min Value " + ml.s2.peek());
        System.out.println("Popped Value " + ml.pop());
        System.out.println("Min Value " + ml.s2.peek());
        System.out.println("Popped Value " + ml.pop());
        System.out.println("Min Value " + ml.s2.peek());

    }

}
