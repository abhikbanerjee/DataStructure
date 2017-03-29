
package com.mycompany.ArrayMiscProblems;

/**
 *
 * @author Abhik Banerjee
 */

public class AtoI
{
        public static void main(String args[])
        {
                String test1 = "12 34";
                String test2 = "+234 5";
                String test3 = "-2 4 6 7";
                String test4 = "2 3 a fff 98";
                System.out.println("Answer to atoi : "+test1+ " : " + integerFromStringUsingClass(test1));
                System.out.println("Answer to atoi : "+test1+ " : " + integerFromStringNotUsingClass(test1));
                System.out.println();
                System.out.println("Answer to atoi : "+test2+ " : " + integerFromStringUsingClass(test2));
                System.out.println("Answer to atoi : "+test2+ " : " + integerFromStringNotUsingClass(test2));
                System.out.println();
                System.out.println("Answer to atoi : "+test3+ " : " + integerFromStringUsingClass(test3));
                System.out.println("Answer to atoi : "+test3+ " : " + integerFromStringNotUsingClass(test3));
                System.out.println();
                System.out.println("Answer to atoi : "+test4+ " : " + integerFromStringUsingClass(test4));
                System.out.println("Answer to atoi : "+test4+ " : " + integerFromStringNotUsingClass(test4));
                System.out.println();
        }

        public static Integer integerFromStringUsingClass(String st)
        {
                int value = 0;
                int k = 0;
                int j = 0;
                if(st.charAt(0)=='+' || st.charAt(0)=='-'){
                        j =1;
                 }
                for(int i = st.length()-1; i>=j;i--)
                {
                        char ch = st.charAt(i);
                        if(ch == ' '){
                                continue;
                        }
                        if(Character.isDigit(ch)==false){
                                return 0;
                        }
                        else{
                                value = value + (int) (Character.getNumericValue(ch) * Math.pow(10,k));
                                k++;
                        }
                }
                //Check if the first character is a sign
                if(st.charAt(0)=='-'){
                        value *= -1;
                }
                return value;
        }
        
        public static Integer integerFromStringNotUsingClass(String st)
        {
                int value = 0;
                int k = 0;
                int j = 0;
                if(st.charAt(0)=='+' || st.charAt(0)=='-'){
                        j =1;
                 }
                for(int i = st.length()-1; i>=j;i--)
                {
                        char ch = st.charAt(i);
                        int it = (int)ch;
                        if(it == 32){
                                continue;
                        }
                        if(it < 48 || it > 57){
                                return 0;
                        }
                        else{
                                value = value + (int) ((it-48) * Math.pow(10,k));
                                k++;
                        }
                }
                //Check if the first character is a sign
                if(st.charAt(0)=='-'){
                        value *= -1;
                }
                return value;
        }

}
