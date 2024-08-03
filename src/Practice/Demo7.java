package Practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Demo7 {
    public static void main(String[] args) {
        String[] input = {"ab", "def", "a", "ac"};
//        Output:
//        ab -> 2
//        def -> 3
//        a -> 1
//        ac -> 2
        Arrays.stream(input).collect(Collectors.toMap(s->s,String::length)).forEach((s,l)-> System.out.println(s+" : "+l));
    }
}
