package questionOne;

public class IntSleep extends Thread{

    public void run() {
        synchronized (this){
            try {
                Thread.sleep(2000);
                wait();
                for (int i = 0; i < 20; i++) {
                    Thread.sleep(100);
                    System.out.println("Hello");
                }
                System.out.println("After wait");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public synchronized void wakeUp() {
        System.out.println("Calling notify");
        notify();
    }
}
