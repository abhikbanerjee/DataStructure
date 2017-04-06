/**
 *
 * @author Abhik Banerjee
 * This implements creating Trees from Arrays - Complete Binary Tree, Non Complete Binary Tree
 * Binary Search Tree from an Array, and also Binary Search Tree from a Sorted array
 * - using Binary Search method Recursion.
 * This also covers the code for Preorder, PostOrder InOrder
 * and Level Order Traversals.
 */

package com.mycompany.Trees;

import com.mycompany.Queues.*;
import java.util.*;

public class MyTreeImpl {
    public TreeNode root;
    public MyQueueImpl queue;
    Integer last_printed = null;
    public int index = 0;
    int arr1[] = new int[9];
  
  public MyTreeImpl(){
      queue = new MyQueueImpl();
  }
  
  public static void main(String args[]){
    
    //Create a tree to traverse the same in pre, post and in-order.
      Integer arr[] = {1,3,7,9,2,5,11,16,12};
      MyTreeImpl tree = new MyTreeImpl();

      /**
       * Create Non Complete Binary Tree
       */
//       tree.createTreeFromArray(false, arr);
//      System.out.println("Unbalanced Tree Created from Array");

      /**
       * create Binary Search Tree
       */
//      tree.createTreeFromArray(true, arr);
//      System.out.println("Binary Search Tree Created from Array");

      /**
       * Create Complete Binary Tree
       */
//      tree.createCompleteTreeFromArray(arr);
//      System.out.println("Complete Tree Created from Array");

      /**
       * Ques 4.2 - Create A Binary Search Tree with a already sorted Array
       */
      Integer[] sortedArr = {1,3,6,8,11,15,17,18,21};
//      Integer[] sortedArr = {1,3,6,11,15,17,18};
      tree.root = tree.createTreeFromSortedArr(0, sortedArr.length - 1, sortedArr);
      System.out.println("Binary Search Tree Created from a Sorted Array");

      /**
       * Call PreOrder, Inorder and PostOrder Traversals
       */
//        System.out.println();
//        System.out.println("Pre Order Traversal");
//        System.out.println();
//        tree.preorder(tree.root);
//        System.out.println();
//        System.out.println("In Order Traversal");
//        System.out.println();
//        tree.inorder(tree.root);
//        System.out.println();
//        System.out.println("Post Order Traversal");
//        System.out.println();
//        tree.postorder(tree.root);
//        System.out.println("**********************");

      /**
       * Call Level Order Traversal
       */
//      tree.LevelOrderTraversalTree(tree.root);

      /**
       * Ques 4.3 - Store Level Order numbers in different ArrayLists and Print them later
       */
        tree.printListOfLists(tree.LevelOrderTraversalTreeInArrayList(tree.root));
        System.out.println();

      /**
       * Find height of a tree in recursive fashion
       */
//      System.out.println("The Total Height of the Tree is  " + tree.findHeightTree(tree.root));

      /**
       * Ques 4.4 - Check if a tree is Balanced or not. - O(NlogN)
       */
//      boolean balanced = tree.isTreeBalanced(tree.root);

      /**
       * Ques 4.4 - Check if tree is balanced - Optimized way - O(N)
       */
//      boolean balanced = tree.checkTreeisBalancedOptimized(tree.root);
//      if(balanced == true)
//      {
//        System.out.println("The Tree is Balanced");
//      }
//      else
//      {
//          System.out.println("The Tree is not Balanced");
//      }


      /**
       * Ques 4.5 - Check if a Binary Tree is BST - recursive solution
       */

      //boolean isBTBST = tree.checkIfBTIsBST(tree.root); // Use the last_printed Integer value to find if a tree is BST

//      boolean isBTBST = tree.checkIfBTisBSTMinMaxApproach(tree.root, null, null); // Use the Min and Max approach to find if a tree is a BST

//      tree.checkIfBtIsBSTArrayApproach(tree.root, tree.arr1); // Use the Array In Order approach to find if a tree is a BST
//      boolean flag = true;
//      for(int i =1; i<tree.arr1.length;i++)
//      {
//          if(tree.arr1[i-1] > tree.arr1[i]){
//            System.out.println("The Binary Tree is not a Binary Search Tree");
//              flag = false;
//              break;
//          }
//      }
//      if(flag)
//      {
//          System.out.println("The Binary Tree is a Binary Search Tree");
//      }


//      if(isBTBST == true)
//      {
//          System.out.println("The Binary Tree is a Binary Search Tree");
//      }
//      else
//      {
//          System.out.println("The Binary Tree is not a Binary Search Tree");
//      }

      /**
       * Inverting the tree using recursive approach
       */

            //tree.invertTree(tree.root);
      /**
       * Ques 4.3 - Store Level Order numbers in different ArrayLists and Print them later
       */
      // tree.printListOfLists(tree.LevelOrderTraversalTreeInArrayList(tree.root));

      /**
       *  Print all the paths from a tree to the leaf node
       */

//      ArrayList<TreeNode> prev = new ArrayList<TreeNode>();
//      tree.printAllPathsOfTree(tree.root, prev);

      // This solution works
//      int path[] = new int[1000];
//      tree.printPathsRecur(tree.root, path,0);

      /**
       * Find the Deepest Node in the tree
       */
      //tree.findDeepestNodeInTree(tree.root);

      /**
       * Find the Kth Largest Element in BST
       */
//      int k=2;
//      System.out.println("The "+ k+"th element is - "+ tree.findKthElement(tree.root, 2, tree.arr1));

      /*
        Print All the paths which add up to the given sum
       */
//      int sum = 15; // try with 17 , 4
//      tree.printPathSums(tree.root, sum);

      /**
       * Find the Least Common Ancestor (LCA), Higesht common ancestor in a Binary Tree
       */
      TreeNode p = tree.root.lchild.lchild;
      TreeNode q = tree.root.lchild.rchild.rchild;
      TreeNode lca = tree.lowestCommonAdvisor(tree.root, p,q);
      System.out.println("LCA Node - "+ lca.item.toString());

  }

