package com.mycompany.interviews.recursionproblems;

/**
 * Created by Abhik Banerjee
 * on 4/6/17.
 */

public class PossibleWaysToCreateAmount
{
    public static void main(String args[])
    {
        // find possible ways to make up an amount
        PossibleWaysToCreateAmount po = new PossibleWaysToCreateAmount();
        System.out.println("Total number of Different ways to make up an amount - " + po.waysForAmountX(50, 25));

    }

    public Integer waysForAmountX(Integer amount, int denom)
    {
        int next_denom = 0;
        int ways = 0;
        switch(denom)
        {
            case 25: {
                next_denom = 10;
                break;
            }
            case 10:
            {
                next_denom = 5;
                break;
            }
            case 5:
            {
                next_denom = 1;
                break;
            }
            case 1:
                return 1;

        }
        for(int i=0; i * denom <= amount; i++ )
        {
            ways += waysForAmountX(amount - (i*denom), next_denom);
        }
        return ways;

    }
}
