package com.prg.java8;

interface Adder {
    public void add(int a, int b);
}

public class Program_9 {

    public static void main(String[] args) {

        Adder addition = (a, b) -> System.out.println(a + b);
        addition.add(12, 12);
    }
}
