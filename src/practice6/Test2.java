package practice6;

import java.util.*;
import java.util.stream.Collectors;


public class Test2 {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(2, 3, 1, 7, 5, 4, 9, 8);

        Integer result = list1.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElseThrow();
//        System.out.println(result);

        // list of student have id name, totalMarks

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1,"ABC",80));


        students.stream()
                .map(t->new Student(t.getId(),t.getName(),t.getTotalMarks()+20))
                .forEach(System.out::println);


       // Employee table dept






    }
}
