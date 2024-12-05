// This program is not synchronized.
class X 
{
   void call(String msg) 
   {
       System.out.print("[  ** opening  " + msg);
       try {
          Thread.sleep(1000);
        } catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println("  closing ***]");
   }
   void draw(String msg) 
   {   int x=10;
       System.out.print("*** " + msg);
       try {
          Thread.sleep(1000);
          x=x+100;
        } catch(InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.println(" x= "+x);
   }
}

class Caller implements Runnable 
{  String msg;
   X target;
   Thread t;
   public Caller(X targ, String s) 
   {  target = targ;
      msg = s;
      t = new Thread(this);
      t.start();
   }
   public void run() 
   {   target.call(msg);
   }
}
public class Synch 
{   public static void main(String args[]) 
    {  X target = new X();
       Caller ob1 = new Caller(target, "Hello");
       Caller ob2 = new Caller(target, "Synchronized");
       Caller ob3 = new Caller(target, "World");
       // wait for threads to end
       try {
         ob1.t.join();
         ob2.t.join();
         ob3.t.join();
       } catch(InterruptedException e) 
         {
            System.out.println("Interrupted");
       }
   }
}