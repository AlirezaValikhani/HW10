package questionFive;

public class DeadLock1 implements Runnable {
    private String lock1 = "lock1";
    private String lock2 = "lock2";

    @Override
    public void run() {
        synchronized(lock1) {
            System.out.println("Thread 1 locked value1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1 waiting for value2 lock");
            synchronized(lock2) {
                System.out.println("Thread 1 locked value2");
            }
        }
    }
}
