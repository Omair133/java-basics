package designpatterns.decorator;

public class VanillaScoop implements IceCreamConeConstituents {

    private IceCreamConeConstituents iceCreamConeConstituents;

    public VanillaScoop(IceCreamConeConstituents iceCreamConeConstituents) {
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }
    @Override
    public int getCost() {
        return iceCreamConeConstituents.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return iceCreamConeConstituents.getDescription() + " + Vanilla Scoop";
    }
}
