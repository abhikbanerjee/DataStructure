/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interviews;

/**
 *
 * @author abhikbanerjee12
 */
public class QuickSort {
  public static int numbers[] = {1,4,5,6,8,11,2,3};
  public static int number;
  public static void main(String args[]){

    quicksort(0,numbers.length-1);
    printArr(numbers);
  }
  
  public static void quicksortRandomWebpage(int[] ints,int low,int high){
    printArr(ints);
    System.out.println();
    if(ints.length==1){
      return;
    }
    //int pivot = low;
    int pivot = (low+high)/2;
    while(low<high){
      while(ints[low] <= ints[pivot]){
        low = low + 1;
      }
      while(ints[pivot] < ints[high]){
        high = high-1;
      }
      System.out.println(low+" : "+high);
      //Swapping low and high
      if(low < high){
        int tmp = ints[low];
        ints[low] = ints[high];
        ints[high] = tmp;
        printArr(ints);
      }
    }
    int tmp = ints[pivot];
    ints[pivot] = high;
    ints[high] = tmp;
    
    printArr(ints);
    //     quicksort(ints,0,pivot+1);
    //     quicksort(ints,pivot+1,ints.length);
  }
  public static void printArr(int[] ints){
    for(int i =0;i<ints.length;i++){
      System.out.print(ints[i]+" ");
    }
    System.out.println();
  }
  
  private static void quicksort(int low, int high) {
    printArr(numbers);
    int i = low, j = high;
    // Get the pivot element from the middle of the list
    int pivot = numbers[low + (high-low)/2];
    System.out.println("Pivot "+pivot);
    // Divide into two lists
    while (i <= j) {
      // If the current value from the left list is smaller then the pivot
      // element then get the next element from the left list
      while (numbers[i] < pivot) {
        i++;
      }
      // If the current value from the right list is larger then the pivot
      // element then get the next element from the right list
      while (numbers[j] > pivot) {
        j--;
      }

      // If we have found a values in the left list which is larger then
      // the pivot element and if we have found a value in the right list
      // which is smaller then the pivot element then we exchange the
      // values.
      // As we are done we can increase i and j
      if (i <= j) {
        exchange(i, j);
        i++;
        j--;
      }
      //printArr(numbers);
    }
    // Recursion
    if (low < j)
      quicksort(low, j);
    if (i < high)
      quicksort(i, high);
  }

  private static void exchange(int i, int j) {
    int temp = numbers[i];
    numbers[i] = numbers[j];
    numbers[j] = temp;
  }
}
