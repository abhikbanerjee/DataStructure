package com.mycompany.Queues;

import com.mycompany.LinkedList.ListNode;
import com.mycompany.LinkedList.MyLinkedList;

public class MyQueueImpl implements MyQueue{
	private MyLinkedList l;
	public MyQueueImpl(){
		l = new MyLinkedList();
	}
	public static void main(String args[]){
		MyQueueImpl stack = new MyQueueImpl();
		stack.enqueue(2);
		stack.printQueue();
		stack.enqueue(5);
		stack.printQueue();
		stack.dequeue();
		stack.printQueue();
		stack.enqueue(8);
		stack.printQueue();
		stack.enqueue(6);
		stack.printQueue();
		System.out.println("Top Element is "+stack.front());
		stack.enqueue(11);
		stack.printQueue();
		stack.enqueue(16);
		stack.printQueue();
		System.out.println("Top Element is "+stack.front());		
		stack.printQueue();
		stack.dequeue();
		stack.printQueue();
		stack.dequeue();
		stack.printQueue();
		stack.dequeue();
		stack.printQueue();
		System.out.println("Stack size : "+stack.size(stack));
		System.out.println("Top Element is "+stack.front());
		stack.printQueue();
		stack.dequeue();
		stack.printQueue();
		stack.dequeue();
		System.out.println(stack.isEmpty(stack));
		stack.printQueue();
		stack.dequeue();
	}
	public int size(MyQueue s) {
		ListNode p = this.l.start;
		int count = 0;
		while(p!=null){
			count++;
			p = p.next;
		}
		return count;
	}
	public boolean isEmpty(MyQueue s) {
		if(this.l.start==null){
			return true;
		}
		else{
			return false;
		}
	}
	public void printQueue(){
		this.l.printList();
	}
	public void enqueue(Object item) {
        // As per this implementation the last node is the front of the queue and first node is the rear of the queue.
		ListNode n = new ListNode(item);
		if(this.l.start==null){
			this.l.start = n;
		}
		else{
			n.next= this.l.start;
			this.l.start = n;
		}
	}
	public Object dequeue() {
        // As per this implementation the last node is the front of the queue and first node is the rear of the queue.
		Object itemToDeq = null;
		if(this.l.start==null){
			new QueueUnderflowException("No elements in the queue");
		}
		else{
			ListNode p = this.l.start;
			if(p.next==null){
				itemToDeq = p.item;
				this.l.start = null;
			}
			else{
				while(p.next.next!=null){
					p = p.next;
				}
				itemToDeq = p.next.item;
				p.next=null;
			}
			return itemToDeq;
		}
		return null;
	}
	public Object front() {
        // As per this implementation the last node is the front of the queue.
        ListNode p = this.l.start;
        while(p.next!=null)
        {
            p = p.next;
        }
		return (Object) p.item;
	}

}
