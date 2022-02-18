package questionOne;

public class IntSleepMain {
    public static void main(String[] args) throws InterruptedException {
        IntSleep intSleep = new IntSleep();
        intSleep.start();
        Thread.sleep(10);
        intSleep.wakeUp();
        Thread.currentThread().interrupt();
    }
}
