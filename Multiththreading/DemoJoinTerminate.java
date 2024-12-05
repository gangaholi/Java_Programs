class NewThread_T implements Runnable 
{
   String name; // name of thread
   Thread t;
   NewThread_T(String threadname)
   {  name = threadname;
      t = new Thread(this, name);
      System.out.println("New thread: " + t);
      t.start(); // Start the thread
   }
   // This is the entry point for thread.
   public void run() {
   try {
         for(int i = 5; i > 0; i--) {
            System.out.println(name + ": " + i);
            Thread.sleep(1000);
         }
      } catch (InterruptedException e) {
      System.out.println(name + " interrupted.");
      }
      System.out.println(name + " exiting.");
   }
}

public class DemoJoinTerminate {
   public static void main(String args[]) {
      NewThread_T ob1 = new NewThread_T("One");
      NewThread_T ob2 = new NewThread_T("Two");
      NewThread_T ob3 = new NewThread_T("Three");
      
      System.out.println("Thread One is alive: "+ ob1.t.isAlive());
      System.out.println("Thread Two is alive: "+ ob2.t.isAlive());
      System.out.println("Thread Three is alive: "+ ob3.t.isAlive());
      // wait for threads to finish
      try {
         System.out.println("Waiting for threads to finish.");
         ob1.t.join();
         ob2.t.join();
         ob3.t.join();
      } catch (InterruptedException e) {
         System.out.println("Main thread Interrupted");
      }
      System.out.println("Thread One is alive: "+ ob1.t.isAlive());
      System.out.println("Thread Two is alive: "+ ob2.t.isAlive());
      System.out.println("Thread Three is alive: "+ ob3.t.isAlive());
      System.out.println("Main thread exiting.");
   }
}