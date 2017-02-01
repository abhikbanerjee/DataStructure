/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ArrayMiscProblems;

import java.util.Arrays;

/**
 *
 * @author abhikbanerjee12
 */
public class chkSomething {
  
  public static void main(String args[]){
    
//    Integer numberOfAllowedCharacters = 63;
//    Integer numberOfAllowedCharacters = 10;
//    String s3 = "kelakhaodumbhar.abc.yahoo.com";
//    String s3Spl[] = s3.split("\\.");
//        boolean flag = false;
//        for(String str : s3Spl){
//          if(str.trim().length() >= numberOfAllowedCharacters){
//            flag = true;
//            break;
//          }
//        }
//        System.out.println(flag);
   
        //Check Array.sort()
        String st = "shekhar";
        char ch[] = st.toCharArray();
        System.out.println(ch);
        Arrays.sort(ch);
        System.out.println(ch);
        
  }
  
}
