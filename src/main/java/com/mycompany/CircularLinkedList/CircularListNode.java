/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.CircularLinkedList;

/**
 *
 * @author abhikbanerjee12
 */
public class CircularListNode<T> {
  public T item;
  public CircularListNode next;
  public CircularListNode previous;
  public CircularListNode(){
    item = null;
    next = null;
  }
  public CircularListNode(T i){
    item = i;
    next = null;
  }
}
