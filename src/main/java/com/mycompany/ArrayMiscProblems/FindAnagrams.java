package com.mycompany.ArrayMiscProblems;

import java.util.*;
/**
 *
 * @author Abhik Banerjee
 */

public class FindAnagrams
{
        public static void main(String args[]){

                String wordList[] = {"cat","tac","dog","star","rsat","odg","mac","tras","god","act","good"};
                HashMap<String,HashSet<String>> anagrams = new HashMap<String,HashSet<String>>();
                for(String word : wordList){
                        char [] wordChar = word.toCharArray();
                        Arrays.sort(wordChar);
                        String newWord = new String(wordChar);
                        if(!anagrams.containsKey(newWord)){
                                HashSet<String> words = new HashSet<String>();
                                words.add(word);
                                anagrams.put(newWord,words);
                        }
                        else{
                                HashSet<String> words = anagrams.get(newWord);
                                words.add(word);
                                anagrams.put(newWord,words);
                        }
                }
                // Print the Anagrams Map
                for(String s: anagrams.keySet()){
                        System.out.println(s+"-->"+anagrams.get(s));
                }
        }
}