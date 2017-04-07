/**
 * Created by Abhik Banerjee on
 * 2/13/17.
 */

package com.mycompany.ArrayMiscProblems;

public class ModifiedBinarySearch {
    public static void main(String[] args){

        Integer[] arr = {24,20,18,4,6,8,9,12,16};
        ModifiedBinarySearch mb = new ModifiedBinarySearch();

        // Test Case where Middle element is the element searched for
//        boolean found = mb.modifiedBinarySearch(arr, 9, 0, arr.length-1);

        // Test Case where Element is in the left half of the mid point
//        boolean found = mb.modifiedBinarySearch(arr,18, 0, arr.length-1);

        // Test Case where Element is in the right half of the mid point
        boolean found = mb.modifiedBinarySearch(arr,12, 0, arr.length-1);


        // Test Case where Element is in the last or the first element of the array -
        //boolean found = mb.modifiedBinarySearch(arr,16, 0, arr.length-1);

//        boolean found = mb.modifiedBinarySearch(arr,24, 0, arr.length-1);

//        boolean found = mb.modifiedBinarySearch(arr,100, 0, arr.length-1);

        if(found) {
            System.out.println("Element is Found in the Array");
        }
        else{
            System.out.println("Element is Not Found in the Array");
        }
    }

    public boolean modifiedBinarySearch(Integer[] arr,int elem, int low, int high ){
        boolean found = false;
        while(low<=high){
            printArray(arr, low, high);
            int mid = (low+high)/2;
            if(arr[mid] == elem) {
                return true;
            }
            if(arr[mid] > elem && arr[low] <= elem){
                high = mid -1;
                continue;
            }
            else if(arr[mid] > elem && arr[low] > elem){
                low = mid+1;
                continue;
            }
            else if(arr[mid] < elem && arr[high] >= elem){
                low = mid+1;
                continue;
            }
            else{
                high = mid -1;
            }
        }
        return found;
    }

    public static void printArray(Integer[] arr, int low, int high){
        for(int i=low; i<= high;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
