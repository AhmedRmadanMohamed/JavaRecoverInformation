package OOP.Aggregation;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<>();
        List<Accessories> accessories1 = new ArrayList<>();
        laptops.add(new Laptop(1, "hp", 1200000));
        laptops.add(new Laptop(2, "hp", 1200000));
        accessories1.add(new Accessories(1, "Ahmed", "AHMED", 1222098));
        Shop shop = new Shop("name of store ", laptops, accessories1);

        shop.getLaptops();
        shop.getAccessories();

    }
}
