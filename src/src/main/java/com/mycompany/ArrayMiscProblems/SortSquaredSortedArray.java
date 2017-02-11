package com.mycompany.ArrayMiscProblems;

import java.util.*;

/**
 * Created by Abhik Banerjee on 12/21/16.
 */
public class SortSquaredSortedArray
{
    public static void main(String args[])
    {
        Integer n = 10;
        Integer arr[] = new Integer[n];
        for(int i=0;i<n;i++)
        {
            double forsign = Math.random();
            Double t = Math.ceil(Math.random() * 10.0);
            if(forsign < 0.5)
            {
                arr[i] = t.intValue() * -1;
            }
            else {
                arr[i] = t.intValue();
            }

        }
        Arrays.sort(arr);

//        Integer arr[] = {-10,-9,-5,-4,-4,-2,-2,-1,1,8};
        printArray(arr);
        printArray(sortArray(arr));

    }

    public static Integer[] sortArray(Integer[] sortedArr)
    {
        Integer sortedSquareArray[] = new Integer[sortedArr.length];
        int positiveStartLoc = -100;
        for(int i = 0; i< sortedArr.length;i++)
        {
            if(sortedArr[i] <0 && sortedArr[i+1] >0)
            {
                positiveStartLoc = i+1;
                break;
            }
        }
        int arrstartneg = positiveStartLoc -1;
        int arrstartposrunner = positiveStartLoc;
        int k =0;

        while(arrstartneg!= -1 && arrstartposrunner!= sortedArr.length)
        {
            int tmp1 = sortedArr[arrstartneg]*sortedArr[arrstartneg];
            int tmp2 = sortedArr[arrstartposrunner]*sortedArr[arrstartposrunner];
            if(tmp1 < tmp2)
            {
                sortedSquareArray[k] = tmp1;
                arrstartneg --;
            }
            else if(tmp2 < tmp1)
            {
                sortedSquareArray[k] = tmp2;
                arrstartposrunner++;
            }
            else
            {
                sortedSquareArray[k] = tmp1;
                k++;
                sortedSquareArray[k] = tmp2;
                arrstartneg --;
                arrstartposrunner++;
            }
            k++;
        }
        while(arrstartposrunner!=sortedArr.length)
        {
            sortedSquareArray[k] = sortedArr[arrstartposrunner] * sortedArr[arrstartposrunner];
            k++;
            arrstartposrunner++;
        }

        while(arrstartneg!=-1)
        {
            sortedSquareArray[k] = sortedArr[arrstartneg] * sortedArr[arrstartneg];
            k++;
            arrstartneg --;
        }

        return sortedSquareArray;
    }

    public static void printArray(Integer[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
