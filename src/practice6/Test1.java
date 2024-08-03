package practice6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 3, 4, 1, 7,8,2,9,0,1,4,8,2 );


        // output :min: 0
        // output :max: 9

//        list.stream().sorted().forEach(System.out::println);
//        System.out.println("-------------------------------------");
//        list.stream().sorted((a,b)-> b.compareTo(a)).forEach(System.out::println);

//        list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//                .entrySet().stream().filter(e->e.getValue()>1)
//                .map(Map.Entry::getKey).forEach((k)-> System.out.println(k));
    // find occurrence of the given list
        list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k,v)-> System.out.println(k+"--> "+v));

    // find duplicate of the given string
//        String str = "madam";


//        str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(e->e, Collectors.counting()))
//                .entrySet().stream().filter(c->c.getValue()>1).map(Map.Entry::getKey).forEach(c-> System.out.println(c));

        // find max and min of the give list
//        Optional<Integer> minVal = list.stream().min(Integer::compareTo);
//
//        if(minVal.isPresent()){
//            System.out.println("Min value: "+minVal.get());
//        }else {
//            System.out.println("not present");
//        }

        Optional<Integer> maxVal = list.stream().max(Integer::compareTo);

        if(maxVal.isPresent()){
            System.out.println("Max value: "+maxVal.get());
        }else {
            System.out.println("not present in the list");
        }


    }
}
