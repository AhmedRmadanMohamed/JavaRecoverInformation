package SolidPrinciples.LiskovSubstitutionPrinciple;

public class Main {


    public static void main(String[] args) {
        BaseMethods baseMethods = new methodActions();
        baseMethods.PrintMethod(10);
        SubMethods subMethods = new methodActions();
        subMethods.PrintMethod();
        subMethods.PrintMethod(10);


    }
}
