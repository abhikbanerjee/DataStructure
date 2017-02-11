package com.mycompany.Stacks;

import com.mycompany.LinkedList.ListNode;
import com.mycompany.LinkedList.MyLinkedList;

public class MyStackImpl implements MyStack{
	private MyLinkedList l;
	public MyStackImpl(){
		l = new MyLinkedList();
	}
	public static void main(String args[]){
		MyStackImpl stack = new MyStackImpl();
		stack.push(2);
		stack.printStack();
		stack.push(5);
		stack.printStack();
		stack.pop();
		stack.printStack();
		stack.push(8);
		stack.printStack();
		stack.push(6);
		stack.printStack();
		System.out.println("Top Element is "+stack.topElement());
		stack.push(11);
		stack.printStack();
		stack.push(16);
		stack.printStack();
		System.out.println("Top Element is "+stack.topElement());		
		stack.printStack();
		stack.pop();
		stack.printStack();
		stack.pop();
		stack.printStack();
		stack.pop();
		stack.printStack();
		System.out.println("Stack size : "+stack.size(stack));
		System.out.println("Top Element is "+stack.topElement());
		stack.printStack();
		stack.pop();
		stack.printStack();
		stack.pop();
		System.out.println(stack.isEmpty(stack));
		stack.printStack();
		stack.pop();
	}
	public int pop() {
		int item = 0;
		try{
			if(this.l.start==null){
				throw new StackUnderflowException("No more Elements");
			}
			else{
                item = Integer.parseInt(this.l.start.item.toString());
				this.l.start= this.l.start.next;
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		return item;
	}
	public int topElement() {
		int item = (Integer) this.l.start.item;
		return item;
	}
	public int size(MyStack s) {
		ListNode p = this.l.start;
		int count = 0;
		while(p!=null){
			count++;
			p = p.next;
		}
		return count;
	}
	public boolean isEmpty(MyStack s) {
		if(this.l.start==null){
			return true;
		}
		else{
			return false;
		}
	}
	public void push(int item) {
		this.l.adNodeAtFront(item);
	}
	public void printStack(){
		this.l.printList();
	}

}
