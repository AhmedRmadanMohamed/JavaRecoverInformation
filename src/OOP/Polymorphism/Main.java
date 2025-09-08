package OOP.Polymorphism;


public class Main {
    public static void main(String[] args) {

        BaseClass baseClass1 = new BaseClass();
        baseClass1.baseMethod();
        baseClass1.baseMethod("this is a base class");
        System.out.println();
        BaseClass baseClass = new Child1();
        baseClass.baseMethod();
        baseClass.baseMethod("this is a overed method child1");
        System.out.println();
        BaseClass baseClass2 = new Child2();
        baseClass2.baseMethod();
        baseClass2.baseMethod("this is a overed method child2");

    }
}
