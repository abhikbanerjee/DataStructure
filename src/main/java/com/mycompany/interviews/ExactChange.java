package com.mycompany.interviews;

/**
 * Created by Abhik Banerjee
 * on 4/11/17.
 */

public class ExactChange
{
    public static void main(String args[])
    {
        int[] coins = {25,15,1};
        //int[] coins = {25,10,5,1};
        int amount = 30;
        ExactChange ec = new ExactChange();
        System.out.println("Number of min coins - " + ec.findExactChange(amount, coins));
    }

    public int findExactChange(int amount, int[] coins)
    {
        if(amount==0)
            return 0;
        int min = amount;
        for(int coin : coins)
        {
            if(amount-coin >= 0)
            {
                int c = findExactChange(amount-coin, coins);
                if(min > c + 1) return c + 1;
            }
        }
        return min;
    }

}