package com.prg.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Program_5 {

    public static void main(String[] args) {

        //Anonymous class implementation
        List<String> lists = Arrays.asList("Apple", "Banana", "PineApple", "Kiwi");
        lists.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(" "+s+"\n");
            }
        });
        //using lambda expression we are changing the code.
        System.out.println("We are displaying the list of fruits using Lambda expressions");
        lists.forEach(e-> System.out.print(" "+e+"\n"));

        //To gain the better readability we will use the Method Reference in Java8.
        System.out.println("To gain the better readability we are using Method reference in java8");
        //some of the similar uses using java Method references we were used in 3 different ways
        // 1) static Method reference
        // 2) constructor Method reference.
        // 3) instance Method reference.
        lists.forEach(System.out::println);

    }
}
