package designpatterns.factory.button;

public class IOSButton implements Button {
    @Override
    public void createButton() {
        System.out.println("IOS Button");
    }
}
