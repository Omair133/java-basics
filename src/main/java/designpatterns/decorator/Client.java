package designpatterns.decorator;

public class Client {
    public static void main(String[] args) {
        IceCreamConeConstituents iceCreamConeConstituents = new ChocoChips(new StrawberryScoop(new ChocolateCone()));
        System.out.println(iceCreamConeConstituents.getDescription());
        System.out.println(iceCreamConeConstituents.getCost());
    }
}
