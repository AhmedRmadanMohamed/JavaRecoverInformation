package Streams.IntermediateOperations;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        UseMapFunction().forEach(System.out::println);
//        System.out.println("--------------------------------");
//        System.out.println();
//        UseMapStrings().forEach(System.out::println);
//        System.out.println("--------------------------------");
//        System.out.println();
//        UseMapIntegers().forEach(System.out::println);
//        int Sum = UseMapToInt("String");
//        System.out.println(Sum);
//        double v = UseMapToDouble(1000);
//        System.out.println(v);
//        List<List<Integer>> nested = List.of(List.of(1, 2), List.of(3), List.of(4, 5, 6));
//        nested.forEach(System.out::println);
//        nested.stream().flatMap(List::stream).forEach(System.out::println);
//        UseFlatMap().forEach(System.out::println);
//
//        UseFlatMapIntegersFilter().forEach(System.out::println);


        int Number1 = 10;
        int Number2 = 20;
        IntStream numbers = Stream.of(Number1, Number1).flatMapToInt(IntStream::of);
        numbers.forEach(System.out::println);

    }
}
