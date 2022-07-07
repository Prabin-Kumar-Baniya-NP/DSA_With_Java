
class MultithreadingDemoOne extends Thread {
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}

class MultithreadingDemoTwo implements Runnable {
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}

public class ThreadingBasics {
    public static void main(String[] args) {
        // Case 1: Extending the thread class
        MultithreadingDemoOne object1 = new MultithreadingDemoOne();
        object1.start();
        // Case 2: Implementing the Runnable interface
        MultithreadingDemoTwo t1 = new MultithreadingDemoTwo();
        Thread object2 = new Thread(t1);
        object2.start();
    }
}
