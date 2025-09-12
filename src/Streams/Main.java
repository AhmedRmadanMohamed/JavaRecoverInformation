package Streams;

import java.util.stream.Stream;

import static Streams.StreamsClass.listForStream;

public class Main {
    public static void main(String[] args) {
//    Source-----> listForStream().parallelStream().
//     Intermediate --->   filter(lit -> lit > 2).distinct().
//     Terminal ---->            forEach(System.out::println);

        // this laze mode not working  Alone put need Terminal Mode for work
        listForStream().stream().filter(n -> {
            System.out.println("n is " + n);
            return n % 2 == 0;
        });


        // this After use Terminal mode  now its working
        listForStream().stream().filter(n -> {
            System.out.println("n is " + n);
            return n % 2 == 0;
        }).toList();


        //One Shot Working --> i can use  object of stream only one logic
        Stream<Integer> stream = listForStream().stream();
        stream.toList().forEach(System.out::println);
        System.out.println("------------------------");
        // have Exception ----> stream has already been operated upon or closed
//        stream.toList().forEach(System.out::println);

        // if need use again this stream use new Object example

        Stream<Integer> stream2 = listForStream().stream();
        System.out.println("Now not have any error on stream");
        stream2.forEach(System.out::println);

    }
}
