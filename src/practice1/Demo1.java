package practice1;


import java.util.*;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {

        String str = "this is my java 8 test"; // find all non-repeatable character

//        List<Character> result = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()))
//                .entrySet().stream().filter(c -> c.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
//        System.out.println(result);


//        List<Character> res = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(e -> e, Collectors.counting()))
//                .entrySet().stream().filter(c -> c.getValue() == 1).map(e -> e.getKey()).collect(Collectors.toList());
//        System.out.println(res);

    }
}
