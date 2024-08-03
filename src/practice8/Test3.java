package practice8;

//Employee
//
//        employee id, name, salary, dept
//
//        find out salary and dept name of employee groupby dept

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "ABC", 300, "HR dept"),
                new Employee(2, "ABC", 200, "HR dept"),
                new Employee(3, "ABC", 500, "MG dept"),
                new Employee(4, "ABC", 100, "HR dept")
        );

        Map<String, Double>  totalSalaryDept = employees.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.summingDouble(Employee::getSalary)));

        totalSalaryDept.forEach((dept,totalSalary)-> System.out.println("Department:"+dept+" Total salary:" +totalSalary));



    }
}
