package com.mycompany.interviews.recursionproblems;

/**
 * Created by Abhik Banerjee
 * on 4/7/17.
 */

// Lets say we can take 1, 2 or 3 steps and given N steps how many different ways we can take those N steps
public class CountTakeSteps
{
    public static void main(String[] args)
    {
        CountTakeSteps ct = new CountTakeSteps();
        Integer steps = 4;
        //Integer steps = 9;
        System.out.println("Number of Ways one can take N steps - " + ct.countSteps(steps));
    }

    public int countSteps(Integer steps)
    {
        if(steps < 0 )
        {
            return 0;
        }
        else if(steps==0)
        {
            return 1;
        }
        else {
            return countSteps(steps-1) + countSteps(steps-2) + countSteps(steps-3);
        }
    }
}
