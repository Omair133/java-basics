package designpatterns.factory.button;

public class AndroidButton implements Button {
    @Override
    public void createButton() {
        System.out.println("Android Button");
    }
}
