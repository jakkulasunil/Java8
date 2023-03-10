package com.prg.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Program_6 {
  private static List<Employee> lists=null;

    public Program_6() {
        lists = Arrays.asList(new Employee(101, "Sunil", 32, "sunil11@gmail.com", 60000.0f),
                new Employee(103, "Bhanu", 35, "bhanu76@gmail.com", 56000.0f),
                new Employee(105, "Vasu", 33, "vasu56@gmail.com", 68000.0f),
                new Employee(104, "Chandan", 31, "chandan23@gmail.com", 58000.0f),
                new Employee(102, "Nishant", 34, "nishanth12@gmail.com", 67000.0f),
                new Employee(106, "Shiva", 33, "shiva123@gmail.com", 65000.0f));
    }

    public static List<Employee> getSalaryFilter(List<Employee> filterBySalary,double filterSalary){
        return filterBySalary.stream().filter(f->f.getSalary()>filterSalary).collect(Collectors.toList());
    }

    public static Employee findByName(List<Employee> filterByName, String name) {
        return filterByName.stream().filter(e -> name.equals(e.getName())).findAny().orElse(null);
    }

    public static void sorting(){
        Collections.sort(lists,Comparator.comparing(Employee::getName));
        System.out.println(lists);
    }

    public static void sumOfSalaries(List<Employee> employee){
        Double d=employee.stream().collect(Collectors.averagingDouble(e->e.getSalary())).doubleValue();
        System.out.println(d);
    }


    public static void main(String[] args) {
        List<Employee> emp=getSalaryFilter(new Program_6().lists,65000.0f);
        emp.forEach(System.out::println);
        System.out.println("Filtering the values by names");
        Employee e=findByName(new Program_6().lists,"Bhanu");
        System.out.println(e);
        System.out.println("After sorting with names");
        sorting();
        System.out.println("Print all employee salaries");
        System.out.println("Average Salaries of employees");
        sumOfSalaries(new Program_6().lists);


    }
}
