// Create a second thread by extending Thread
class MyThread extends Thread 
{  int n;
   MyThread(String name, int n) 
   {  super(name);
      this.n = n;
      System.out.println("Child thread:    " + this);
      start(); // Start the thread
   }
   // This is the entry point for the second thread.
   public void run() 
   {  int fact=1;
      String name=getName();
      try 
      {  for(int i = n; i > 0; i--) 
         {    fact=fact*i;
              System.out.println(name+" Child Thread:  " + i);
              Thread.sleep(500);
         }
      }
      catch (InterruptedException e) 
      {   System.out.println("Child interrupted.");
      }
      System.out.println("Exiting "+ name +" child thread. Fact of "+n+ "="+fact);
   }
}
class ThreadProgram12 
{   public static void main(String args[]) 
    {
       MyThread t1 = new MyThread("1", 5); 
       MyThread t2 = new MyThread("2", 6);
       MyThread t3 = new MyThread("3", 7);
       try 
       {  for(int i = 5; i > 0; i--) 
         {  System.out.println("Main Thread: " + i);
            Thread.sleep(1000);
         }
      }
      catch (InterruptedException e) 
      {    System.out.println("Main thread interrupted.");
      }
      System.out.println("Main thread exiting.");
   }
}