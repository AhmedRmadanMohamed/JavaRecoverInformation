package OOP.Polymorphism;

public class Child1 extends BaseClass {

    @Override
    public void baseMethod() {
        System.out.println("Child1 baseMethod");
    }

    @Override
    public void baseMethod(String string) {
        super.baseMethod(string);
    }
}
