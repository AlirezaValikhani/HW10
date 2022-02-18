package questionFive;

public class DeadLock2 implements Runnable{
    private String lock1 = "lock1";
    private String lock2 = "lock2";

    @Override
    public void run() {
        synchronized (lock2) {
            System.out.println("Thread 2 locked value2");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 2 waiting for value1 lock");
            synchronized (lock1) {
                System.out.println("Thread 2 locked value1");
            }
        }
    }
}
