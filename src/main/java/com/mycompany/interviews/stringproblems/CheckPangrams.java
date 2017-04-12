package com.mycompany.interviews.stringproblems;

/**
 * Created by Abhik Banerjee
 *  on 3/24/17.
 */
import java.util.*;

public class CheckPangrams {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        //String s1 = "We promptly judged antique ivory buckles for the next prize";
        String s2 = "We promptly judged antique ivory buckles for the prize";
        //s = in.next();
        boolean flag = stringIsPangram(s2);
        if(flag==false)
        {
            System.out.println("not pangram");
        }
        else
        {
            System.out.println("pangram");
        }
    }
    public static boolean stringIsPangram(String s)
    {
        String lowerS =  s.toLowerCase();
        boolean flag = true;

        Boolean arr[] = new Boolean[26];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = false;
        }
        for(int k=0;k<lowerS.length()-1;k++)
        {
            char ch = lowerS.charAt(k);
            if(ch>=97 && ch<=122) {
                arr[ch - 97] = true;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==false)
            {
                flag=false;
            }
        }
        return flag;
    }

}