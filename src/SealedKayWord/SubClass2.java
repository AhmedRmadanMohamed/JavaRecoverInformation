package SealedKayWord;

public final class SubClass2 extends SealedClass implements SealedInterFace {


    public void SubClass1Method2() {

        System.out.println("Method On ------------->    SubClass1Method2");


    }


    @Override
    public void Method1() {

        System.out.println("Method   ------------->  in  interface on   SubClass2 method1");
    }
}
