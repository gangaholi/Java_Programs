// Create a second thread by extending Thread
class MyThread1 extends Thread 
{
   MyThread1(String name) 
   {
     super(name);
     System.out.println("Child thread:    " + this);
     start(); // Start the thread
    }
    public void run() 
    {
         int f=1;
         Thread t=Thread.currentThread();
         String name=t.getName();
         try {
            for(int i = 5; i > 0; i--) 
            {
                 f=f*i;
                 System.out.println(name+"   Child Thread:  " + i);
                 Thread.sleep(500);
            }
            } catch (InterruptedException e) {
                  System.out.println("Child interrupted.");
      }
      System.out.println("Exiting "+ name +" child thread. f="+f);
   }
}

class ExtendThread11 {
   public static void main(String args[]) 
   {
      MyThread1 t =new MyThread1("1"); // create a new thread
                   new MyThread1("2");
                   new MyThread1("3");
                   new MyThread1("4");
      try {
            for(int i = 5; i > 0; i--) 
            {
               System.out.println("Main Thread: " + i);
               Thread.sleep(1000);
            }  
      } catch (InterruptedException e) {
          System.out.println("Main thread interrupted.");
    }
    System.out.println("Main thread exiting.");
  }
}