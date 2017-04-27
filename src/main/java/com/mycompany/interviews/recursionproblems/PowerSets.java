package com.mycompany.interviews.recursionproblems;

/**
 * Created by Abhik Banerjee
 * on 4/27/17.
 */
import java.util.Set;
import java.util.HashSet;


public class PowerSets
{
    public static void main(String args[])
    {

    }

    public Set<Set<Integer>> findPowerSets(Set<Integer> originalSet)
    {
        Set<Set<Integer>> sets = new HashSet<Set<Integer>>();
        // if the original set is not having any elements, it will only have the empty set
        if(originalSet.isEmpty())
        {
            sets.add(new HashSet<Integer>());
            return sets;
        }

        //the original set has elements


        return sets;
    }
}
