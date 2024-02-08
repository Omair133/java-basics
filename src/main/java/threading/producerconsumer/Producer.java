package threading.producerconsumer;

public class Producer extends Thread {
    ProducerConsumer producerConsumer;

    Producer(ProducerConsumer producerConsumer) {
        this.producerConsumer = producerConsumer;
    }

    public void run() {
        int i = 0;
        while (true) {
            try {
                this.producerConsumer.produce(i++);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
