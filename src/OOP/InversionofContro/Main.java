package OOP.InversionofContro;

public class Main {

    public static void main(String[] args) {
        Teacher MathTeacher = new MathTeacher();
        Teacher ArabicTeacher = new ArabicTeacher();
        School school = new School(MathTeacher);
        school.Teacher("Ahmed Teacher");
        School school2 = new School(ArabicTeacher);
        school2.Teacher("Ahmed Teacher");

    }
}
