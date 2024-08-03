package practice6;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test6 {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(13, 22, 14, 12, 11, 54, 65, 96, 42);// 13 12 11

//        List<Integer> result = list1.stream().sorted().collect(Collectors.toList());
//
//        System.out.println(result);

        List<Integer> result1 = list1.stream().filter(i -> i.toString().startsWith("1")).collect(Collectors.toList());
        System.out.println(result1);

        List<String> str = Arrays.asList("ABC", "asd", "dfr", "edc", "azw");
        List<String> collect = str.stream().filter(s -> s.startsWith("A") || s.startsWith("a")).collect(Collectors.toList());
        System.out.println(collect);

        System.out.println("---------------------------------------------");

        String s1 = "saheinojumithun";

        // find out vowel
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        s1.chars().mapToObj(c->(char)c).filter(vowels::contains).toList().forEach(System.out::print);
        System.out.println();

        System.out.println("Print consonant");


        s1.chars().mapToObj(c->(char)c).filter(c->Character.isLetter(c) && !vowels.contains(c)).toList().forEach(System.out::print);
        System.out.println();

        int[] arr = {2,3,1,4,6};

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
