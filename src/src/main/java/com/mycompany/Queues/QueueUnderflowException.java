package com.mycompany.Queues;

public class QueueUnderflowException extends Exception {
	QueueUnderflowException(){
		System.out.println("There are no elements in the Queue. Hence it caused a Queue underflow Exception");
	}
	QueueUnderflowException(String msg){
		System.out.println("Queue underflow Esxception "+msg);
	}
}
