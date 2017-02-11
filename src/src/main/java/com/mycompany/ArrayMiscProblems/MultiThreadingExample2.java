/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ArrayMiscProblems;

/**
 *
 * @author abhikbanerjee12
 */
class NewThread1 implements Runnable{
  Thread t;
  String threadName;
  
  NewThread1(){
    
    t = new Thread(this," Dummy Thread NewThread1 ");
    t.start();
    System.out.println("Ending the execution of Blank Constructor in NewThread 1");
  }
  
  NewThread1(String threadName){
    
    t = new Thread(this,threadName);
    t.start();
    System.out.println("Ending the execution of Parameterized Constructor in NewThread 1");

  }
  public void run() {
    
    System.out.println(" Inside the Run method of the class NewThread1 ....  "+Thread.currentThread().getName());
    for(int i =0;i<5;i++){
      System.out.println("Executing loop number inside NewThread1 "+Thread.currentThread().getName()+" : "+i);
      try{
        Thread.sleep(1000);
      }
      catch(InterruptedException e){
        System.out.println(e);
      }
    }
    System.out.println("Ending the execution of run() method in NewThread 1 "+Thread.currentThread().getName());
    
  }
  
}

class NewThread2 implements Runnable{
  Thread t;
  String threadName;
  
  NewThread2(){
    
//    t = new Thread(" Dummy Thread NewThread2 ");
//    t.start();
//    System.out.println("Ending the execution of Constructor in NewThread 2");
    
  }
  
  NewThread2(String threadName){
    
//    t = new Thread(this,threadName);
//    t.start();
    
  }
  public void run() {
    
//    System.out.println("Inside the Run method of the class NewThread2 .... ");
//    for(int i =0;i<5;i++){
//      System.out.println("Executing loop number inside NewThread2 "+i);
//      try{
//        Thread.sleep(1000);
//      }
//      catch(InterruptedException e){
//        System.out.println(e);
//      }
//    }
//    System.out.println("Ending the execution of run() method in NewThread 2");
    
  }
  
}


public class MultiThreadingExample2 {
  
  public static void main(String args[]){
    
    System.out.println("Starting the Main Thread ...... ");
    NewThread1 th1 = new NewThread1();
    NewThread1 th2 = new NewThread1("Abhik thread 2");
    NewThread1 th3 = new NewThread1("Abhik thread 3");
    
    System.out.println("***************************");
    System.out.println("Thread Alive "+th1.threadName+" : "+th1.t.isAlive());
    System.out.println("Thread Alive "+th2.threadName+" : "+th2.t.isAlive());
    System.out.println("Thread Alive "+th3.threadName+" : "+th3.t.isAlive());
    System.out.println("***************************");
    try{
      th1.t.join();
      th2.t.join();
      th3.t.join();
    }
    catch(InterruptedException e){
      System.out.println(e);
    }
    System.out.println("***************************");
    System.out.println("Thread1 Alive "+th1.t.isAlive());
    System.out.println("Thread1 Alive "+th2.t.isAlive());
    System.out.println("Thread1 Alive "+th3.t.isAlive());
    System.out.println("***************************");
    System.out.println("Ending the Main Thread ...... ");
    
  }
  
}
