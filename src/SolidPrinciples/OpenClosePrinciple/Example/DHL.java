package SolidPrinciples.OpenClosePrinciple.Example;

class DHL implements ShippingProvider {
    @Override
    public String name() {
        return "DHL";
    }

    @Override
    public double cost(double w) {
        return 10 + 5 * w;
    }
}
