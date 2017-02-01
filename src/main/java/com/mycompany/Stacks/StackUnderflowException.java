package com.mycompany.Stacks;

public class StackUnderflowException extends Exception {
	StackUnderflowException(){
		System.out.println("There are no elements in the stack. Hence it caused a stack underflow Esxception");
	}
	StackUnderflowException(String msg){
		System.out.println("Stack underflow Esxception "+msg);
	}
}
