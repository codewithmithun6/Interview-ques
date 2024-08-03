package practice1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// find out second highest from the given array List.
public class Demo3 {
    public static void main(String[] args) {

        List<String> str = Arrays.asList("2","3","6","1");

        String s = str.stream().sorted(Comparator.reverseOrder()).toList().stream().skip(1).findFirst().orElseThrow();
        System.out.println(s);

//        List<Integer> list1 = Arrays.asList(2,3,6,1);
//
//        Integer result = list1.stream().sorted(Comparator.reverseOrder()).toList().stream().skip(1).findFirst().orElseThrow();
//        System.out.println(result);

    }
}
