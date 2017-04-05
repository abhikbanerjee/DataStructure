package com.mycompany.LinkedList;

import com.mycompany.Queues.MyQueueImpl;

/**
 * Created by Abhik Banerjee
 * on 4/4/17.
 */

public class FlattenLinkedList
{
    public static void main(String args[])
    {
        //Create a linked list with some child nodes and next nodes.
        FlattenLinkedList fl = new FlattenLinkedList();
        ListNodeNew start = fl.createList();

        // call the flatten Linked List function to print the list after flattening the list
        fl.flattenPrintList(start);
    }

    public ListNodeNew createList()
    {
        ListNodeNew start = new ListNodeNew(1);
        ListNodeNew new1 = new ListNodeNew(3);
        ListNodeNew new2 = new ListNodeNew(6);
        ListNodeNew new3 = new ListNodeNew(5);
        ListNodeNew new4 = new ListNodeNew(8);
        ListNodeNew new5 = new ListNodeNew(4);
        ListNodeNew new6 = new ListNodeNew(11);
        ListNodeNew new7 = new ListNodeNew(14);
        ListNodeNew new8 = new ListNodeNew(2);
        ListNodeNew new9 = new ListNodeNew(12);

        //Create the links between each of the nodes

        /*
        Looks something like this

        1 -> 3 -> 5 -> 4 -> 2
             |         |
             6 -> 8    11 -> 12
                       |
                       14
         */

        ListNodeNew p1 = start;
        p1.next = new1;
        new1.next = new3;
        new3.next = new5;
        new5.next = new8;
        new2.next = new4;
        new6.next = new9;

        new1.child = new2;
        new5.child = new6;
        new6.child = new7;

        return start;
    }

    public void flattenPrintList(ListNodeNew start)
    {
        if(start==null)
        {
            return;
        }

        ListNodeNew p1 = start;
        MyQueueImpl queueL = new MyQueueImpl();
        queueL.enqueue(p1);
        while(!queueL.isEmpty(queueL));
        {
            p1 = (ListNodeNew) queueL.dequeue();
            while(p1!=null)
            {
                System.out.print(p1.item + " -> ");
                if(p1.child!=null)
                {
                    queueL.enqueue(p1.child);
                }
                p1 = p1.next;
            }
        }

    }

}
