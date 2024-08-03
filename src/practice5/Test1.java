package practice5;

import java.util.function.Function;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {

        String str = "mithunkumar";

        str.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((c,count)-> System.out.println(c+":  "+count));
    }
}
