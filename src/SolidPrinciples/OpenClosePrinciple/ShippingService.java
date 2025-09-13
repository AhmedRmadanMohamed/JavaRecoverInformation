package SolidPrinciples.OpenClosePrinciple;

import java.util.HashMap;
import java.util.List;

public class ShippingService {
    public final HashMap<String, ShippingProvider> shippingProvider = new HashMap<>();

    public ShippingService(List<ShippingProvider> shipping) {
        for (ShippingProvider p : shipping) {
            shippingProvider.put(p.name(), p);
        }
    }


    public double estimate(String providerName, double weightKg) {
        ShippingProvider p = shippingProvider.get(providerName);
        if (p == null) throw new IllegalArgumentException("Unknown provider: " + providerName);
        return p.cost(weightKg);
    }
}

