package threading.producerconsumer;

public class ProducerConsumer {
    int n;
    boolean produce = true;

    synchronized public void produce(int n) throws InterruptedException {
        if (produce) {
            this.n = n;
            System.out.println("Produced : " + this.n);
            produce = !produce;
            notify();
        } else {
            wait();
        }
    }

    synchronized public void consume() throws InterruptedException {
        if (!produce) {
            System.out.println("Consumed : " + this.n);
            produce = !produce;
            notify();
        } else {
            wait();
        }
    }
}
