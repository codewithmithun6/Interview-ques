package practice6;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {

//        HashMap<Integer, String> hm = new HashMap<>();
//        hm.put(1,"one");
//        hm.put(2,"Two");
//        hm.put(3,"Three");


//        hm.forEach((k,v)->System.out.println(k+" -->"+v));


//        Set<Map.Entry<Integer, String>> entries = hm.entrySet();
//
//        for(Map.Entry<Integer, String> entry: entries){
//
//            System.out.println(entry.getKey()+"==>"+entry.getValue());
//        }

        List<Integer> list1 = Arrays.asList(2, 3, 4, 2, 2, 3, 1, 1, 8);

        list1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + "==>" + v));


        HashMap<Integer, Integer> hm = new HashMap<>();


        for (Integer l : list1) {

            if (hm.containsKey(l)) {
                hm.put(l, hm.get(l));
            } else {
                hm.put(l, 1);
            }


        }
    }
}
