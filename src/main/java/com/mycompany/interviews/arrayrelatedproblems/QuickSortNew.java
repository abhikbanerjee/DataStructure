/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interviews.arrayrelatedproblems;

/**
 *
 * @author abhikbanerjee12
 */
public class QuickSortNew {
  public static int intArr[] = {1,4,5,6,3,11,2,8};
  //public static int intArr[] = {2,8,1,5,7,3,22,15,4,6,11};
  public static void main(String args[])
  {
    printArray();
    quickSort(0,(intArr.length-1));
    printArray();
    
  }
  
  public static void quickSort(int low, int high)
  {
    System.out.println("low - "+low+" high - "+high);
//    printArray();
    int i = low;
    int j = high;
    int pivot = intArr[low+(high-low)]/2;
    if(high <= low){
      return;
    }
    while(i<=j){
      while(intArr[i] < intArr[low])
      {
        i++;
      }
      while(intArr[j] > intArr[low])
      {
        j--;
      }
      if(i <= j){
        exchg(i,j);
        printArray();
      }
    }
    
//    printArray();
//    System.out.println("Pivot Element placed correctly -------- ");
    //Call recursively
    if(low<j){
    quickSort(low,j);
    }
    if(i<high){
      quickSort(i,high);
    }
  }
  
  public static void exchg(int i , int j)
  {
    int temp = intArr[i];
    intArr[i] = intArr[j];
    intArr[j] = temp;
  }
  
  public static void printArray()
  {
    for(int i =0;i< intArr.length;i++){
      System.out.print(intArr[i]+" ");
    }
    System.out.println();
  }
}

