package AbstractKayWord;


public class Main {
    public static void main(String[] args) {
        AbstractClassMain Implement1 = new AbstractClassImplement1();
        Implement1.Method2();
        Implement1.Method1();
        Implement1 = new AbstractClassImplement2();
        Implement1.Method1();
        AbstractClassImplement1 Implement2 = new AbstractClassImplement1();
        Implement2.Method1();


    }
}