package com.mycompany.interviews;

/**
 * Created by Abhik banerjee
 * on 4/6/17.
 */
public class NumberOfTrailingZerosFact
{
    public static void main(String args[])
    {
        NumberOfTrailingZerosFact nb = new NumberOfTrailingZerosFact();
        int number = 15;
        System.out.println("Factorial of Number "+ number + " is - "+ nb.fact(number));
        System.out.println("Number of Trailing Zeros - " + nb.findTrailingZeros(number));
    }

    public int numberOf5(int num)
    {
        int count=0;
        while(num%5==0)
        {
            count++;
            num /= 5;
        }
        return count;
    }

    public int findTrailingZeros(int num)
    {
        int trailingZeros = 0;
        for(int i=2; i<=num; i++)
        {
            trailingZeros += numberOf5(i);
        }
        return trailingZeros;
    }

    public int fact(int number)
    {
        int fact = 1;
        if(number ==0) {
            return fact;
        }
        else
        {
            for(int i=1;i<=number; i++)
            {
                fact *= i;
            }
        }
        return fact;
    }


}
