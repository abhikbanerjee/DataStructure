/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.LinkedList;

/**
 *
 * @author abhikbanerjee12
 */
public class ListNode<T> {
  public T item;
  public ListNode next;
  public ListNode(){
    item = null;
    next = null;
  }
  public ListNode(T i){
    item = i;
    next = null;
  }
}
