/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.DoublyLinkedList;

/**
 *
 * @author abhikbanerjee12
 */
public class DoublyListNode<T> {
  public T item;
  public DoublyListNode next;
  public DoublyListNode previous;
  public DoublyListNode(){
    item = null;
    next = null;
    previous = null;
  }
  public DoublyListNode(T i){
    item = i;
    next = null;
    previous = null;
  }
}
