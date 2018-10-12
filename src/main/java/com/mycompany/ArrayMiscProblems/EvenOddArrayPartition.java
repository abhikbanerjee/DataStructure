package com.mycompany.ArrayMiscProblems;

import java.util.Collections;

public class EvenOddArrayPartition
{
    public static void main(String args[])
    {
        int arr[] = new int[]{2,3,6,7,9,13,15,22,23,26,28,32,44,43,41,77};

        int nextEven = 0;
        int nextOdd = arr.length -1;

        System.out.println("Before Moving Even / Odd elements");
        printArray(arr);
        while(nextEven < nextOdd)
        {
            if(arr[nextEven]%2 == 0)
            {
                nextEven++;
            }
            else
            {
                int k = arr[nextEven];
                arr[nextEven] = arr[nextOdd];
                arr[nextOdd] = k;
                nextOdd--;
            }
        }
        System.out.println("After Moving Even / Odd elements");
        printArray(arr);
    }
    public static void printArray(int arr[])
        {
        for(int i=0; i <arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }

}
