package OOP.Aggregation;



import java.util.List;


public class Shop {
    String name;
    private List<Laptop> laptops;
    private  List<Accessories> accessories;

    public Shop(String name, List<Laptop> laptops, List<Accessories> accessories) {
        this.name = name;
        this.laptops = laptops;
        this.accessories = accessories;
    }



    public void getLaptops() {
        System.out.println(name);
        for (Laptop laptop : laptops) {
            laptop.display(laptop.getCode(),
                    laptop.getType(), laptop.getPrice());
        }


    }

    public void getAccessories() {
        System.out.println(name);
        for (Accessories accessor : accessories) {
            accessor.AddAccessories(accessor.getAccessoriesCode(), accessor.getAccessoriesName(),
                    accessor.getAccessoriesType(), accessor.getAccessoriesPrice());
        }


    }
}
