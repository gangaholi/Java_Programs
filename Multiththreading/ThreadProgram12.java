class MyBaseThread extends Thread {
    // Base class constructor
    public MyBaseThread(String name) {
        super(name);
    }
@Override
    public void run() 
    {   for (int i = 1; i <= 5; i++) 
       {  System.out.println(Thread.currentThread().getName() + ": Count " + i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread extends MyBaseThread 
{   public MyThread(String name) 
    {    super(name);
        start();
    }

   @Override
    public void run() 
    {
        for (int i = 1; i <= 5; i++) 
        {  System.out.println(Thread.currentThread().getName() + ": Child Count " + i);
            try {
         	   Thread.sleep(500);
                } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadProgram12 
{   public static void main(String[] args) 
    {  MyThread myThread = new MyThread("Child Thread");
	for (int i = 1; i <= 5; i++) 
        {  System.out.println(Thread.currentThread().getName() + ": Main Count " + i);
            try {
                 Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            myThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread exiting.");
    }
}

