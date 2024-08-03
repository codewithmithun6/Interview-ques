package Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo13 {
    public static void main(String[] args) {
        String str = "abcbacbbdfdfe";

        str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((char1,count)-> System.out.println(char1+" : "+count));

        String[] input = {"abc","z","xywq","ad"};
        Arrays.stream(input).collect(Collectors.toMap(s->s,String::length))
                .forEach((c,l)-> System.out.println(c+" : "+l));

        // find first duplicate element from given array
        int[] arr = {3,4,8,2,1,6,4}; // output:4
        Set<Integer> hSet = new HashSet<>();

        int res = Arrays.stream(arr).filter(n -> !hSet.add(n))
                .findFirst()
                .orElse(-1);
        System.out.println(res);

    }
}
