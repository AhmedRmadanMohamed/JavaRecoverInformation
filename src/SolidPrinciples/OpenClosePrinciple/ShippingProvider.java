package SolidPrinciples.OpenClosePrinciple;

public interface ShippingProvider {
    String name();
    double cost(double weightKg);
}
