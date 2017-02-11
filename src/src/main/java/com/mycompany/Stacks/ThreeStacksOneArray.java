package com.mycompany.Stacks;

/**
 * Created by tkmacl9 on 12/20/16.
 */
public class ThreeStacksOneArray {

    public static Integer n = 100;
    public static Integer[] array = new Integer[n];
    public static Integer firstStackStartPointer = 0;
    public static Integer firstStackEnd = n/3;
    public static Integer secondStackStartPointer = firstStackEnd +1;
    public static Integer secondStackEnd = (2*n)/3;
    public static Integer thirdStackStartPointer = secondStackEnd +1;
    public static Integer thirdStackEnd = n;
    public static void main(String args[])
    {

        // Test the Stack Push and Pop Operations
        
        pushInStack(22, 0);
        pushInStack(25, 0);
        System.out.println("Printing Stack");
        printStack(0);
        printStack(1);
        printStack(2);

        pushInStack(33, 1);
        pushInStack(56, 2);
        pushInStack(77, 0);
        System.out.println("Printing Stack");
        printStack(0);
        printStack(1);
        printStack(2);

        pushInStack(13, 0);
        pushInStack(46, 2);
        pushInStack(78, 0);
        System.out.println("Printing Stack");
        printStack(0);
        printStack(1);
        printStack(2);

        System.out.println("Pop From Stack 0 " + popFromStack(0));
        System.out.println("Pop From Stack 1 "+ popFromStack(1));
        System.out.println("Pop From Stack 2 "+ popFromStack(2));

        System.out.println("Printing Stack");
        printStack(0);
        printStack(1);
        printStack(2);

        System.out.println("Pop From Stack 1 "+ popFromStack(1));


    }
    public static void pushInStack(int item, int stackNumber)
    {
        if(stackNumber ==0)
        {
            if(firstStackStartPointer == (firstStackEnd))
            {
                System.out.println("Stack Overflow Error !!!");
            }
            else{
                array[firstStackStartPointer] = item;
                firstStackStartPointer++;
            }
        }
        else if(stackNumber == 1)
        {
            if(secondStackStartPointer == (secondStackEnd))
            {
                System.out.println("Stack Overflow Error !!!");
            }
            else{
                array[secondStackStartPointer] = item;
                secondStackStartPointer++;
            }

        }
        else if(stackNumber == 2)
        {
            if(thirdStackStartPointer == (thirdStackEnd))
            {
                System.out.println("Stack Overflow Error !!!");
            }
            else{
                array[thirdStackStartPointer] = item;
                thirdStackStartPointer++;
            }

        }
        else
        {
            System.out.println("Stack Number entered is not correct");
        }

    }

    public static Integer popFromStack(int stackNumber)
    {
        if(stackNumber ==0)
        {
            if(firstStackStartPointer == 0 && array[firstStackStartPointer] ==- 100)
            {
                System.out.println("Stack Underflow Error !!!");
            }
            else{
                firstStackStartPointer--;
                int item = array[firstStackStartPointer];
                array[firstStackStartPointer] = -100;
                return item;
            }
        }
        else if(stackNumber == 1)
        {
            if(secondStackStartPointer == ((n/3)+1) && array[secondStackStartPointer] ==- 100)
            {
                System.out.println("Stack Underflow Error !!!");
            }
            else{
                secondStackStartPointer--;
                int item = array[secondStackStartPointer];
                array[secondStackStartPointer] = -100;
                return item;
            }

        }
        else if(stackNumber == 2)
        {
            if(thirdStackStartPointer == (((2*n)/3)+1) && array[thirdStackStartPointer] ==- 100)
            {
                System.out.println("Stack Underflow Error !!!");
            }
            else{
                thirdStackStartPointer--;
                int item = array[thirdStackStartPointer];
                array[thirdStackStartPointer] = -100;
                return item;
            }

        }
        else
        {
            System.out.println("Stack Number entered is not correct");
            return null;
        }
        return null;
    }

    public static void printStack(int StackNumber)
    {
        if(StackNumber == 0)
        {
            System.out.println("Stack Number 0");
            for(int i =0; i<firstStackStartPointer;i++){
                System.out.println(array[i]+ " ");
            }
        }
        if(StackNumber == 1)
        {
            System.out.println("Stack Number 1");
            for(int i =(n/3)+1; i<secondStackStartPointer;i++){
                System.out.println(array[i]+ " ");
            }
        }
        if(StackNumber == 2)
        {
            System.out.println("Stack Number 2");
            for(int i =((2*n/3)+1); i<thirdStackStartPointer;i++){
                System.out.println(array[i]+ " ");
            }
        }

    }

}
