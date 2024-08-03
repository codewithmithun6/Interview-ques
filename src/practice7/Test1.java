package practice7;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        String str = "abcdedea"; // first non repeating char output:b

        Character result = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(s -> s.getValue() == 1).map(Map.Entry::getKey).findFirst().orElseThrow();
        System.out.println(result);


    }
}
