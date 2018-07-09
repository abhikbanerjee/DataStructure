package com.mycompany.interviews.othermiscproblems;

/**
 *
 * @author abhikbanerjee
 */

import java.util.*;

public class ThreeSum {
    public ArrayList<ArrayList<Integer>> threeSum(int[] nums) {
        HashSet<Integer> numberFound = new HashSet<Integer>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();       
        for(int i=0;i<nums.length;i++)
        {
            for(int j=1;j<i;j++)
            {
                int sum = nums[i]+nums[j];
                
                if(!numberFound.contains(-sum))
                {
                    numberFound.add(-sum);
                }
                else
                {
                    //Found the triplet , print it
                    ArrayList res1 = new ArrayList<Integer>();
                    res1.add(nums[i]);
                    res1.add(nums[j]);
                    res1.add(-sum);
                    result.add(res1);
                }
            }
        }
        return result;
    }
    
    public static void main(String args[])
    {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        ThreeSum ts = new ThreeSum();
        System.out.println(ts.threeSum(nums));
    }
}