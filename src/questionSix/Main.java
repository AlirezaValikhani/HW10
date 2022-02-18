package questionSix;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread execution starts");

        StarvationClass thread1 = new StarvationClass();
        thread1.setPriority(10);
        StarvationClass thread2 = new StarvationClass();
        thread2.setPriority(9);
        StarvationClass thread3 = new StarvationClass();
        thread3.setPriority(8);
        StarvationClass thread4 = new StarvationClass();
        thread4.setPriority(7);
        StarvationClass thread5 = new StarvationClass();
        thread5.setPriority(6);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();

        System.out.println("Main thread execution completes");
    }
}
