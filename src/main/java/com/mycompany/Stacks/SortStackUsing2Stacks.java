package com.mycompany.Stacks;
import java.util.*;


/**
 * Created by tkmacl9 on 12/21/16.
 */
public class SortStackUsing2Stacks
{
    Stack<Integer> stk1;
    Stack<Integer> stk2;

    public SortStackUsing2Stacks()
    {
        stk1 = new Stack<Integer>();
        stk2 = new Stack<Integer>();
    }

    public static void main(String args[])
    {
        SortStackUsing2Stacks sortstk = new SortStackUsing2Stacks();
        sortstk.stk1.push(8);
        sortstk.stk1.push(5);
        sortstk.stk1.push(6);
        sortstk.stk1.push(1);
        sortstk.stk1.push(11);
        sortstk.stk1.push(9);
        sortstk.stk1.push(2);

        sortstk.stk2.push(19);
        sortstk.stk2.push(14);
        sortstk.stk2.push(18);

        Stack<Integer> sortedStack = sortstk.sortedStacks();
    }

    public Stack<Integer> sortedStacks()
    {
        //clean the stack2 before starting the operation of Stack 1
        while(!stk2.isEmpty())
        {
            this.stk1.push(this.stk2.pop());
        }

        // Now the sorting algorithm begins, where we pop one by one element from stack1 and push them in right position in stack 2
        while(!stk1.isEmpty())
        {
            Integer tmp = stk1.pop();
            while(stk2.size()!=0 && stk2.peek()<tmp)
            {
                stk1.push(stk2.pop());
            }
            stk2.push(tmp);
        }

        return stk2;
    }



}
