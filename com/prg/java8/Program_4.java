package com.prg.java8;

import java.util.ArrayList;
import java.util.List;

//Using for loop we iterating the values in the list.
public class Program_4 {

    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("A");
        lists.add("B");
        lists.add("C");
        //basic for loop to iterate the values
        System.out.println("Basic for loop To Iterate the values");
        int i = 0;
        for (i = 0; i < lists.size(); i++) {
            System.out.print(" "+lists.get(i)+"\n");
        }
        System.out.println("Using for Each Loop to iterate the values");
        for(String string:lists){
            System.out.print(" "+string+"\n");
        }
        System.out.println("ForEach Loop using Lambda expression");
        lists.stream().forEach(System.out::println);
        //Here forEach is default Method in the iterable interface
    }
}
