package com.mycompany.LinkedList;

import com.mycompany.Stacks.MyStack;
import com.mycompany.Stacks.MyStackImpl;

import java.util.HashSet;
import java.util.Stack;

/**
 *
 * @author Abhik Banerjee
 */
public class MyListImpl<T> {
  
  static Integer num = 3;
  
  public static void main(String args[])
  {
    //Create a String List
    //		MyLinkedList<String> l = new MyLinkedList<String>("Abhik");
    //		l.adNodeInList("Surbhi");
    //		l.adNodeInList("Shekhar");
    //		l.adNodeInList("Akash");
    //		l.adNodeInList("Divya");
    //		l.adNodeInList("Shivangi");
    //		l.printList();
    ////		//MyLinkedList<Integer> l1 = new MyLinkedList<Integer>(2);
    
    //		//Create a Integr List
    //		MyLinkedList<Integer> l1 = new MyLinkedList<Integer>();
    //		l1.adNodeInList(6);
    //		l1.adNodeInList(8);
    //		l1.adNodeInList(9);
    //		l1.adNodeInList(11);
    //		l1.adNodeInList(14);
    //		l1.adNodeInList(17);
    //		l1.printList();
    
    //		//Check by Adding Nodes in front
    //		MyLinkedList<Integer> l2 = new MyLinkedList<Integer>();
    //		l2.adNodeAtFront(6);
    //		l2.adNodeAtFront(8);
    //		l2.adNodeAtFront(9);
    //		l2.adNodeAtFront(11);
    //		l2.adNodeAtFront(14);
    //		l2.adNodeAtFront(17);
    //		l2.printList();
    
    /**
     * Remove Duplicates Nodes from a Linked List function
     */
//    		MyListImpl mylist = new MyListImpl();
//    		MyLinkedList<Integer> l3 = new MyLinkedList<Integer>();
//    		l3.adNodeAtFront(6);
//    		l3.adNodeAtFront(6);
//    		l3.adNodeAtFront(9);
//    		l3.adNodeAtFront(11);
//    		l3.adNodeAtFront(14);
//    		l3.adNodeAtFront(11);
//    		l3.adNodeAtFront(15);
//    		l3.adNodeAtFront(19);
//    		l3.adNodeAtFront(23);
//    		l3.adNodeAtFront(11);
//    		l3.adNodeAtFront(15);
//    		l3.adNodeAtFront(22);
//    		l3.printList();
//    		//mylist.removeDuplicates(l3);
//        mylist.removeDupsNoBuffer(l3);
//    		l3.printList();
      /**
       * Another Implementation of Removing Duplicates
       */
//    		MyListImpl mylist = new MyListImpl();
//    		MyLinkedList<Integer> l1 = new MyLinkedList<Integer>();
//            MyLinkedList<Integer> l2 = new MyLinkedList<Integer>();
//    		l1.adNodeInList(7);
//    		l1.adNodeInList(1);
//    		l1.adNodeInList(6);
//            l1.adNodeInList(3);
//
//    		l2.adNodeInList(5);
//    		l2.adNodeInList(9);
//    		l2.adNodeInList(8);
//
//            // Printing Lists before adding
//    		l1.printList();
//            l2.printList();
//    		//mylist.removeDuplicates(l3);
//
//      /**
//       * Add 2 Lists using a Carry - written backwards
//       */
//
//        mylist.addTwoListsRepresentedBackwards(l1, l2);
//    		l1.printList();
//            l2.printList();

//      mylist.addTwoListsRepresentedForward(l1, l2);

        
    /**
     * Check/Detect If a linked List has a loop, Find the Node from where the loop starts
     */
//        MyLinkedList<Integer> l3 = new MyLinkedList<Integer>();
//        l3.adNodeAtFront(6);
//        l3.adNodeAtFront(9);
//        l3.adNodeAtFront(11);
//        l3.adNodeAtFront(14);
//        l3.adNodeAtFront(15);
//        l3.adNodeAtFront(19);
//        l3.adNodeAtFront(23);
//        l3.adNodeAtFront(22);
//        l3.printList();
//        MyLinkedList newList = createLoop(l3,2);
//        newList.printList();
//        ListNode nod = findLoopNode(newList);
//        if(nod!=null){
//          System.out.println("Item " + nod.item.toString());
//        }
//        else{
//          System.out.println("No Loop present");
//        }
    
    /**
     * Find the Nth node from the end in a Linked List
     */
//    MyLinkedList<Integer> l3 = new MyLinkedList<Integer>();
//    l3.adNodeAtFront(6);
//    l3.adNodeAtFront(9);
//    l3.adNodeAtFront(11);
//    l3.adNodeAtFront(14);
//    l3.adNodeAtFront(15);
//    l3.adNodeAtFront(19);
//    l3.adNodeAtFront(23);
//    l3.adNodeAtFront(22);
//    l3.printList();
//    ListNode nod = findNthFromLast(l3,num);
//    if(nod!=null){
//      System.out.println("Item Nth - " + num + " From the end "+nod.item.toString());
//    }
//    else{
//      System.out.println("Number of nodes in Linked List is less than N:- "+num);
//    }
    /**
     * Find the Reverse of a Linked List
     */
//    MyListImpl mylist = new MyListImpl();
//    MyLinkedList<Integer> l3 = new MyLinkedList<Integer>();
//    l3.adNodeAtFront(6);
//    l3.adNodeAtFront(9);
//    l3.adNodeAtFront(11);
//    l3.adNodeAtFront(14);
//    l3.adNodeAtFront(15);
//    l3.adNodeAtFront(19);
//    l3.adNodeAtFront(23);
//    l3.adNodeAtFront(22);
//    l3.printList();
//    mylist.listReverse(l3);
//    l3.printList();


      /**
       * Given a partition element x, rearrange the list such that all nodes less than x comes before all nodes greater
       * or equal to x.
       */
//      MyListImpl mylist = new MyListImpl();
//      MyLinkedList<Integer> l2 = new MyLinkedList<Integer>();
//      l2.adNodeInList(3);
//      l2.adNodeInList(5);
//      l2.adNodeInList(8);
//      l2.adNodeInList(5);
//      l2.adNodeInList(10);
//      l2.adNodeInList(2);
//      l2.adNodeInList(1);
//      l2.printList();
//      mylist.partitionListUsing1List(l2, 5);
      //mylist.partitionListUsing2Lists(l2, 5);

      /**
       * Check if a Linked List is Palindrome
       */
//      MyListImpl mylist = new MyListImpl();
//      MyLinkedList<Integer> l2 = new MyLinkedList<Integer>();
//      l2.adNodeInList(3);
//      l2.adNodeInList(5);
//      l2.adNodeInList(2);
//      l2.adNodeInList(8);
//      l2.adNodeInList(5);
//      l2.adNodeInList(3);
//      l2.printList();
//      mylist.checkListPalindrome(l2);

      /**
       * Check for the Intersection Ndoe inside 2 lists
       */
      //create 2 lists of different lengths
      MyListImpl mylist = new MyListImpl();
      MyLinkedList<Integer> l1 = new MyLinkedList<Integer>();
      MyLinkedList<Integer> l2 = new MyLinkedList<Integer>();
      l1.adNodeInList(3);
      l1.adNodeInList(6);
      l1.adNodeInList(9);
      l1.adNodeInList(13);
      l1.adNodeInList(18);
      l1.adNodeInList(32);
      l1.adNodeInList(44);
      l1.adNodeInList(59);

      l2.adNodeInList(1);
      l2.adNodeInList(5);
      //attach l2 to the 5th position of l1
      ListNode p1 = l1.start;
      for(int i = 0; i<4;i++)
      {
          p1 = p1.next;
      }
      ListNode p2 = l2.start;
      while(p2.next!=null)
      {
          p2 = p2.next;
      }
      p2.next=p1;

      System.out.println("The lists L1 and L2 which form a Y");
      l1.printList();
      l2.printList();

      //Now call the method to find the intersection node.
      mylist.checkListIntersectionY(l1,l2);

  }
  
