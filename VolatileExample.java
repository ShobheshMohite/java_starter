// 41. What is the purpose of the volatile keyword in Java?
// Example:
// The volatile keyword ensures that the value of a variable is always read from 
// and written to the main memory,
//  providing visibility guarantees for changes to variables across threads.

public class VolatileExample extends Thread {
    private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("Thread is running");
        }
        System.out.println("Thread stopped");
    }

    public void stopRunning() {
        running = false;
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileExample thread = new VolatileExample();
        thread.start();
        Thread.sleep(5000);
        thread.stopRunning();
    }
}
