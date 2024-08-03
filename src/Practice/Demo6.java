package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo6 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Rohith", "Ankit", "Dinesh", "Haharah");
        // output: Ankit=0, Rohith=2, Dinesh=1, Harahah=3

        list.stream().map(s -> {
            long count = s.chars().filter(c -> c == 'H' || c == 'h').count();
            return s + " = " + count;
        }).collect(Collectors.toList()).forEach(e-> System.out.print(e+" "));

    }
}
