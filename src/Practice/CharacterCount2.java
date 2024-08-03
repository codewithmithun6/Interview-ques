package Practice;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount2 {

    public static String compressString(String input) {
        Map<String, Long> charCount = input.codePoints()
                .mapToObj(c -> String.valueOf(Character.toChars(c)))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return charCount.entrySet().stream()
                .map(entry -> entry.getKey() + "" + entry.getValue())
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String input = "AАВСССА";
        String result = compressString(input);
        System.out.println("Output: " + result);
    }


}

