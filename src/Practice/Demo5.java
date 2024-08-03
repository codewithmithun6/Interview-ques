package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo5 {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(3, 2, 4, 5, 5, 5, 2, 1, 1, 6);

        Map<Integer, Long> result = list1.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(result);

    }
}
