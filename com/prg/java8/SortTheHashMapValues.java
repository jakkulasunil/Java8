package com.prg.java8;

import java.util.HashMap;

import static java.util.Map.Entry.comparingByValue;

public class SortTheHashMapValues {

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Java", 2);
        hashMap.put("Hibernate", 1);
        hashMap.put("C", 4);
        hashMap.put("SpringBoot",6);
        hashMap.put("Spring", 5);
        hashMap.put("Microservices", 3);


        hashMap.entrySet().stream().sorted(comparingByValue()).forEach(System.out::println);

    }
}
