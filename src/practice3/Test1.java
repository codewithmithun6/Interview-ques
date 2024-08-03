package practice3;


import java.util.List;
import java.util.stream.Collectors;

//Find the count of repetitive character in given string using java8 features.
//
//        String name ="abcdedde";
//        Expected Output - d:3, e:2
public class Test1 {
    public static void main(String[] args) {

        String name ="abcdedde";

        name.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1).forEach(e-> System.out.println(e.getKey()+": "+e.getValue()));


    }
}
