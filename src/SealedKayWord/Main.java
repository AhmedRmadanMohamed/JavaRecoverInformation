package SealedKayWord;

public class Main {


    public static void main(String[] args) {
        SealedClass c = new SealedClass();
        SealedClass c1 = new SubClass1();
        SealedClass c2 = new SubClass2();
        RecordUsingSealed r = new RecordUsingSealed();
        c.Method1();
        c1.Method1();
        c2.Method1();
        r.Method1();
    }
}
