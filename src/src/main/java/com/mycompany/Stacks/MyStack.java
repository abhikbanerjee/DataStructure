/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Stacks;

import com.mycompany.LinkedList.*;

/**
 *
 * @author abhikbanerjee12
 */
public interface MyStack {
	public void push(int item);
	public int pop();
	public int topElement();
	public int size(MyStack s);
	public boolean isEmpty(MyStack s);
	public void printStack();
}
