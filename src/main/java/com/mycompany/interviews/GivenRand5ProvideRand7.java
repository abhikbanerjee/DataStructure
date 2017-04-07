package com.mycompany.interviews;

/**
 * Created by Abhik Banerjee
 * on 4/6/17.
 */

import java.util.Random;

public class GivenRand5ProvideRand7
{
    public static void main(String args[])
    {
        GivenRand5ProvideRand7 gv = new GivenRand5ProvideRand7();
        System.out.println("Random number between 7 using Rand 5 function - " + gv.random7WithRandom5());
    }

    public Integer random7WithRandom5()
    {
        //non deterministic approach as we dont knw when we shall get the value which is a valid value for rand 7
        while(true)
        {
            Random rand = new Random();
            int randNum = (rand.nextInt(5) * 5) + rand.nextInt(5);
            if(randNum < 21)
            {
                return (randNum % 7);
            }
        }
    }
}
