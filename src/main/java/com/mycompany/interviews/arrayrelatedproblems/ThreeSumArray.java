package com.mycompany.interviews.arrayrelatedproblems;
import java.util.Arrays;

/**
 * Created by Abhik Banerjee
 * on 3/27/17.
 */
public class ThreeSumArray
{
        public static void main(String args[])
        {
            Integer arr[] = new Integer[]{4,2,1,-1,3,-4,6,8,5};
            Integer sum = 0;

            printArray(arr);
            // This method prints the 3 integers which sum to 0;
            boolean sumPresent = findIntegersSum(arr, sum);

            // This is another implementation of the method which sums to 0 for any given 3 integers in the array.
            //findIntegersSum2(arr);

            // to make it close to the 2 sum problem we sort the array to traverse the array in O(n) time
            Arrays.sort(arr);
            printArray(arr);

            System.out.println("Is the sum present in the array - "+sumPresent);

        }
        public static boolean findIntegersSum(Integer[] arr, Integer sum)
        {
            boolean flag = false;

            return flag;
        }

        public static void printArray(Integer arr[])
        {
            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }


}
