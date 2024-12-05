// Create a  thread by extending Thread
class NewThread extends Thread 
{   NewThread()
    {	super("Demo Thread");
	System.out.println("Child thread: " + this);     	
               start(); // Start the thread
      } 
    public void run() {
      try {       
        for(int i = 5; i > 0; i--) 
       {    System.out.println("Child Thread: " + i);   		
		      Thread.sleep(1000); 	   
       }
	} catch (InterruptedException e) {   
		System.out.println("Child interrupted.");	}
	System.out.println("Exiting child thread.");           
    }
}


public class ExtendThread1 {
     public static void main(String args[]) {
           new NewThread(); // create a new thread
          try
         {    for(int i = 5; i > 0; i--) 
              {      System.out.println("Main Thread: " + i);
                       Thread.sleep(1000);
               }
          } catch (InterruptedException e) {
                 System.out.println("Main thread interrupted.");     }
       System.out.println("Main thread exiting.");
    }
}
