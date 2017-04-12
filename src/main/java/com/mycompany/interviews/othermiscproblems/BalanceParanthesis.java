package com.mycompany.interviews.othermiscproblems;

import java.util.Stack;

/**
 * Created by Abhik Banerjee
 * on 4/1/17.
 */
public class BalanceParanthesis
{
    public static void main(String args[])
    {
        //String expn = "(abc(def[478]hj)jnjn)";
        String expn = "(abc(def[478]hj]jnjn)";
        //String expn = "(abc(def[478]hj))jnjn)";
        //String expn = "";
        BalanceParanthesis bp = new BalanceParanthesis();
        System.out.println("Is the Expression Balanced - "+ bp.isParanBalanced(expn));
    }

    public boolean isParanBalanced(String expn)
    {
        boolean isBalanced = true;
        Stack<String> operators = new Stack<String>();
        for(int i=0;i<expn.length();i++)
        {
            String ch = expn.charAt(i)+"";
            if(ch.equals("{") || ch.equals("(") || ch.equals("["))
            {
                operators.push(ch);
            }
            if(ch.equals("}") || ch.equals(")") || ch.equals("]"))
            {
                if(operators.empty())
                {
                    isBalanced=false;
                    break;
                }
                String poppedChar = operators.pop();
                if( (ch.equals("}") && !poppedChar.equals("{")) ||
                        (ch.equals("]") && !poppedChar.equals("[")) ||
                (ch.equals(")") && !poppedChar.equals("(")) )
                {
                    isBalanced=false;
                    break;
                }
            }
        }
        if(isBalanced==true && operators.size()==0)
            return true;
        else
            return false;
    }

}
