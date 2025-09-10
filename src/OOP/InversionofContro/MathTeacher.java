package OOP.InversionofContro;

public class MathTeacher implements Teacher {
    @Override
    public void Teacher( String name ) {
        System.out.println("-------------MathTeacher Class----------->   "+name);
    }
}
