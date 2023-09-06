package designpatterns.observer;

public class EmailSender implements Subscriber {
    EmailSender() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }
    @Override
    public void announce() {
        sendEmail();
    }

    private void sendEmail() {
        System.out.println("Sending email");
    }
}
