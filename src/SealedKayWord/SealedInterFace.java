package SealedKayWord;

import java.util.List;
import java.util.Map;

public sealed interface SealedInterFace permits SubClass1 , SealedClass , SubClass2  , RecordUsingSealed{

    void Method1();

    String Method2();

    List<String> Method3();

    int Method4();

    Map<String, String> Method5();
}
