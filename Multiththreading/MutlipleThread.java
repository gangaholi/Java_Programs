// Create a second thread by extending Thread
class NfibNumberThread extends Thread 
{
   NfibNumberThread(String name) 
   {   super(name);
       System.out.println("Child thread:    " + this);
       start(); // Start the thread
   }
   // This is the entry point for the second thread.
   public void run() 
   {   int f=1; int n=0;
       Thread t=Thread.currentThread();
       String name=t.getName();
       try 
       {  
            n = nfib(10);
            Thread.sleep(500);
          
        } 
        catch (InterruptedException e) 
        {  System.out.println("Child interrupted.");
        }
        System.out.println("Exiting "+ name +" child thread. Nth fib number="+n);
   }
   int nfib(int n)
   {
      if(n==1) return 0;
      if(n==2) return 1;
      return( nfib(n-1)+nfib(n-2));
   }
}

class FactThread extends Thread 
{   FactThread(String name) 
    {    super(name);
         System.out.println("Child thread:    " + this);
         start(); // Start the thread
    }
      // This is the entry point for the second thread.
     public void run() 
     {   int f=1;
         Thread t=Thread.currentThread();
         String name=t.getName();
         try 
         {  for(int i = 5; i > 0; i--) 
            {
                f=f*i;
                //System.out.println(name+"   Child Thread:  " + i);
                Thread.sleep(500);
            }
         } catch (InterruptedException e) {
               System.out.println("Child interrupted.");
            }
         System.out.println("Exiting "+ name +" child thread. f="+f);
      }
}

public class MutlipleThread 
{
   public static void main(String args[]) 
   { 
         Thread t =new FactThread("Fact thread "); // create a new thread
         new FactThread("Fact thread2 ");
         new NfibNumberThread("Fib Thread");
         new NfibNumberThread("Fib Thread1");
         
         try 
         {    for(int i = 5; i > 0; i--) 
              {     System.out.println("Main Thread: " + i);
                     Thread.sleep(1000);
              }
         } catch (InterruptedException e) {
         System.out.println("Main thread interrupted.");
      }
      System.out.println("Main thread exiting.");
   }
}