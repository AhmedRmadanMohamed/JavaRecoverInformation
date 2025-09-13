package Streams.IntermediateOperations;

import static Streams.IntermediateOperations.StreamsIntermediateOperations.*;

public class Main {
    public static void main(String[] args) {
        UseMapFunction().forEach(System.out::println);
        System.out.println("--------------------------------");
        System.out.println();
        UseMapStrings().forEach(System.out::println);

        System.out.println("--------------------------------");
        System.out.println();
        UseMapIntegers().forEach(System.out::println);


    }
}
