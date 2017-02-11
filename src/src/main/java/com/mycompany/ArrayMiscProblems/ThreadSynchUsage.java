package com.mycompany.ArrayMiscProblems;

/**
 *
 * @author abhikbanerjee12
 */
class Callme{
  //this method can be made synchronized to have the correct output
  void callme(String msg){
    //synchronized void callme(String msg){
      System.out.println("["+msg);
      try{
      Thread.sleep(1000);
      }
      catch(InterruptedException e){
        System.out.println(e);
      }
      System.out.println("]");
  }
}

class Caller implements Runnable
{
  Callme target;
  String msg;
  Thread t;
  Caller(Callme cm, String m){
    target = cm;
    msg = m;
    t = new Thread(this);
    t.start();
  }
  public void run() {
    //Another way of synchronizing is by usage of a synchronized Block
    //synchronized(target){
      target.callme(msg);
    //}
  }
}

public class ThreadSynchUsage {
  public static void main(String args[]){
    Callme callm = new Callme();
    Caller cl1 = new Caller(callm,"Hello");
    Caller cl2 = new Caller(callm,"Abhik");
    Caller cl3 = new Caller(callm,"Banerjee");
    try{
      cl1.t.join();
      cl2.t.join();
      cl3.t.join();
    }
    catch(Exception e){
      System.out.println(e);
    }
  }
}
