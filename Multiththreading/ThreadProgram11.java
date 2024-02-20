class MyThread implements Runnable 
{  Thread t;
   String name;
   MyThread(String name)   
   {
      this.name=name;
      t= new Thread(this,name);
      System.out.println("Child created :"+t);
      t.start();
   } 
    public void run() {
        Thread t= Thread.currentThread();
        String threadName =t.getName();
  
        try {
             System.out.println(threadName  + " thread is running.");
             for(int i=1;i<5;i++)
             {  System.out.println(" I will study very well  from thread "+threadName);
               // Simulate some work by sleeping for 500 milliseconds
              Thread.sleep(500);
             } 
            } catch (InterruptedException e) {
             System.out.println("Exceptiob caught "+e);
             e.printStackTrace();
        }
        System.out.println(threadName + " is finished.");
    }
}

public class ThreadProgram11 {
    public static void main(String[] args) {
        // Create instances of the MyRunnable class
        MyThread thread1  = new MyThread("1");
        MyThread thread2  = new MyThread("2");
        MyThread thread3  = new MyThread("3");
        // Main thread continues its work
        System.out.println("Main thread is running.");

        // Wait for all threads to finish
        try {
            thread1.t.join();
            thread2.t.join();
            thread3.t.join(); 
           } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads have finished. Main thread exiting.");
    }
}