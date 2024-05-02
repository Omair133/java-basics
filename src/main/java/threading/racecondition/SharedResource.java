package threading.racecondition;

public class SharedResource implements Runnable {
    int counter = 0;

    void increment() {
        counter++;
    }

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("Value before increment" + counter);
            increment();
            System.out.println("Value after increment" + counter);
        }
    }
}
