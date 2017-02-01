package com.mycompany.Queues;
public interface MyQueue {
	public void enqueue(Object obj);
	public Object dequeue();
	public Object front();
	public int size(MyQueue s);
	public boolean isEmpty(MyQueue s);
	public void printQueue();
}
