package questionSix;

public class StarvationClass extends Thread{
    static int threadCount = 1;
    public void run() {
        System.out.println("Number " + threadCount + " Child Thread execution starts");
        System.out.println("Child thread execution completes");
        threadCount++;
    }
}
