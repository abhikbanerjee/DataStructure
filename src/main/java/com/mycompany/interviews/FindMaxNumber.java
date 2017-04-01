package com.mycompany.interviews;

/**
 * Created by Abhik banerjee
 * on 4/1/17.
 */

import java.util.Arrays;

public class FindMaxNumber
{
    public static void main(String args[])
    {
        FindMaxNumber fm = new FindMaxNumber();
        // Convert number to a string and sort
        //System.out.println(fm.findMaximumNumber(1768243));

        // perform some operations and find the maximum number
        System.out.println(fm.findMaximumNumberOptim(1768243));
    }

/**
 * This method takes a number and returns the highest possible number with the
 * same digits in the original number.
 */
    public Integer findMaximumNumber(Integer number)
    {
        if(number ==null || number==0)
        {
            return number;
        }
        String sNumber = ""+number;
        char intArray[] = sNumber.toCharArray();
        Arrays.sort(intArray);
        String maxIntString = "";
        for(int i=intArray.length-1; i>=0; i--)
        {
            maxIntString+=intArray[i];
        }
        return Integer.parseInt(maxIntString);
    }

    /**
     * This method Is a more optimized one and compared to before
     *  to return the highest possible number with the
     * same digits in the original number.
     */
    public Integer findMaximumNumberOptim(Integer number)
    {
        if(number ==null || number==0)
        {
            return number;
        }

        Integer digits[] = convertNumberToDigits(number);
//        printArray(digits);
        Arrays.sort(digits);
//        printArray(digits);

        return convertDigitsToNumber(digits);
    }

    public Integer[] convertNumberToDigits(Integer number)
    {
        if(number==null ||number==0 )
            return null;

        int size = (number+"").length();
        Integer digits[] = new Integer[size];

        int i=0;
        while(number!=0)
        {
            digits[i] = number %10;
            number = number/10;
            i++;
        }
        return digits;
    }

    public void printArray(Integer arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public Integer convertDigitsToNumber(Integer digits[])
    {
        int size = digits.length -1;
        int sum =0;
        for(int i = size; i>=0;i--)
        {
            sum += (digits[i] * Math.pow(10,i));
//            size--;
        }
        return sum;
    }

}


