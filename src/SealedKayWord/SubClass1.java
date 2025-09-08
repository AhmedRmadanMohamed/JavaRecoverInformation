package SealedKayWord;

import java.util.List;
import java.util.Map;

public final class SubClass1 extends SealedClass implements SealedInterFace {


    public void SubClass1Method1() {

        System.out.println("Method On ------------->    On SubClass1Method1");


    }

    @Override
    public void Method1() {
        System.out.println("Method On ------------->  in Interface  On SubClass1Method1");
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
