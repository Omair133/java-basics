package designpatterns.observer;

public class InvoiceGenerator implements Subscriber {
    InvoiceGenerator () {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }
    @Override
    public void announce() {
        generateInvoice();
    }

    private void generateInvoice() {
        System.out.println("Generating Invoice");
    }
}
