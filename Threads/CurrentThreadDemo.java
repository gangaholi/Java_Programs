// Controlling the main Thread.
class CurrentThreadDemo
{
   public static void main(String args[]) 
   {
      Thread t = Thread.currentThread();
      System.out.println("Current thread: " + t);
      String name=t.getName();
      System.out.println("Current Thread name : " + name);
      System.out.println("Current Thread Sate : " +t.getState());
      // change the name of the thread
      t.setName("My_Thread");
      System.out.println("After name change: " + t);
   try {
         for(int n = 5; n > 0; n--) 
         {
            System.out.println(n);
            Thread.sleep(100);
         }
       } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
         }
         System.out.println("Current Thread Sate : " +t.getState());
   }
}