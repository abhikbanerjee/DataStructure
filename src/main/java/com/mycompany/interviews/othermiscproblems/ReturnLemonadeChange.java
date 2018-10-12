package com.mycompany.interviews.othermiscproblems;

public class ReturnLemonadeChange
{
    public static void main(String args[])
    {
        int[] listOfAmounts = new int[]{5,5,5,10,20};
        int[] listOfAmounts1 = new int[]{5,5,10};
        int[] listOfAmounts2 = new int[]{10,10};
        int[] listOfAmounts3 = new int[]{5,5,10,10,20};


        int[] listOfAmounts4 = new int[]{5,10,5,20,5,10,5,20,5,10,5,20,5,10,
                5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10,5,20,5,10};

        System.out.println("Have Enough Change - " + lemonadeChange(listOfAmounts));
//        System.out.println("Have Enough Change List1 - " + lemonadeChange(listOfAmounts1));
//        System.out.println("Have Enough Change List2 - " + lemonadeChange(listOfAmounts2));
//        System.out.println("Have Enough Change List3 - " + lemonadeChange(listOfAmounts3));

        System.out.println("Have Enough Change List4 - " + lemonadeChange(listOfAmounts4));

    }
    public static boolean lemonadeChange(int[] bills) {
        if(!(bills.length>=0 || bills.length<=10000))
        {
            return false;
        }
        int balanceAmount = 0;
        for(int bill  : bills)
        {
            if (bill == 5 || bill == 10 || bill == 20)
            {
                int amountToRefund = bill - 5;
                if(amountToRefund > balanceAmount)
                {
                    System.out.println("Not Enough to return change");
                    return false;
                }
                else {
                    balanceAmount = balanceAmount + bill - amountToRefund;
                    System.out.println(balanceAmount);
                }
            }
            else
            {
                System.out.println("Invalid bill presented");
                return false;
            }

        }
        return true;
    }
}
