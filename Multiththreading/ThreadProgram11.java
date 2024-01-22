class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is running.");
            // Simulate some work by sleeping for 500 milliseconds
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " is finished.");
    }
}

public class ThreadProgram11 {
    public static void main(String[] args) {
        // Create instances of the MyRunnable class
        MyRunnable myRunnable1 = new MyRunnable();
        MyRunnable myRunnable2 = new MyRunnable();
        MyRunnable myRunnable3 = new MyRunnable();

        // Create threads and associate them with the MyRunnable instances
        Thread thread1 = new Thread(myRunnable1, "Thread 1");
        Thread thread2 = new Thread(myRunnable2, "Thread 2");
        Thread thread3 = new Thread(myRunnable3, "Thread 3");

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Main thread continues its work
        System.out.println("Main thread is running.");

        // Wait for all threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads have finished. Main thread exiting.");
    }
}