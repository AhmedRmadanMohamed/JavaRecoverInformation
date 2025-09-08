package OOP.Polymorphism;

public class Child2 extends BaseClass {

    @Override
    public void baseMethod() {
        System.out.println("Child2 baseMethod");
    }

    @Override
    public void baseMethod(String string) {

        super.baseMethod(string);

    }
}
