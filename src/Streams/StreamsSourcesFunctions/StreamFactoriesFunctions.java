package Streams.StreamsSourcesFunctions;

import java.util.stream.Stream;

public class StreamFactoriesFunctions {


    public static Stream<String> getStreamOfUsePram(String stream) {
        return Stream.of(stream);
    }


    public static Stream<Integer> streamOfUseMorePram(int Number1, int Number2, int Number3, int Number4, int Number5) {

        return Stream.of(Number1, Number2, Number3, Number4, Number5);
    }

    public static Stream<Double> streamUseGenerate() {

        return Stream.generate(Math::random).limit(10);
    }

    public static Stream<Integer> streamUseIterate(int start, int end, int step) {

        return Stream.iterate(start, i -> i + end).limit(step);
    }

    public static Stream<Integer> streamUseIterateUseCondemnation(int start, int stop, int counter) {

        return Stream.iterate(start, i -> i <= stop, i -> i + counter);
    }


    public static Stream<String> StreamUseBuilder(String FirstName, String LastName, String PhoneNumber) {

        return Stream.<String>builder().add(FirstName).add(LastName).add(PhoneNumber).build();
    }

    public static Stream<Integer> StreamUseConcat(Stream<Integer> List1, Stream<Integer> List2) {


        return Stream.concat(List1, List2);
    }

}
