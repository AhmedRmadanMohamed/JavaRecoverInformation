package Streams.IntermediateOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    public static int UseMapToInt(String input) {

        return Stream.of(input).mapToInt(String::length).sum();
    }


    public static Double UseMapToDouble(int input) {
        return Stream.of(input).mapToDouble(Integer::doubleValue).sum();
    }


    public static List<Integer> UseFlatMap() {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(i * 10);
            list2.add(i * i);
        }
        System.out.println("Out FlatMap List1: " + list1);
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println();
        System.out.println("Out FlatMap list2: " + list2);

        return Stream.of(list1, list2).flatMap(List::stream).collect(Collectors.toList());
    }


    public static List<Integer> UseFlatMapIntegersFilter() {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(i * 10);
            list2.add(i * i);
        }
        System.out.println("Out FlatMap List1: " + list1);
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println();
        System.out.println("Out FlatMap list2: " + list2);
        System.out.println();
        return Stream.of(list1, list2).flatMap(List::stream).filter(A -> A > 10).distinct().collect(Collectors.toList());
    }
}