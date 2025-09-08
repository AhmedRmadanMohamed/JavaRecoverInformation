package OOP.Abstraction;

public interface Methods {

    //  can create variable on interface but will be stable static final
    String string = "this is a final variable on interface";

    // can create  method static on interface and I can be used in any class
    static String mi() {
        return "this is a Static method on interface";
    }

    //  can create method default  on interface  can be extended and show  this method on any class and can change  this value on this method through averred
    default String string() {

        return "this is a default method on interface";
    }

    void print();

    String First_Name();
}
