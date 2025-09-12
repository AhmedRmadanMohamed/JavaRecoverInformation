package Streams;

import java.util.ArrayList;
import java.util.List;

public class StreamsClass {
    public static List<Integer> listForStream() {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        return list;
    }


}
