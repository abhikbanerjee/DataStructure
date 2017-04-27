package com.mycompany.interviews.recursionproblems;

/**
 * Created by Abhik Banerjee
 * on 4/26/17.
 */

public class PrintAllPossibleParanthesis {

    public static void main(String args[])
    {
        // call the paranthesis permute function
        paranPermute(3); // with 3 means there are 3 brackets - ()()()
    }

    public static void printPar(int left, int right, char[] str, int count)
    {
        //System.out.println(left+" : "+ right);
        if(left<0 || right<0)
        {
            return; // error condition
        }
        if(left==0 && right==0)
        {
//            System.out.println(str);
            printCharArray(str);        // we found one of the solutions
        }
        else
        {
            // We first try to see if we can allow a left paranthesis
            // and then recursively call else try for a right paranthesis
            // and recursively call.
            if(left>0)
            {
                str[count] = '(';
                printPar(left-1, right, str, count+1);
            }
            if(right >=1)
            {
                str[count] = ')';
                printPar(left, right-1,str, count+1);
            }
        }
    }

    public static void paranPermute(int count)
    {
        char[] str = new char[count*2];
        printPar(count, count, str, 0);
    }

    public static void printCharArray(char[] arr)
    {
        for(char ch: arr)
        {
            System.out.print(ch);
        }
        System.out.println();
    }
}
