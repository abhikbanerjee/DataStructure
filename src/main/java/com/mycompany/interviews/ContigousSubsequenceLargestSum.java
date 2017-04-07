package com.mycompany.interviews;

/**
 * Created by Abhik Banerjee
 * on 4/6/17.
 */
public class ContigousSubsequenceLargestSum
{
    public static void main(String[] args)
    {
        ContigousSubsequenceLargestSum ct = new ContigousSubsequenceLargestSum();
        int[] arr = new int[] {5, -9, 6, -2, 3};
        //int[] arr = new int[] {2, 5, -4, 6, -1, 2};
        System.out.println("The Max SubSequence - "+ ct.findMaxSumSubSeq(arr));
    }

    public int findMaxSumSubSeq(int[] arr)
    {
        int sum = 0;
        int maxsum = 0;
        for(int i=0; i< arr.length; i++)
        {
            sum += arr[i];

            // If adding the next element increases the sum then update maxsum else not
            if(maxsum < sum)
            {
                maxsum = sum;
            }

            if(sum <0)
            {
                sum = 0;
            }

        }
        // return the sum which is the maximum sum of the sub sequence in the array
        return sum;
    }
}
