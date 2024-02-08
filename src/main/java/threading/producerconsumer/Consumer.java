package threading.producerconsumer;

public class Consumer extends Thread {
    ProducerConsumer producerConsumer;

    Consumer(ProducerConsumer producerConsumer) {
        this.producerConsumer = producerConsumer;
    }

    public void run() {
        while(true){
            try {
                this.producerConsumer.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
