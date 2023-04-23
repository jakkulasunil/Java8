package com.prg.java8;

import java.util.HashMap;
import java.util.Map;

public class Program_2 {

    public static void main(String[] args) {

        Map<String,String> map=new HashMap<>();
        map.put("PM","Prime Minister");
        map.put("CM","Chief Minister");
        //Before Java we used to iterate the key value pairs from Hash Map
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }
        //After Java8 it is easier to iterate the values.
        System.out.println("We are iterating the HashMap values using java Java8");
        map.forEach((key,value)->System.out.println(key+" - "+value));

    }
}
