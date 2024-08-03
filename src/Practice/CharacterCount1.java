package Practice;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount1 {
    public static void main(String[] args) {
        String input = "AABCCCA"; // Output: A2B1C3A1

//        String res = input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet().stream().map(e -> e.getKey() + "" + e.getValue()).collect(Collectors.joining());
//        System.out.println(res); // output: A3B1C3

        String res = input.codePoints().mapToObj(c -> String.valueOf(Character.toChars(c)))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().map(e -> e.getKey() + e.getValue()).collect(Collectors.joining());
        System.out.println(res);


    }
}
