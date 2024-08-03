package Practice;

import java.util.*;
import java.util.stream.Collectors;

public class Demo9 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> hSet = new HashSet<>();

        myList.stream().filter(n->!hSet.add(n)).forEach(System.out::println);

        //Given the list of integers, find the first element of the list using Stream functions?
        System.out.println("------------------");
        myList.stream().findFirst().ifPresent(System.out::println);

        //Given a list of integers, sort all the values present in it in descending order using Stream functions?

        System.out.println("sorted in ASC order..");
        myList.stream().sorted().forEach(System.out::println);

        System.out.println("sorted in DESC order..");
        myList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
    }
}
