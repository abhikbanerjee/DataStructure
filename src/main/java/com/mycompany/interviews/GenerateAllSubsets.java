package com.mycompany.interviews;

/**
 * Created by Abhik Banerjee on 4/6/17.
 */

import java.util.*;

public class GenerateAllSubsets {


    public static void main(String args[])
    {
        GenerateAllSubsets gt = new GenerateAllSubsets();
        ArrayList<Integer> set = new ArrayList<Integer>();
        set.add(1);
        set.add(3);
        set.add(5);
        set.add(7);
        gt.getSubsets(set, 4);
    }

    public ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set,int index)
    {
        ArrayList<ArrayList<Integer>> allsubsets;
        if (set.size() == index) { // Base case - add empty set
            allsubsets = new ArrayList<ArrayList<Integer>>(); allsubsets.add(new ArrayList<Integer>()); // Empty set
        }else {allsubsets = getSubsets(set, index + 1);
        int item = set.get(index);
        ArrayList<ArrayList<Integer>> moresubsets = new ArrayList<ArrayList<Integer>>();
        for (ArrayList<Integer> subset : allsubsets) {
            ArrayList<Integer> newsubset = new ArrayList<Integer>();
            newsubset.addAll(subset); // newsubset.add(item); moresubsets.add(newsubset);
        }
        allsubsets.addAll(moresubsets);
    } return allsubsets;
    }

}
