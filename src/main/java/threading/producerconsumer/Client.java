package threading.producerconsumer;

public class Client {
    public static void main(String[] args) {

        ProducerConsumer producerConsumer = new ProducerConsumer();
        Producer producer = new Producer(producerConsumer);
        Consumer consumer = new Consumer(producerConsumer);
        producer.start();
        consumer.start();
    }
}