  public void listReverse(MyLinkedList l)
  {
    if(l.start == null){
      System.out.println("List is empty");
    }
    ListNode p1 = l.start;
    ListNode p2 = p1.next;
    ListNode p3 = p2.next;
    p1.next= null;
    p2.next = p1;
    while(p3 != null) {
        p1 = p2;
        p2 = p3;
        p3 = p3.next;
        p2.next = p1;
    }
    l.start = p2;
  }
  
  public void removeDuplicates(MyLinkedList<T> l)
  {
    HashSet<T> hs = new HashSet<T>();
    if(l.start==null){
      System.out.println("List is Empty");
      return;
    }
    ListNode p1 = l.start;
    hs.add((T) p1.item);
    while(p1.next!=null){
      if(hs.contains(p1.next.item)){
        p1.next=p1.next.next;
      }
      else{
        hs.add((T) p1.next.item);
        p1 = p1.next;
      }
    }
  }
  
  public static MyLinkedList createLoop(MyLinkedList l , int n)
  {
    ListNode p = l.start;
    ListNode q = l.start;
    for(int i =0;i<n;i++){
      p = p.next;
      q = q.next;
    }
    while(p.next!=null){
      p = p.next;
    }
    p.next = q;
    return l;
  }
  
  public static ListNode findLoopNode(MyLinkedList l)
  {
    
    ListNode p = l.start;
    ListNode q = l.start;
    boolean flagLoop = false;
    while(p.next!=null){
      p = p.next;
      q = q.next.next;
      if(p==q){
        flagLoop = true;
        break;
      }      
    }
    if(flagLoop == false){
      return null;
    }
    p = l.start;
    while(p != q)
    {
      p = p.next;
      q = q.next;
    }
    return p;
  }
  
