// This program is not synchronized.
class Callme {
   synchronized void call(String msg, String name) 
  {
   System.out.print(name+" threading is executing.... [  " + msg);
   try {
         Thread.sleep(1000);
      } catch(InterruptedException e) {
      System.out.println("Interrupted");
      }
      System.out.println("  ]  ");
  }
}


class Caller implements Runnable {
   String msg;
   Callme target;
   String name;
   Thread t;
   public Caller(Callme targ, String s, String threadName) {
      target = targ;
      msg = s;
      name=threadName;
      t = new Thread(this, name);
      
      t.start();
   }
   public void run() {
      
      target.call(msg, name);
     
   }
}

public class Synch {
   public static void main(String args[]) {
      Callme target = new Callme();
      Caller ob1 = new Caller(target, "Hello", "1 ");
      Caller ob2 = new Caller(target, "Synchronized", "2 ");
      Caller ob3 = new Caller(target, "World", "3 ");
      Caller ob4 = new Caller(target, "Lets", "4");
      Caller ob5 = new Caller(target, "work it", "5 ");
      Caller ob6 = new Caller(target, "out.... Very good ...", "6 ");



      // wait for threads to end
      try {
         ob1.t.join();
         ob2.t.join();
         ob3.t.join();
      } catch(InterruptedException e) {
      System.out.println("Interrupted");
      }
   }
}