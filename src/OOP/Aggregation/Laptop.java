package OOP.Aggregation;
public class Laptop {

    private int code;
    private String Type;
    private double price;
    Laptop(int code, String Type, double price) {
        this.code = code;
        this.Type = Type;
        this.price = price;
    }
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

   public void display(int code , String type , double price ) {
    System.out.println("this name and price is "+type+ "   "+  code+"   " + price + "  "+" and code is " + code);
}


}
