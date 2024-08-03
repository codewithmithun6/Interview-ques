package practice7;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class Test5 {
    public static void main(String[] args) {

//        Stream<String> fruits = Stream.of("apple", "banana", "orange");
//        List<String> results = fruits.collect(Collectors.toList());
//        System.out.println(results);

//        Stack<Integer> stack = new Stack<>();

        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        int index = 2;

        String results = IntStream.range(0, fruits.size()).filter(i -> i == index).mapToObj(fruits::get).findFirst().orElseThrow();
        System.out.println(results);

//        System.out.println(fruits.get(2));




    }
}
