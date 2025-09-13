package SolidPrinciples.OpenClosePrinciple;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShippingService shippingService = new ShippingService(List.of(new DHL(), new Aramex() , new QuickShip()));
        System.out.println( shippingService.estimate("QuickShip" , 10));

    }
}
