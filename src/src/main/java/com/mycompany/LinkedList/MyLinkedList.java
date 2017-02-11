/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.LinkedList;

/**
 *
 * @author abhikbanerjee12
 */
public class MyLinkedList<T> {
	public ListNode<T> start;
	//  public MyLinkedList(T arr[]){
	//    for(int i=0;i<arr.length;i++){
	//      ListNode n = new ListNode(arr[i]);
	//      if(start==null){
	//        start = n;
	//      }
	//      else{
	//        ListNode p = start;
	//        while(p.next!=null)
	//        {
	//          p = p.next;
	//        }
	//        p.next=n;
	//      }
	//    }
	//  }
	public MyLinkedList(){
		start = null;
	}
	public MyLinkedList(T item){
		ListNode<T> n = new ListNode<T>(item);
		if(start==null){
			start = n;
		}
	}
	public void adNodeInList(T item){
		ListNode<T> n = new ListNode<T>(item);
		if(this.start==null){
			this.start = n;
		}
		else{
			ListNode<T> p = this.start;
			while(p.next!=null)
			{
				p = p.next;
			}
			p.next = n;
		}
	}
	public void adNodeAtFront(T item){
		ListNode<T> n = new ListNode<T>(item);
		if(this.start==null){
			this.start = n;
		}
		else{
			n.next = this.start;
			this.start = n;
		}
	}
	public void printList(){
		ListNode<T> p = this.start;
		if(p==null){
			System.out.println("null");
			return;
		}
    int count = 1;
		while(p.next!=null && count < 20){
			System.out.print(p.item);
			System.out.print("-->");
			p = p.next;
      count++;
		}
		System.out.print(p.item);
		System.out.println();
	}
}
