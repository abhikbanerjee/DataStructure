/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Trees;

import java.util.List;

/**
 *
 * @author abhikbanerjee
 */

public interface MyTree {
  public int size();
  public boolean isEmpty(TreeNode n);
  public List<String> elements();
  public boolean isRoot(TreeNode n);
  public boolean isInternal(TreeNode n);
  public boolean isExternal(TreeNode n);
  public TreeNode parent(TreeNode n);
  public List<TreeNode> children(TreeNode n);
}
