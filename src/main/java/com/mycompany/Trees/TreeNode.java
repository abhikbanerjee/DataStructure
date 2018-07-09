/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Trees;

/**
 *
 * @author abhikbanerjee
 */
public class TreeNode<T> {
  public T item;
  public TreeNode lchild;
  public TreeNode rchild;
  TreeNode(){
    item = null;
    lchild = null;
    rchild = null;
  }
  TreeNode(T k){
    item = k;
    lchild = null;
    rchild = null;
  }

}
