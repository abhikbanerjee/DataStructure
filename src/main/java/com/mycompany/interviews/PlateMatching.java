package com.mycompany.interviews;

/**
 * Created by Abhik Banerjee
 *  on 3/25/17.
 */
import java.util.*;

public class PlateMatching
{
    // This will be our Dictionary to keep all the words
    public static HashMap< String, ArrayList<String>> dict = new HashMap<String, ArrayList<String>>();
    public static void main(String args[])
    {
        String words[] = new String[]{"Cat", "rat", "Halo", "Fat", "Mat", "Sat", "Taco", "Actual", "Factual"};
        createDict(words);

        //Given a Plate find the smallest word.
        String plate = "CA234";
        String answer = getSmallestWordForPlate(plate);
        if(answer.length()>0) {
            System.out.println("The smallest word for the Plate " + plate + " is " + answer);
        }
    }

    // This method is used to create a dictionary from an array of strings, for our usage.
    public static void createDict(String[] words)
    {
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<words[i].length();j++)
            {
                String ch = (words[i].charAt(j)+"").toUpperCase();
                if(!dict.containsKey(ch))
                {
                    ArrayList<String> wordsForChar = new ArrayList<String>();
                    wordsForChar.add(words[i].toUpperCase());
                    dict.put(ch, wordsForChar);
                }
                else
                {
                    ArrayList<String> wordsForChar = dict.get(ch);
                    wordsForChar.add(words[i].toUpperCase());
                    dict.put(ch, wordsForChar);
                }
            }
        }
    }

    //This method is used to find the smallest word from the dicstionary for a given plate
    public static String getSmallestWordForPlate(String plate)
    {
        List<ArrayList<String>> wordLists = new ArrayList<ArrayList<String>>();
        // This loop goes over each of the chanracters(only characters) in the plate and
        // fetches all the list of the words for the next step.
        for(int i=0;i<plate.length();i++)
        {
            char ch = plate.charAt(i);
            if(ch>=65 && ch<=90)
            {
                ArrayList<String> words = dict.get(ch+"");
                if(words!=null && words.size()!=0)
                {
                    wordLists.add(words);
                }
            }
        }

        // Now we need find the smallest word which is common in all the Lists.
        String smallestWord = getSmallestWordFromLists(wordLists);
        return smallestWord;
    }

    public static String getSmallestWordFromLists(List<ArrayList<String>> wordLists)
    {
        HashMap<String, Integer> wordcounts = new HashMap<String, Integer>();
        Integer numberOfLists = wordLists.size();

        // These loops go over all the arraylist words and put them in a hashmap with their counts
        for(int i=0;i<wordLists.size();i++)
        {
            for(int j=0;j<wordLists.get(i).size();j++)
            {
                String wordToCount = wordLists.get(i).get(j);
                if(!wordcounts.containsKey(wordToCount))
                {
                    wordcounts.put(wordToCount, 1);
                }
                else
                {
                    Integer cont = wordcounts.get(wordToCount);
                    wordcounts.put(wordToCount, cont+1);
                }
            }
        }
        // This gets the list of the words whose counts are equal to the size of the arraylist
        // this means these words are present in all the array list , hence our targer words to find the smallest word
        ArrayList<String> commonWords = new ArrayList<String>();
        for(String words : wordcounts.keySet())
        {
            if(wordcounts.get(words)==numberOfLists)
            {
                commonWords.add(words);
            }
        }

        //Now we want to find the word which has the lowest length among the common list
        String smallestWord="";
        Integer length=100000;
        for(int i=0;i<commonWords.size();i++)
        {
            String currWord = commonWords.get(i);
            if(currWord.length() <length)
            {
                smallestWord = currWord;
                length = currWord.length();
            }
        }
        return smallestWord;
    }
}