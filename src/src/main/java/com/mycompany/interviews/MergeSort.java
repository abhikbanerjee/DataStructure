package com.mycompany.interviews;

/**
 *
 * @author abhikbanerjee12
 */
public class MergeSort {
  
  public static int arr[];
  public static int helper[] = new int[10];
  
  public static void main(String args[]){
    
    arr = new int[]{5,7,9,1,4,2,3,6,8,10};
    System.out.println("UnSorted Array ");
    for(int i=0;i<10;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    mergesort(0,arr.length-1);
    System.out.println("***************************");
    System.out.println("Sorted Array ");
    for(int i=0;i<10;i++){
      System.out.print(arr[i]);
    }
  }
  
  public static void mergesort(int low, int high){
    if(low < high){
      int mid = (low+(high-low))/2;
      mergesort(low,mid);
      mergesort(mid+1,high);
      merge(low,mid,high);
    }
  }
  
  public static void merge(int low, int mid, int high){
    //first copy the array to the helper array
    for(int i=0;i<arr.length;i++){
      helper[i] = arr[i];
    }
    
    int i = low;
    int j = mid+1;
    int k = low;
    
    while(i<=mid && j<=high){
      if(helper[i]<=helper[j]){
        arr[k]=helper[i];
        i++;
      }
      else{
        arr[k]=helper[j];
        j++;
      }
      k++;
    }
    //copy the rest of the array
    while(i<=mid){
      arr[k] = helper[i];
      k++;
      i++;
    }
    //    while(j<=high){
    //      arr[k]=helper[j];
    //      j++;
    //      k++;
    //    }
  }
  
}
