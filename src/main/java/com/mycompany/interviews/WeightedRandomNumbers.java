package com.mycompany.interviews;

import java.util.Random;

/**
 * Created by Abhik Banerjee
 * on 4/1/17.
 */

public class WeightedRandomNumbers
{
    public static void main(String args[])
    {
        WeightedRandomNumbers wt = new WeightedRandomNumbers();
        String nums[] = new String[]{"A", "B", "C", "D", "E", "F"};
        Integer weights[] = new Integer[]{2,4,3,5,1,6};
        System.out.println(wt.randomWeightedValue(nums, weights));

    }

    public String randomWeightedValue(String[] nums, Integer[] weights)
    {
        String value = "";
        Integer totalWeight = 0;
        for(Integer w: weights)
        {
            totalWeight += w;
        }

        Random rand = new Random();
        Integer randomValue = rand.nextInt(totalWeight);
        System.out.println("Random Value generated - "+ randomValue);
        Integer indexValue= null;

        for(int i=0;i<nums.length;i++)
        {
            randomValue -= weights[i];
            if(randomValue<=0.0d)
            {
                indexValue = i;
                break;
            }
        }

        if(indexValue!=null) {
            return nums[indexValue];
        }
        else
            return null;
    }
}
