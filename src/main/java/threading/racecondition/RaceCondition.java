package threading.racecondition;

public class RaceCondition {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread t1 = new Thread(sharedResource);
        Thread t2 = new Thread(sharedResource);
        Thread t3 = new Thread(sharedResource);

        t1.start();
        t2.start();
        t3.start();
    }
}
