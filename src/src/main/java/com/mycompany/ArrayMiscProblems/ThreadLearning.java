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
class MyThread implements Runnable{
  Thread t;
  public MyThread(){
    t = new Thread(this,"Demo Thread");
    System.out.println("Child Thread :"+t);
    t.start();
  }
  
  public void run() {
    try{
      for(int i =5; i >0 ; i --){
        System.out.println("Child Thread : "+i);
        Thread.sleep(100);
      }
    }
    catch(Exception e){
      System.out.println(e);
    }
    System.out.println("Exiting Child Thread");
    
  }
}


public class ThreadLearning{
  
  public static void main(String args[]){
    new MyThread();
    try{
      for(int i = 5; i >0; i --){
        System.out.println("Main Thread "+i);
        Thread.sleep(50);
      }
    }
    catch(Exception e){
      System.out.println(e);
    }
    System.out.println("Main Thread Exiting");
  }
  
}