    public void createTreeFromArray(boolean binSearchTree, Integer[] arr)
    {
            // just create a binary tree
            for(Integer a: arr)
            {
                addNodeToTree(binSearchTree,a);
            }

   }

    public void createCompleteTreeFromArray(Integer[] arr)
    {
        for(Integer a: arr)
        {
            addNodeToCompleteTree(a);
        }
    }

    public void addNodeToTree(boolean binSearchTree , Integer item)
    {
        if(root==null)
        {
            root = new TreeNode(item);
            return;
        }
        TreeNode p = root;
        if(binSearchTree == true)
        {
            // Apart from the same logic below, we need to also check all nodes on left are less than a given node and all
            // nodes on right are greater than the given node.
            while(true)
            {
                if(item < Integer.parseInt(p.item.toString()))
                {
                    // goes to the left subtree
                    if(p.lchild==null)
                    {
                        p.lchild = new TreeNode(item);
                        break;
                    }
                    p = p.lchild;
                }
                else
                {
                    if(p.rchild==null)
                    {
                        p.rchild = new TreeNode(item);
                        break;
                    }
                    p = p.rchild;
                }
            }

        }
        else
        {
            while(true)
            {
                if(p.lchild==null)
                {
                    p.lchild = new TreeNode(item);
                    break;
                }
                else if(p.rchild==null)
                {
                    p.rchild = new TreeNode(item);
                    break;
                }
                else
                {
                    p = p.lchild;
                }
            }

        }
    }

    public void addNodeToCompleteTree(Integer item)
    {
        if(root == null)
        {
            root = new TreeNode(item);
            queue.enqueue(root);
            return;
        }
//        TreeNode p = root;
        while(!queue.isEmpty(queue))
        {
            TreeNode a = (TreeNode) queue.front();
            if(a.lchild == null)
            {
                TreeNode l = new TreeNode(item);
                a.lchild = l;
                queue.enqueue(l);
                return;
            }
            if(a.rchild == null)
            {
                TreeNode t = new TreeNode(item);
                a.rchild = t;
                queue.enqueue(t);
                return;
            }
            if(a.lchild!=null && a.rchild!=null)
            {
                queue.dequeue();
            }
        }

    }

