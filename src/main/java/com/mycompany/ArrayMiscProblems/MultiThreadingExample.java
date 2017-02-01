/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ArrayMiscProblems;


/**
 *
 * @author abhikbanerjee12
 */
public class MultiThreadingExample {
  
  public static void main(String args[]){
    
    //Example 1
    //threadExample1();
    
    //Example 2
    threadExample2();
    
  }
  
  public static void threadExample1(){
    Thread t = Thread.currentThread();
    System.out.println(t.getName());
    t.setName("Thread Renamed");
    System.out.println(t+"-----------");
    System.out.println(t.getName());
    
    for(int i =1;i<5;i++){
      try{
        Thread.sleep(300);
        System.out.println("Loop number "+i);
      }
      catch(InterruptedException e){
        System.out.println(e);
      }
    }
  }
  
  public static void threadExample2(){
    System.out.println("Starting main thread ");
    new NewThread();
    for(int i = 0;i<5;i++){
      try{
        System.out.println("Main Thread "+i);
        Thread.sleep(500);
      }
      catch(Exception e ){
        System.out.println(e);
      }
    }
    System.out.println("Ending main thread ");
  }
  
}

class NewThread implements Runnable{
  Thread t;
  NewThread(){
    t = new Thread(this,"Demo Thread");
    System.out.println("Thread name "+t);
    t.start();
  }
  public void run() {
    System.out.println("Inside the run method ");
    for(int i=0;i <5 ; i++){
      System.out.println("child thread - "+i);
      try{
      Thread.sleep(1000);
      }
      catch(Exception e ){
        System.out.println(e);
      }
    }
    
  }
  
}
