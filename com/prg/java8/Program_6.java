package com.prg.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Program_6 {
  private static List<Employee> lists=null;

    public Program_6(){
                lists= Arrays.asList(new Employee(101,"Sunil",32,"sunil11@gmail.com",60000.0f),
                new Employee(103,"Bhanu",35,"bhanu76@gmail.com",56000.0f),
                new Employee(105,"Vasu",33,"vasu56@gmail.com",68000.0f),
                new Employee(104,"Chandan",31,"chandan23@gmail.com",58000.0f),
                new Employee(102,"Nishant",34,"nishanth12@gmail.com",67000.0f));
    }

    public static List<Employee> getSalaryFilter(List<Employee> filterBySalary,double filterSalary){
        List<Employee> salaryFilter= filterBySalary.stream().filter(f->f.getSalary()>filterSalary).collect(Collectors.toList());
       return salaryFilter;
    }

    public static void main(String[] args) {
        List<Employee> emp=getSalaryFilter(new Program_6().lists,65000.0f);
        emp.forEach(System.out::println);



    }
}