    public void preorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.item + " -> ");
        preorder(root.lchild);
        preorder(root.rchild);
    }

    public void postorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        postorder(root.lchild);
        postorder(root.rchild);
        System.out.print(root.item + " -> ");
    }

    public void inorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.lchild);
        System.out.print(root.item + " -> ");
        inorder(root.rchild);
    }

    public TreeNode createTreeFromSortedArr(Integer low,Integer high,Integer[] arr)
    {
        if(low>high)
        {
            return null;
        }
        int mid = (low+high)/2;
        TreeNode p = new TreeNode(arr[mid]);
        p.lchild = createTreeFromSortedArr(low,mid-1,arr);
        p.rchild = createTreeFromSortedArr(mid+1,high,arr);
        return p;
    }

    public void LevelOrderTraversalTree(TreeNode root)
    {
        MyQueueImpl q = new MyQueueImpl();
        int levelnodes = 0;
        if(root == null)
        {
            return;
        }

        q.enqueue(root);
        while(!q.isEmpty(q))
        {
            levelnodes = q.size(q);
            while(levelnodes > 0)
            {
                TreeNode node = (TreeNode) q.dequeue();
                System.out.print(node.item.toString()+ " ");
                if(node.lchild!=null)
                    q.enqueue(node.lchild);
                if(node.rchild!=null)
                    q.enqueue(node.rchild);
                levelnodes--;

            }
            System.out.println();
        }

    }

    public ArrayList<ArrayList<String>> LevelOrderTraversalTreeInArrayList(TreeNode root)
    {
        MyQueueImpl q = new MyQueueImpl();
        ArrayList<ArrayList<String>> levelOrderLists = new ArrayList<ArrayList<String>>();
        int levelnodes = 0;
        // If root is null return null
        if(root == null)
        {
            return null;
        }

        q.enqueue(root);
        while(!q.isEmpty(q))
        {
            ArrayList<String> levelList = new ArrayList<String>();
            levelnodes = q.size(q);
            while(levelnodes > 0)
            {
                TreeNode node = (TreeNode) q.dequeue();
                levelList.add(node.item.toString());
                //System.out.print(node.item.toString()+ " ");
                if(node.lchild!=null)
                    q.enqueue(node.lchild);
                if(node.rchild!=null)
                    q.enqueue(node.rchild);
                levelnodes--;

            }
            System.out.println();
            levelOrderLists.add(levelList);
        }
        //System.out.println(levelOrderLists);
        return levelOrderLists;
    }

    public void printListOfLists(ArrayList<ArrayList<String>> listOfLists)
    {
        for(ArrayList<String> a : listOfLists)
        {
            for(String b : a)
            {
                System.out.print(b + " ");
            }
            System.out.println();

        }

    }

    public int findHeightTree(TreeNode root)
    {
        if(root==null)
            return 0;
        return 1+ Math.max(findHeightTree(root.lchild), findHeightTree(root.rchild));
    }

    public boolean isTreeBalanced(TreeNode root)
    {
        if(root==null)
            return true;
        int leftsubtreeheight = findHeightTree(root.lchild);
        int rightsubtreeheight = findHeightTree(root.rchild);
        int diff = Math.abs(leftsubtreeheight - rightsubtreeheight);
        if(diff > 1)
            return false;
        else {
            return (isTreeBalanced(root.lchild) && isTreeBalanced(root.rchild));
        }

    }

    public int checkHeightAndBalanced(TreeNode root)
    {
        if(root == null)
            return 0; //Empty tree with height 0

        //Check the height of the left subtree and return -1 if it is unbalanced
        int leftHeight = checkHeightAndBalanced(root.lchild);
        if(leftHeight == -1)
        {
            return -1; // Not Balanced
        }

        //Check the height of the right subtree and return -1 if it is unbalanced
        int rightHeight = checkHeightAndBalanced(root.rchild);
        if(rightHeight == -1)
        {
            return -1; // Not Balanced
        }

        //Check for the current node is balanced
        int diff = Math.abs(leftHeight - rightHeight);
        if(diff > 1)
        {
            return -1; // Unbalanced Tree -> return error code
        }
        else
        {
            return 1+ Math.max(leftHeight, rightHeight); // return the height of the tree at that node
        }

    }

    public Boolean checkTreeisBalancedOptimized(TreeNode root)
    {
        if(this.checkHeightAndBalanced(root)==-1)
            return false;
        else
            return true;
    }

    public Boolean checkIfBTIsBST(TreeNode root)
    {
        if(root == null)
            return true;
        // check recurse left
        if(!checkIfBTIsBST(root.lchild))
            return false;
        // check current
        Integer itm = Integer.parseInt(root.item.toString());
        if(last_printed!=null && itm <=last_printed)
            return false;
        last_printed = itm;

        // check recurse right
        if(!checkIfBTIsBST(root.rchild))
            return false;

        return true; // All the conditions satisfied and the tree is a BST
    }

    public Boolean checkIfBTisBSTMinMaxApproach(TreeNode root, Integer min, Integer max)
    {
        if(root == null)
            return true; // True if the tree is empty

        Integer itm = Integer.parseInt(root.item.toString());
        // If root node's data is less than min or Item is greater than Max at any point it is not a BST
        if((min!=null && itm <=min) || (max!=null && itm > max))
        {
            return false;
        }

        // Recurse through the left subtree and the right subtree such that the min and Max conditions hold. When we go to the
        // Left subtree the Max value for the left subtree should be the root, and for the right subtree the Min value should
        //be the root.
        if ((!checkIfBTisBSTMinMaxApproach(root.lchild,min, itm) || (!checkIfBTisBSTMinMaxApproach(root.rchild, itm, max))))
        {
            return false;
        }

        return true; // None of the conditions of min and max are violated hence the tree is a BST
    }

    public void checkIfBtIsBSTArrayApproach(TreeNode root, int arr[])
    {
        if(root == null)
            return;
        checkIfBtIsBSTArrayApproach(root.lchild,arr);
        arr[index] = Integer.parseInt(root.item.toString());
        index++;
        checkIfBtIsBSTArrayApproach(root.rchild, arr);
    }

    public TreeNode invertTree(TreeNode node)
    {
        // Stopping condition of the Recursion
        if(node==null)
        {
            return null;
        }

        // Swapping the values of left and right children of the tree
        TreeNode tmp = node.lchild;
        node.lchild = node.rchild;
        node.rchild = tmp;

        //Repeat the recursive process for the left child and right child of the tree
        if(node.lchild!=null)
        {
            invertTree(node.lchild);
        }

        if(node.rchild!=null)
        {
            invertTree(node.rchild);
        }

        return node;
    }

    public void printAllPathsOfTree(TreeNode node, ArrayList<TreeNode> prev)
    {
        if(node == null)
            return;

        prev.add(node);
        if(node.lchild==null && node.rchild==null)
        {
            // leaf node print the path so far
            for(TreeNode n: prev)
            {
                System.out.print(n.item + " -> ");
            }
            System.out.print(node.item);
            System.out.println();
        }
        else {
            printAllPathsOfTree(node.lchild, prev);
            printAllPathsOfTree(node.rchild, prev);
        }


    }

    void printPathsRecur(TreeNode node, int path[], int pathLen)
    {
        if (node == null)
            return;

        /* append this node to the path array */
//        System.out.println("Path len is -"+ pathLen);
        path[pathLen] = Integer.parseInt(node.item.toString());
        pathLen++;

        /* it's a leaf, so print the path that led to here */
        if (node.lchild == null && node.rchild == null)
            printArray(path, pathLen);
        else
        {
            /* otherwise try both subtrees */
            printPathsRecur(node.lchild, path, pathLen);
            printPathsRecur(node.rchild, path, pathLen);
        }
    }

    /* Utility that prints out an array on a line */
    void printArray(int ints[], int len)
    {
        int i;
        for (i = 0; i < len; i++)
            System.out.print(ints[i] + " ");
        System.out.println("");
    }

    public void findDeepestNodeInTree(TreeNode node)
    {
        if(node==null) {
            return;
        }

        TreeNode deepestNode = new TreeNode();
        MyQueueImpl queueLevel = new MyQueueImpl();
        queueLevel.enqueue(node);

        while(!queueLevel.isEmpty(queueLevel))
        {
            int levelSize = queueLevel.size(queueLevel);
            while(levelSize>0)
            {
                TreeNode tmp = (TreeNode)queueLevel.dequeue();
                System.out.print( tmp.item.toString() + " ");
                deepestNode = tmp;
                if(tmp.lchild!=null)
                {
                    queueLevel.enqueue(tmp.lchild);
                }
                if(tmp.rchild!=null)
                {
                    queueLevel.enqueue(tmp.rchild);
                }
                levelSize--;
            }
            System.out.println();
        }
        System.out.println("The Deepest Node is - "+ deepestNode.item.toString());

    }

    // Find the kth element of the array
    public Integer findKthElement(TreeNode node, Integer k, int[] arr)
    {
        // first get the ArrayList format for the inorder traversal
        checkIfBtIsBSTArrayApproach(node, arr);
        if(arr.length < k)
        {
            System.out.println("Less than K Elements");
            return -1;
        }
        return arr[arr.length-k];
    }

    // Find the kth largest element in BST without extra space
    public Integer findKthElementNoExtraSpace(TreeNode node)
    {
        if(node==null);
        {
            return index;
        }

    }

    /**
     * Find the paths having a particular sum - the pahs need not originate from root
     */

    public void printPathSums(TreeNode node, int Sum)
    {
        int depth = findHeightTree(node);
        Integer[] path = new Integer[depth];
        printPathsSum(node, path, 0, Sum);
    }

    public void printPathsSum(TreeNode node, Integer[] path, int pathlength, int Sum)
    {
        if(node ==null)
        {
            return;
        }

        path[pathlength] = Integer.parseInt(node.item.toString());

        // Check for any of the intermediate paths add up to the given sum or not
        int interSum = 0;
        for(int i=pathlength;i>=0;i--)
        {
            interSum += path[i];
            if(interSum==Sum)
            {
                printCurrentPath(path, i, pathlength);
            }
        }

        pathlength++;

        // Repeat the other paths fot the left and right subtree of the binary tree
        printPathsSum(node.lchild, path, pathlength, Sum);
        printPathsSum(node.rchild, path, pathlength, Sum);

    }

    public void printCurrentPath(Integer[] path, int start, int end)
    {
        for(int i= start; i<=end; i++)
        {
            System.out.print(path[i] + " ");
        }
        System.out.println();
    }

    /**
     *  Find the LCA of 2 given nodes
     */
    public boolean covers(TreeNode node, TreeNode p)
    {
        if(node==null) {
            return false;
        }

        // p and the node are same, means after recursive calls p is a part of the branches of the tree
        if(node ==p)
        {
            return true;
        }

        // keep searching the left and right subtrees untill we find p or else return false;
        return covers(node.lchild, p) || covers(node.rchild, p);
    }

    public TreeNode lowestCommonAdvisorHelper(TreeNode root, TreeNode p, TreeNode q)
    {
        // base condition to check if root is null
        if(root == null)
        {
            return null;
        }

        // if rot
        if(root==p || root==q)
        {
            return root;
        }

        boolean isPleftChild = covers(root.lchild, p);
        boolean isQleftChild = covers(root.lchild, q);

        // now we check of both the boolean values are dissimilar then they are on opposite end
        if(isPleftChild != isQleftChild)
        {
            return root;
        }

        // else both p and q belong to either the left subtree or right subtree , hence
        // we recurse on that side of the subtree
        TreeNode childNode = isPleftChild ? root.lchild : root.rchild;
        return lowestCommonAdvisorHelper(childNode, p, q);

    }

    public TreeNode lowestCommonAdvisor(TreeNode root, TreeNode p, TreeNode q)
    {
        // check if p and q are descendants of the root node
        if(!covers(root,p) || !covers(root,q))
        {
            return null;
        }

        // call the lowest Common Advisor method on the root, p and q nodes
        return lowestCommonAdvisorHelper(root, p, q);
    }

}

