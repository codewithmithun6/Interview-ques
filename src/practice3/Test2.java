package practice3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {


        List<String> list = Arrays.asList("abcdefg", "sgsh", "gshs", "jsks", "hhs");

        // output: abcdefg, find out max length of the string

        String res = list.stream().max((s1, s2) -> s1.length() - s2.length()).orElse(null);
        System.out.println(res);




    }
}
