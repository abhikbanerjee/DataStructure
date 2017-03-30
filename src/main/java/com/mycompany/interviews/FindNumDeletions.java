package com.mycompany.interviews;

/**
 * Created by Abhik Banerjee
 * on 3/28/17.
 */

/*
    1. Minimum number of Deletions in a string - given string and dictionary, find the min number of deletions in the word to make it a valid word
      a. Traverse the Dictionary
      b. Traverse the Word and do look up in a dictionary

*/

import java.util.HashSet;

public class FindNumDeletions
{
    public static void main(String args[])
    {
        HashSet<String> dict = new HashSet<String>();
        String words[] = new String[]{"cat", "mat", "rat", "house", "linkedin", "linkedlist"};
        //Create a dictionary with the given words
        dict = createDict(words);

        //String wordToMatch = "caltsnm";
        //String wordToMatch = "catsn";
        String wordToMatch = "calsnm";
        // Given the above word we need to find the number of deletions to match a word to the dictionary
        int numDeletions = findNumDeletions(wordToMatch, dict);
        if(numDeletions!=-1)
        {
            System.out.println("Number of Deletions needed for the word - " + wordToMatch + " is - " + numDeletions);
        }
        else
        {
            System.out.println("Number of Deletions not possible to match any word in Dictionary");
        }
    }

    public static HashSet<String> createDict(String words[])
    {
        HashSet<String> dict = new HashSet<String>();
        for(String word: words)
        {
            dict.add(word);
        }
        return dict;
    }

    public static int findNumDeletions(String word, HashSet<String> dict)
    {
        for(String w: dict)
        {
            boolean flag = compareWords(word, w);
            if(flag)
            {
                return Math.abs(word.length()- w.length());
            }
        }
        return -1;
    }

    public static boolean compareWords(String word, String dictWord)
    {
        // cat and caktsn
        int lengthWord = word.length();
        int lengthDictWord = dictWord.length();
        boolean wordContains = true;
        if(lengthWord < lengthDictWord)
        {
            int k=0;
            int j=0;
            while(j<lengthWord)
            {
                if(k>=lengthDictWord)
                {
                    wordContains = false;
                    break;
                }
                char chw = word.charAt(j);
                char chwdict = dictWord.charAt(k);
                if(chw==chwdict)
                {
                    k++;
                    j++;
                }
                else
                {
                    k++;
                }
            }
        }
        else
        {
            int k=0;
            int j=0;
            while(j<lengthDictWord)
            {
                if(k>=lengthWord)
                {
                    wordContains = false;
                    break;
                }
                char chw = word.charAt(k);
                char chwdict = dictWord.charAt(j);
                if(chw==chwdict)
                {
                    k++;
                    j++;
                }
                else
                {
                    k++;
                }
            }
        }
        return wordContains;
    }
}