  public static ListNode findNthFromLast(MyLinkedList l,int n)
  {
    
    ListNode k = l.start;
    ListNode p = l.start;
    for(int i=1;i<=n;i++){
      k = k.next;
      if(k==null){
        return null;
      }
    }
    while(k.next != null){
      p = p.next;
      k = k.next;
    }
    return p;
    
  }
  
  public void removeDupsNoBuffer(MyLinkedList<T> l)
  {
    if(l.start==null){
      System.out.println("The Linked List is null");
    }
    ListNode prev = l.start;
    ListNode current = prev.next;
    while(current != null){
      ListNode runner = l.start;
      while(runner != current){
        if(runner.item == current.item){
          // remove current
          prev.next = current.next;
          current = current.next;
          break;
        }
        runner = runner.next;
      }
      //There are no duplicate nodes, so runner reached current
      if( runner == current ){
        prev = prev.next;
        current = prev.next;
      }
    }
  }

  public void addTwoListsRepresentedBackwards(MyLinkedList<T> l1 , MyLinkedList<T> l2)
  {
      // First check the length of the lists and add padding before adding the lists together

    if(l1.start==null && l2.start==null){
      System.out.println("The passed lists are empty");
    }
    ListNode n1 = l1.start;
    ListNode n2 = l2.start;
    MyLinkedList<T> result = new MyLinkedList<T>();
    int carry = 0;
    while(n1!=null && n2!=null){
      int val = Integer.parseInt(n1.item.toString()) + Integer.parseInt(n2.item.toString()) + carry;
      Integer value = val%10;
      result.adNodeInList((T) value.toString());
      if(val >= 10){
        carry = 1;
      }
      else
      {
        carry = 0;
      }
      n1 = n1.next;
      n2 = n2.next;
    }
    if(n1 == null){
      while(n2!=null){
        Integer val2 = Integer.parseInt(n2.item.toString()) + carry;
         Integer value =  val2 %10;
        result.adNodeInList((T)value);

          if(val2 >10)
            carry = 1;
          else
              carry=0;
          n2 = n2.next;
      }
    }
    else if(n2 == null){
      while(n1!=null){
        Integer val2 = Integer.parseInt(n1.item.toString()) + carry;
          Integer value = val2 % 10;
        result.adNodeInList((T)value);

          if(val2 >10)
              carry = 1;
          else
              carry=0;
          n1 = n1.next;
      }

    }
     if(carry == 1)
     {
         Integer a = 1;
         result.adNodeInList((T)a);
     }
      System.out.println("Final Added List");
    result.printList();
    
  }

    public void addTwoListsRepresentedForward(MyLinkedList<T> l1 , MyLinkedList<T> l2)
    {
        if(l1.start==null && l2.start==null){
            System.out.println("The passed lists are empty");
        }

        MyListImpl mylist = new MyListImpl();

        // Reverse the Lists and Add the same using the earlier method.
        mylist.listReverse(l1);
        System.out.println("Reversed First List");
        l1.printList();
        mylist.listReverse(l2);
        System.out.println("Reversed Second List");
        l2.printList();

        // Add the 2 reversed lists now
        mylist.addTwoListsRepresentedBackwards(l1, l2);


    }

