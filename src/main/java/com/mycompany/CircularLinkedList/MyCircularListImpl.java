/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.CircularLinkedList;

import java.util.HashSet;

/**
 *
 * @author abhikbanerjee12
 */
public class MyCircularListImpl<T> {
	public static void main(String args[]){
		//Create a String List
		MyCircularLinkedList<String> l = new MyCircularLinkedList<String>("Abhik");
		l.adNodeInList("Surbhi");
		l.printListUsingNext();
		l.adNodeAtFront("Shekhar");
		l.printListUsingNext();
		l.adNodeInList("Akash");
		l.printListUsingNext();
		l.adNodeAtFront("Divya");
		l.printListUsingNext();
		l.adNodeInList("Shivangi");
		l.printListUsingNext();
		l.deleteFirstNode();
		l.printListUsingNext();
		l.adNodeInList("Archana");
		l.printListUsingNext();
		l.adNodeInList("Asit");
		l.printListUsingNext();
		l.adNodeInList("Suman");
		l.printListUsingNext();
		l.adNodeInList("Deepak");
		l.printListUsingNext();
		l.deleteFirstNode();
		l.printListUsingNext();
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
