package OOP.Aggregation;

public class Accessories {

    private int AccessoriesCode;
    private String AccessoriesName;
    private String AccessoriesType;
    private double AccessoriesPrice;

    public Accessories(int AccessoriesCode, String AccessoriesName, String AccessoriesType, double AccessoriesPrice) {
        this.AccessoriesCode = AccessoriesCode;
        this.AccessoriesName = AccessoriesName;
        this.AccessoriesType = AccessoriesType;
        this.AccessoriesPrice = AccessoriesPrice;
    }

    public String getAccessoriesType() {
        return AccessoriesType;
    }

    public void setAccessoriesType(String accessoriesType) {
        AccessoriesType = accessoriesType;
    }

    public String getAccessoriesName() {
        return AccessoriesName;
    }

    public void setAccessoriesName(String accessoriesName) {
        AccessoriesName = accessoriesName;
    }

    public double getAccessoriesPrice() {
        return AccessoriesPrice;
    }

    public void setAccessoriesPrice(double accessoriesPrice) {
        AccessoriesPrice = accessoriesPrice;
    }


    public int setAccessoriesCode(int AccessoriesCode) {

        this.AccessoriesCode = AccessoriesCode;
        return AccessoriesCode;
    }

    public int getAccessoriesCode() {
        return AccessoriesCode;
    }


    public void AddAccessories(int AccessoriesCode, String AccessoriesName, String AccessoriesType, double AccessoriesPrice) {
        System.out.println("this is a All Accessories" + AccessoriesCode + " " + AccessoriesName + " " + AccessoriesType + " " + AccessoriesPrice);
    }
}
