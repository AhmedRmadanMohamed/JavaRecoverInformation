package SolidPrinciples.OpenClosePrinciple.Example;

public interface ShippingProvider {
    String name();
    double cost(double weightKg);
}
