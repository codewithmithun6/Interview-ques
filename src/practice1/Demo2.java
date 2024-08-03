package practice1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Demo2 {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89); // output 75


//        int result =  listOfIntegers.stream().distinct().sorted((a, b) -> Integer.compare(b, a)).skip(1).findFirst().orElseThrow(()-> new IllegalStateException("Array is empty or only one element"));
//        System.out.println(result);

        Integer secondHighestNum = listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(-1);
        System.out.println(secondHighestNum);
    }
}
