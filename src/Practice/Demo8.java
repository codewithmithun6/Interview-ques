package Practice;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// WAP in java8 to print duplicate from the given string
// String str = "abbcdc", output : bc
public class Demo8 {
    public static void main(String[] args) {

        String str = "abbcdc";

        str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()>1)
                .map(Map.Entry::getKey).forEach(System.out::print);

    }
}
