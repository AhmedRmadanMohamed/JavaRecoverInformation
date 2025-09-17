package SolidPrinciples.LiskovSubstitutionPrinciple;

public class methodActions implements SubMethods {
    @Override
    public void PrintMethod() {
        System.out.println("Printing Method");
    }


    @Override
    public void PrintMethod(int number) {
        System.out.println(number);
    }
}
