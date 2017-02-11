/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.DoublyLinkedList;

/**
 *
 * @author abhikbanerjee12
 */
public class MyDoublyLinkedList<T> {
	public DoublyListNode<T> start;
	public MyDoublyLinkedList(){
		start = null;
	}
	public MyDoublyLinkedList(T item){
		DoublyListNode<T> n = new DoublyListNode<T>(item);
		if(start==null){
			start = n;
		}
	}
	public void adNodeInList(T item){
		DoublyListNode<T> n = new DoublyListNode<T>(item);
		if(this.start==null){
			this.start = n;
		}
		else{
			DoublyListNode<T> p = this.start;
			while(p.next!=null)
			{
				p = p.next;
			}
			p.next = n;
			n.previous = p;
		}
	}
	public void adNodeAtFront(T item){
		DoublyListNode<T> n = new DoublyListNode<T>(item);
		if(this.start==null){
			this.start = n;
		}
		else{
			n.next = this.start;
			start.previous=n;
			this.start = n;
		}
	}
	public void printListUsingNext(){
		DoublyListNode<T> p = this.start;
		if(p==null){
			System.out.println("null");
			return;
		}
		System.out.print("Printing Using Next ");
		while(p.next!=null){
			System.out.print(p.item);
			System.out.print("-->");
			p = p.next;
		}
		System.out.print(p.item);
		System.out.println();
	}
	public void printListUsingPrev(){
		DoublyListNode<T> p = this.start;
		if(p==null){
			System.out.println("null");
			return;
		}
		while(p.next!=null){
			p = p.next;
		}
		System.out.print("Printing Using Prev ");
		while(p!=start){
			System.out.print(p.item);
			System.out.print("<--");
			p = p.previous;
			
		}
		System.out.print(p.item);
		System.out.println();
		
	}
	public void deleteNodeFromFront(){
		DoublyListNode p = this.start.next;
		p.previous = null;
		this.start = p;
	}
	public void deleteNodeFromLast(){
		DoublyListNode p = this.start;
		while(p.next.next!=null){
			p = p.next;
		}
		p.next=null;
	}
	public void deleteNodeFromPos(int pos){
		DoublyListNode p = this.start;
		if(pos==1){
			this.deleteNodeFromFront();
			return;
		}
		for(int i=1;i<pos-1;i++){
			if(p.next==null){
				System.out.println("Not enough nodes for position "+pos);
				return;
			}
			else{
				p = p.next;
			}
		}
		System.out.println("Node deleted at position "+pos+" is "+p.next.item);
		p.next = p.next.next;
		p.next.previous = p;
	}
}
