/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.DoublyLinkedList;

import java.util.HashSet;

/**
 *
 * @author abhikbanerjee12
 */
public class MyDoublyListImpl<T> {
	public static void main(String args[]){
		//Create a String List
		MyDoublyLinkedList<String> l = new MyDoublyLinkedList<String>("Abhik");
		l.adNodeInList("Surbhi");
		l.printListUsingNext();
		l.printListUsingPrev();
		l.adNodeAtFront("Shekhar");
		l.printListUsingNext();
		l.printListUsingPrev();
		l.adNodeInList("Akash");
		l.printListUsingNext();
		l.printListUsingPrev();
		l.adNodeAtFront("Divya");
		l.printListUsingNext();
		l.printListUsingPrev();
		l.adNodeInList("Shivangi");
		l.printListUsingNext();
		l.printListUsingPrev();
		l.deleteNodeFromFront();
		l.printListUsingNext();
		l.printListUsingPrev();
		l.deleteNodeFromLast();
		l.printListUsingNext();
		l.printListUsingPrev();
		l.deleteNodeFromPos(6);
		l.deleteNodeFromPos(1);
		l.printListUsingNext();
		l.printListUsingPrev();
		l.adNodeInList("Archana");
		l.printListUsingNext();
		l.printListUsingPrev();
		l.adNodeInList("Asit");
		l.printListUsingNext();
		l.printListUsingPrev();
		l.adNodeInList("Suman");
		l.printListUsingNext();
		l.printListUsingPrev();
		l.adNodeInList("Deepak");
		l.printListUsingNext();
		l.printListUsingPrev();
		l.deleteNodeFromPos(4);
		l.printListUsingNext();
		l.printListUsingPrev();
		
		//		//MyLinkedList<Integer> l1 = new MyLinkedList<Integer>(2);
		//Create a Integr List
//		MyLinkedList<Integer> l1 = new MyLinkedList<Integer>();
//		l1.adNodeInList(6);
//		l1.adNodeInList(8);
//		l1.adNodeInList(9);
//		l1.adNodeInList(11);
//		l1.adNodeInList(14);
//		l1.adNodeInList(17);
//		l1.printListUsingNext();
//		l1.printListUsingPrev();
		//Check by Adding Nodes in front
//		MyLinkedList<Integer> l2 = new MyLinkedList<Integer>();
//		l2.adNodeAtFront(6);
//		l2.adNodeAtFront(8);
//		l2.adNodeAtFront(9);
//		l2.adNodeAtFront(11);
//		l2.adNodeAtFront(14);
//		l2.adNodeAtFront(17);
//		l2.printListUsingNext();
//		l2.printListUsingPrev();
	}
}
