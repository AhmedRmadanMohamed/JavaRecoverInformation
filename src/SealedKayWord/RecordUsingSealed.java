package SealedKayWord;

import java.util.List;
import java.util.Map;

public  record RecordUsingSealed() implements  SealedInterFace {
    @Override
    public void Method1() {
        System.out.println("Method1 on --------------> RecordUsingSealed ");
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
