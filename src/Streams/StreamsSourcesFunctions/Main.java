package Streams.StreamsSourcesFunctions;


import static Streams.StreamsSourcesFunctions.StreamFactoriesFunctions.*;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("-----------------getStreamOfUsePram------------------------");
        getStreamOfUsePram("Name").forEach(System.out::println);
        System.out.println();
        System.out.println("-----------------streamOfUseMorePram------------------------");
        streamOfUseMorePram(1, 2, 3, 4, 5).forEach(System.out::println);
        System.out.println();
        System.out.println("-------------------streamUseGenerate------------------------");
        streamUseGenerate().forEach(System.out::println);
        System.out.println();
        System.out.println("-------------------streamUseIterate------------------------");
        streamUseIterate(1, 4, 10).forEach(System.out::println);
        System.out.println();
        System.out.println("-----------streamUseIterateUseCondemnation-------------------");
        streamUseIterateUseCondemnation(0, 10, 2).forEach(System.out::println);
        System.out.println();
        System.out.println("--------------------StreamUseBuilder--------------------------");
        StreamUseBuilder("FirstName", "LastName", "010000000000").forEach(System.out::println);
        System.out.println();
        System.out.println("------------------StreamUseConcat-------------------------------");
        StreamUseConcat(streamUseIterate(1, 4, 10), streamUseIterateUseCondemnation(0, 10, 10))
                .forEach(System.out::println);


    }
}
