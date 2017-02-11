/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ArrayMiscProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author abhikbanerjee12
 */
public class ShekharCombination {
  
  public static void main(String [] args) {
   
    String text = "Abhik";
    List<String> binaries = binarySeq(text.length());
    System.out.println(binaries);
    for ( String seq : binaries ) {
      StringBuilder builder = new StringBuilder();
      char[] chars = seq.toCharArray();
      for ( int i = chars.length-1 ; i >= 0 ; --i ) {
        if ( chars[i] == '1' ) {
          builder.append(text.charAt( chars.length - i - 1  ));
        }
      }
      System.out.println(builder.toString());
    }
   
  }
 
  public static List<String> binarySeq(int n) {
    List<String> list = new ArrayList<String>();  
    char[] chars = new char[n];
    Arrays.fill(chars, '\u0030');
    String start = new String(chars);
   
    for ( int i = 0 ; i < Math.pow(2,n)-1; ++i ) {
      int decimalVal = Integer.parseInt(start,2);
      start = Integer.toBinaryString(decimalVal+1);
      list.add(start);
    }
   
    return list;
  }
  
}
