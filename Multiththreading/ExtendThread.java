// Create a second thread by extending Thread
class MyThread extends Thread 
{
   MyThread(String name) {
   super(name);
System.out.println("Child thread:    " + this);
start(); // Start the thread
}
// This is the entry point for the second thread.
public void run() {
int f=1;
Thread t=Thread.currentThread();
String name=t.getName();
try {
    for(int i = 5; i > 0; i--) {
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
class ThreadProgram12 {
public static void main(String args[]) {

MyThread t =new MyThread("1"); // create a new thread
new NewThread("2");
new NewThread("3");
new NewThread("4");
try {

for(int i = 5; i > 0; i--) {
System.out.println("Main Thread: " + i+" Thread State="+ new Thread().getState());

Thread.sleep(1000);
}
} catch (InterruptedException e) {
System.out.println("Main thread interrupted.");
}
System.out.println("Main thread exiting.");
}
}