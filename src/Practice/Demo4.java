package Practice;


//        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

//        Output : 98,15
public class Demo4 {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        Set<Integer> result = myList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toSet());

        System.out.println(result);
        System.out.println("result.........");


        HashMap<Integer,Integer> hm = new HashMap<>();
        for(Integer i:myList){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }else {
                hm.put(i,1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entrySet = hm.entrySet();
        for(Map.Entry<Integer,Integer> entry:entrySet){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }


    }


}
