package com.prg.java8;

interface DefaultImpl{
    public default void message(){
        System.out.println("Default method used");
    }

    public void add(int a, int b);
}


public class Program_12 {

    public static void main(String[] args) {
        DefaultImpl d=(a,b)-> System.out.println(a+b);
        d.add(12,28);
        d.message();

    }
}
