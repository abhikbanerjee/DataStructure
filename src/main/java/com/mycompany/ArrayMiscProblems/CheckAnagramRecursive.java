/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ArrayMiscProblems;

/**
 *
 * @author abhikbanerjee12
 */
public class CheckAnagramRecursive {
  
  public static void main(String args[]){
    
//    String chkStr = "abhiihba";
//    String chkStr = "abhikihba";
    String chkStr = "abhkihba";
    
    Boolean succ = false;
    if(chkStr.charAt(0)==chkStr.charAt(chkStr.length()-1)){
      succ = checkIfAnagram(chkStr.substring(1, chkStr.length()-1));
    }
    System.out.println("The String is a Anagram :- "+succ);
    
  }
  public static boolean checkIfAnagram(String str){
    //System.out.println(str);
    Boolean success = false;
    if(str == null){
      return success;
    }
    if(str.length()==1 || str.length()==0){
      success = true;
    }
    else{
      if(str.charAt(0)==str.charAt(str.length()-1)){
        success = checkIfAnagram(str.substring(1,str.length() - 1 ));
      }
      else{
        return false;
      }
    }
    return success;
  }
  
}
