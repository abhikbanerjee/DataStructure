/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.CircularLinkedList;

/**
 *
 * @author abhikbanerjee12
 */
public class MyCircularLinkedList<T> {
	public CircularListNode<T> start;
	public MyCircularLinkedList(){
		start = null;
	}
	public MyCircularLinkedList(T item){
		CircularListNode<T> n = new CircularListNode<T>(item);
		if(start==null){
			start = n;
			start.next=start;
		}
	}
	public void adNodeInList(T item){
		CircularListNode<T> n = new CircularListNode<T>(item);
		if(this.start==null){
			this.start = n;
			start.next = start;
		}
		else{
			CircularListNode<T> p = this.start;
			while(p.next!=start)
			{
				p = p.next;
			}
			p.next = n;
			n.next= start;
		}
	}
	public void adNodeAtFront(T item){
		CircularListNode<T> n = new CircularListNode<T>(item);
		if(this.start==null){
			this.start = n;
			start.next = start;
		}
		else{
			CircularListNode<T> p = this.start;
			while(p.next!=start)
			{
				p = p.next;
			}
			p.next = n;
			n.next= start;
			start = n;
		}
	}
	public void printListUsingNext(){
		CircularListNode<T> p = this.start;
		if(p==null){
			System.out.println("null");
			return;
		}
		System.out.print("Printing Circular Linked List ");
		while(p.next!=start){
			System.out.print(p.item);
			System.out.print("-->");
			p = p.next;
		}
		System.out.print(p.item);
		System.out.println();
	}
	public void deleteFirstNode(){
		CircularListNode p = this.start;
		while(p.next!=start){
			p = p.next;
		}
		p.next= start.next;
		start = p.next;
	}
}
