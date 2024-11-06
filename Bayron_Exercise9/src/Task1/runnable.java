package Task1;

class MyThreadTask extends Thread {
 @Override
 public void run() {
     System.out.println("Thread Task is running.");
 }
}

public class runnable {
 public static void main(String[] args) throws InterruptedException {
     MyThreadTask threadTask = new MyThreadTask();
     threadTask.start();
     
     class MyRunnableTask implements Runnable {
         @Override
         public void run() {
             System.out.println("Runnable Task is running.");
         }
     }

     MyRunnableTask runnableTask = new MyRunnableTask();
     Thread runnableThread = new Thread(runnableTask);
     runnableThread.start();

     threadTask.join(); 
     runnableThread.join(); 
     
     final Object lock = new Object();
     synchronized (lock) {
         System.out.println("Synchronized block executed.");
     }

     Thread.sleep(1000); 
     System.out.println("Execution paused for 1 second.");
 }
}
