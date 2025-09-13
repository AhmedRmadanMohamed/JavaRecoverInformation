package SolidPrinciples.OpenClosePrinciple;

public class QuickShip implements ShippingProvider {
    @Override
    public String name() {
        return "QuickShip";
    }

    @Override
    public double cost(double weightKg) {
        return weightKg * 2;
    }
}
