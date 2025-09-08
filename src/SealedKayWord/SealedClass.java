package SealedKayWord;



import java.util.List;
import java.util.Map;

 sealed class SealedClass implements SealedInterFace permits  SubClass1, SubClass2 {


    public void MainClassMethod() {

        System.out.println("MainClassMethod On Sealed class");


    }

    @Override
    public void Method1() {
        System.out.println("Method On Sealed  in Interface on ---------->  SealedClass method1");
    }

    @Override
    public String Method2() {
        return "";
    }

    @Override
    public List<String> Method3() {
        return List.of();
    }

    @Override
    public int Method4() {
        return 0;
    }

    @Override
    public Map<String, String> Method5() {
        return Map.of();
    }
}
