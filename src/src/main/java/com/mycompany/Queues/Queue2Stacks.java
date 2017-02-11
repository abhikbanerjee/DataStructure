package com.mycompany.Queues;
import java.util.*;

/**
 * Created by Abhik Banerjee on 12/21/16.
 */
public class Queue2Stacks
{
    Stack<Integer> oldStack;
    Stack<Integer> newStack;

    public Queue2Stacks()
    {
        oldStack = new Stack<Integer>();
        newStack = new Stack<Integer>();
    }

    public int size()
    {
        return (oldStack.size()+newStack.size());
    }

    public void push(Integer item)
    {
        this.oldStack.push(item);
    }

    public Integer pop()
    {
        rebalanceStacks();
        return newStack.pop();
    }

    public Integer peek()
    {
        rebalanceStacks();
        if(!newStack.isEmpty())
            return newStack.peek();
        else {
            System.out.println("Stack Underflow Exception !!! ");
            return null;
        }
    }

    public void rebalanceStacks()
    {
        if(newStack.isEmpty() && !oldStack.isEmpty())
        {
            while(!oldStack.isEmpty())
                this.newStack.push(this.oldStack.pop());
        }
    }

    public static void main(String args[])
    {
        Queue2Stacks qs = new Queue2Stacks();
        qs.push(7);
        qs.push(4);
        qs.push(12);

        System.out.println("Top Element - " + qs.peek());

        System.out.println("Popped Element - " +qs.pop());
        qs.push(11);
        qs.push(19);
        System.out.println("Top Element - "+ qs.peek());
        System.out.println("Popped Element - " +qs.pop());
        System.out.println("Popped Element - " +qs.pop());
        System.out.println("Popped Element - " +qs.pop());
        System.out.println("Popped Element - " +qs.pop());

        System.out.println("Top Element - "+ qs.peek());
    }

}

