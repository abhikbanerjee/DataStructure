package com.mycompany.ArrayMiscProblems;

/**
 *
 * @author abhikbanerjee12
 */
import java.util.*;

public class SplitArray{
  
  public static void main(String args[]){
    
    Integer array[] = {2,5,6,22,56,77,89,1};
    //Integer array[] = {2,5,6,22,56,77,89,8,9,1,11,12,13,14 };
    int k = 5;
    ArrayList<ArrayList<Integer>> arrayOfLists = splitArrayIntoLists(array,k);
    if(arrayOfLists != null){
      for(int i = 0; i<arrayOfLists.size();i++){
        ArrayList<Integer> arr = arrayOfLists.get(i);
        for(Integer in: arr){
          System.out.print(in+" ");
        }
        System.out.println("");
      }
    }
  }
  
  public static ArrayList<ArrayList<Integer>> splitArrayIntoLists(Integer arr[], int k){
    
    ArrayList<ArrayList<Integer>> returnSplitList = new ArrayList<ArrayList<Integer>>();
    int len = arr.length;
    if(len==0){
      System.out.println("Array is empty ");
      return null;
    }
    if(k>len){
      System.out.println("The Array Length is less than the Split size passed. ");
      return null;
    }
    // Set the values to go in each array/list and loop through
    int numOfElem = len/k;
    int num1arr = 0;
    int stopLimit = numOfElem*k;
    int bucket = 0;
    
    //Check one more condition , if the numbers are not properly distributed
    //    System.out.println((len%k)!=1);
    //    System.out.println((len%k)!= k-1);
    //    if ((len%k)!=0 && (len%k) != (k-1) ){
    //
    //      System.out.println("The Array cannot be properly split with a difference of 1. ");
    //      return null;
    //    }
    
    
    for(int i =0; i <k;i++){
      ArrayList<Integer> arrls = new ArrayList<Integer>();
      returnSplitList.add(arrls);
    }
    
    
    while(num1arr < (stopLimit)){
      ArrayList<Integer> arrls = returnSplitList.get(bucket);
      arrls.add(arr[num1arr]);
      num1arr++;
      if(bucket < k-1){
        bucket++;
      }
      else{
        bucket = 0;
      }
    }
    
    int runBuc = 0;
    for(int j = stopLimit;j < len; j++){
      ArrayList<Integer> arrls = returnSplitList.get(runBuc);
      arrls.add(arr[j]);
      runBuc++;
    }
    return returnSplitList;
  }
}
