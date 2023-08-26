package designpatterns.strategy;

public class PathCalculatorFactory {
    public static PathCalculatorStrategy getPathCalculator(String mode) {
        return switch (mode) {
            case "walk" -> new WalkPathCalculatorStrategy();
            case "car" -> new CarPathCalculatorStrategy();
            default -> new BikePathCalculatorStrategy();
        };
    }
}