   public void partitionListUsing2Lists(MyLinkedList<T> l, int x)
   {
       ListNode k = l.start;
        if(l.start==null) {
            System.out.println("The List is empty");
            return;
        }

       MyLinkedList p_lower = new MyLinkedList();
       MyLinkedList q_higher = new MyLinkedList();

       while(k !=null) {
           if (Integer.parseInt(k.item.toString()) < x) {
               String t = k.item.toString();
               p_lower.adNodeInList(t);
           } else {
               String t = k.item.toString();
               q_higher.adNodeInList(t);
           }
//           p_lower.printList();
//           q_higher.printList();
           k = k.next;
       }
           System.out.println("This is the lower and higher lists");
           p_lower.printList();
           q_higher.printList();

           ListNode lt = p_lower.start;
           while(lt.next!=null)
           {
               lt = lt.next;
           }
            lt.next = q_higher.start;

           System.out.println("This is the partitioned list");
           p_lower.printList();
       }

    public void partitionListUsing1List(MyLinkedList<T> l, int x)
    {
        ListNode k = l.start;

        if(l.start==null) {
            System.out.println("The List is empty");
            return;
        }

        MyLinkedList p_lower = new MyLinkedList();

        while(k !=null) {
            if (Integer.parseInt(k.item.toString()) < x) {
                String t = k.item.toString();
                p_lower.adNodeAtFront(t);
            } else {
                String t = k.item.toString();
                p_lower.adNodeInList(t);
            }
            k = k.next;
        }

        System.out.println("This is the partitioned list");
        p_lower.printList();
    }

    public void checkListPalindrome(MyLinkedList l1)
    {
        //Store the contents into a stack
        ListNode k = l1.start;
        Stack ms = new Stack();
        while(k!=null)
        {
            ms.push(Integer.parseInt(k.item.toString()));
            k = k.next;
        }

        // Now pop each element from a stack and compare the elements in the list
        k = l1.start;
        boolean flag = true;
        while(k!=null)
        {
            int item1 = Integer.parseInt(ms.pop().toString());
            if(item1 != Integer.parseInt(k.item.toString())){
                System.out.println("The List is not a palindrome");
                flag = false;
                break;
            }
            k = k.next;
        }
        if(flag == true)
        {
            System.out.println("The List is a palindrome");
        }

    }

    public void checkListIntersectionY(MyLinkedList<T> l1 , MyLinkedList<T> l2)
    {
        if(l1==null || l2==null)
        {
            System.out.println("one or more lists are empty");
            return;
        }
        ListNode p1 = l1.start;
        ListNode p2 = l2.start;
        int count1 = 0;
        int count2 = 0;
        while(p1.next!=null)
        {
            p1 = p1.next;
            count1++;
        }
        count1++;
        while(p2.next!=null)
        {
            p2 = p2.next;
            count2++;
        }
        count2++;
        if(p1!=p2)
        {
            System.out.println("there is no Intersection.");
            return;
        }

        //Now there is a intersection, we need to advance the counter of the
        // longer list to bring them to the same node before the intersection.

        Integer itm = null;
        if(count1 > count2)
        {
            ListNode p3 = l1.start;
            int diff = count1 - count2;
            for(int i =0;i<diff; i++)
            {
                p3 = p3.next;
            }
            ListNode p4 = l2.start;
            while(p3!=p4)
            {
                p3 = p3.next;
                p4 = p4.next;
            }
            itm = Integer.parseInt(p3.item.toString());

        }
        else{
            ListNode p3 = l2.start;
            int diff = count2 - count1;
            for(int i =0;i<diff; i++)
            {
                p3 = p3.next;
            }
            ListNode p4 = l1.start;
            while(p3!=p4)
            {
                p3 = p3.next;
                p4 = p4.next;
            }
            itm = Integer.parseInt(p3.item.toString());
        }
        // Now we are the intersection Node , print the same
        System.out.println("The intersection node is - "+itm);

    }

}


