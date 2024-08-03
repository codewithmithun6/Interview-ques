package Practice;

import java.util.stream.Stream;

public class Demo12 {
    public static void main(String[] args) {
        Stream<Integer> streamIterated = Stream.iterate(10, n -> n + 3).limit(20);
        streamIterated.forEach(System.out::println);
    }
}
