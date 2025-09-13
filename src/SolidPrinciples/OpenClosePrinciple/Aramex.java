package SolidPrinciples.OpenClosePrinciple;

class Aramex implements ShippingProvider {
    @Override
    public String name() {
        return "Aramex";
    }

    @Override
    public double cost(double w) {
        return 12 + 4.5 * w;
    }
}
