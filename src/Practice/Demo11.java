package Practice;
// first repeated character
import java.util.*;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Demo11 {
    public static void main(String[] args) {

        // find first repeated character
        String inputString = "Java Concept Of The Day";
        System.out.println("Find first repeated character");
        String result = Arrays.stream(inputString.split("")).map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).findFirst().get();
        System.out.println(result); //output: a
        //First non repeated character
        System.out.println("First non repeated character");

        String result1 = Arrays.stream(inputString.split("")).map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()==1).map(Map.Entry::getKey).findFirst().get();

        System.out.println(result1); // output: j
//How do you find the most repeated element in an array?
        System.out.println("How do you find the most repeated element in an array?");

        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

        Map.Entry<String, Long> result2 = listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(result2.getKey()+" : "+result2.getValue());

        //Reverse an integer array
        System.out.println("Reverse an integer array");
        int[] arr ={5, 1, 7, 3, 9, 6};
        int[] result3 = IntStream.range(0, arr.length).map(i -> arr[arr.length - 1 - i]).toArray();
        System.out.println(Arrays.toString(result3));

        System.out.println("How do you merge two unsorted arrays into single sorted array without duplicates?");

        int[] a =  {4, 2, 5, 1};
        int[] b = {8, 1, 9, 5};
        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(c));

        System.out.println("How do you find frequency of each character in a string using Java 8 streams?");
        String inputString1 = "Java Concept Of The Day";
        Map<Character, Long> charCountMap = inputString1.chars().mapToObj(c1 -> (char) c1).map(Character::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new, Collectors.counting()));
        System.out.println(charCountMap);

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);


//        List<Integer> result = listOfIntegers.stream().distinct().sorted((a,b)->Integer.compare(b,a)).skip(1).findFirst();
//        System.out.println();




    }
}
