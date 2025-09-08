package RecordKayWord;

import java.util.List;
import java.util.Map;

public record RecordForExample(String Name, int Age) implements InterfaceForImplementRecord {

    static int i = 0;
    public RecordForExample(String string) {
        this(string, 10);
    }


    @Override
    public void Method1() {
        System.out.println("Method1 in RecordForExample");
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
