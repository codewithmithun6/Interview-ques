package Practice;
//Java Program to sort the elements of an array in ascending order
//        i/p = 5,2,8,7,1
//        o/p = 1,2,5,7,8

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(5, 2, 8, 7, 1);
        List<Integer> result1 = list1.stream().sorted().collect(Collectors.toList());
        System.out.println(result1);

        System.out.println("Descending order");

        List<Integer> result2 = list1.stream().sorted((e1,e2)->e2-e1).collect(Collectors.toList());
        System.out.println(result2);


    }
}
