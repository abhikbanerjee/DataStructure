package com.mycompany.interviews.recursionproblems;

/**
 * Created by Abhik Banerjee
 * on 4/11/17.
 */

public class ExactChange
{
    public static void main(String args[])
    {
        //int[] coins = {25,15,1};
        int[] coins = {25,10,5,1};
//        int amount = 30;
        int amount = 46;
        ExactChange ec = new ExactChange();

        //call the recursive function
        System.out.println("Number of min coins Recursive Function - " + ec.findExactChange(amount, coins));

        //call the non-recursive function
        System.out.println("Number of min coins Non Recursive Function - " + ec.findExactChangeNonRec(amount, coins));

    }

    public int findExactChange(int amount, int[] coins)
    {
        if(amount==0) {
            return 0;
        }
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

    public int findExactChangeNonRec(int amount, int[] coins)
    {
        if(amount==0) {
            return 0;
        }
        int min = 0;
        for(int coin: coins) {
            int numCoins = amount / coin;
            if(numCoins > 0)
            {
                min += numCoins;
            }
            amount = amount - (numCoins * coin);
        }
        return min;
    }

}