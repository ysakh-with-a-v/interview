package com.interview.preparation.java;

import com.interview.preparation.spring.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApi {

    public static void main(String arg[]){


//        String s= "Vysakh";
//
//        System.out.println(s.chars().mapToObj(c -> (char)c).collect(Collectors.toList()).stream());

        Employee e1= new Employee("Male");
        Employee e2= new Employee("Male");
        Employee e3= new Employee("Female");
        Employee e4= new Employee("Femaleeeee");
        
        List <Employee> employeeList = Arrays.asList(e1,e2,e3,e4);




        employeeList.stream().
                filter(employee -> employee.getGender()=="Male").forEach(e->System.out.println(e.getGender()));

        Optional<Employee> e= employeeList.stream().max(Comparator.comparing(employee -> employee.getGender().length()));

        System.out.println(e.get().getGender());

    }
}
