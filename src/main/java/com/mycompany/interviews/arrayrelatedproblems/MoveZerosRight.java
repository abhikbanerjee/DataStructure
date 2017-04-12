package com.mycompany.interviews.arrayrelatedproblems;

/**
 * Created by Abhik Banerjee
 * on 4/1/17.
 */
public class MoveZerosRight
{
    public static void main(String args[])
    {
        Integer arr[] = new Integer[]{1,4,0,3,0,7,0,6,2,9};
        MoveZerosRight mv = new MoveZerosRight();
        Integer arr1[] = mv.moveZerosRight(arr);
        System.out.println("Printing the array after moving zeros");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

    }

    public Integer[] moveZerosRight(Integer arr[])
    {
        //Base Condition
        if(arr==null || arr.length==0)
        {
            System.out.println("Array is Blank");
            return arr;
        }

        int lowerIndex = 0;
        int upperInDex = arr.length-1;
        //Breaking condition continue the loop untill there are no more places to fill zeros
        while(lowerIndex <= upperInDex)
        {
            //If lower index is zero swap the values of lower and upper indexes and update the counters accordingly
            if(arr[lowerIndex]==0)
            {
                arr[lowerIndex] = arr[upperInDex];
                arr[upperInDex] = 0;
                lowerIndex++;
                upperInDex--;
            }
            else
            {
                lowerIndex++;
            }
        }
        return arr;
    }
}
