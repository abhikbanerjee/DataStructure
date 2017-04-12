package com.mycompany.interviews.othermiscproblems;

/**
 * Created by Abhik banerjee
 *  on 3/28/17.
 */
import java.util.HashSet;

public class FindDuplicateElements
{
    public static void main(String args[])
    {
        String names[] = new String[]{"Ram", "Ellie", "John", "Mad", "Sad"};
        //String names[] = new String[]{"Ram", "Ellie", "John", "Mad", "Sad", "Ram"};
        System.out.println("The List has Duplicate Elements - " + findDuplicates(names));
    }
    public static boolean findDuplicates(String names[])
    {
        HashSet<String> namesSet = new HashSet<String>();
        boolean flagDuplicate = false;
        for(int i=0;i<names.length;i++)
        {
            if(!namesSet.contains(names[i]))
            {
                // The HashSet does not contain the element yet, so we add it to the HashSet and keep iterating
                namesSet.add(names[i]);
            }
            else
            {
                //The HashSet already contains the key, hence this means its a duplicate, return false
                flagDuplicate = true;
                break;
            }
        }
        return flagDuplicate;
    }
}