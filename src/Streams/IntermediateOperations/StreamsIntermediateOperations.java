package Streams.IntermediateOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsIntermediateOperations {


    public static List<Double> UseMapFunction() {
        List<Integer> number = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            number.add(i);
        }
        return number.stream().map(Integer::doubleValue).collect(Collectors.toList());
    }

    public static List<Integer> UseMapIntegers() {
        List<Double> number = new ArrayList<>();
        for (double i = 0; i < 10; i++) {
            number.add(i);
        }
        return number.stream().map(Double::intValue).collect(Collectors.toList());
    }

    public static List<String> UseMapStrings() {
        List<Integer> number = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            number.add(i);
        }
        return number.stream().map(String::valueOf).collect(Collectors.toList());

    }


}